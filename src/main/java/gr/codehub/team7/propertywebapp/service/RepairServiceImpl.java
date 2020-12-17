package gr.codehub.team7.propertywebapp.service;

import gr.codehub.team7.propertywebapp.domain.Owner;
import gr.codehub.team7.propertywebapp.domain.Repair;
import gr.codehub.team7.propertywebapp.enums.Status;
import gr.codehub.team7.propertywebapp.forms.EditRepairForm;
import gr.codehub.team7.propertywebapp.forms.RepairForm;
import gr.codehub.team7.propertywebapp.forms.RepairSearchForm;
import gr.codehub.team7.propertywebapp.mappers.RepairFormToRepairMapper;
import gr.codehub.team7.propertywebapp.mappers.RepairFormToRepairMapperCreate;
import gr.codehub.team7.propertywebapp.mappers.RepairToRepairModelMapper;
import gr.codehub.team7.propertywebapp.model.OwnerModel;
import gr.codehub.team7.propertywebapp.model.RepairModel;
import gr.codehub.team7.propertywebapp.repository.OwnerRepository;
import gr.codehub.team7.propertywebapp.repository.RepairRepository;
import jdk.swing.interop.SwingInterOpUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@Service
public class RepairServiceImpl implements RepairService{

    @Autowired
    private RepairRepository repairRepository;

    @Autowired
    private OwnerService ownerService;

    @Autowired
    private OwnerRepository ownerRepository;

    @Autowired
    private RepairFormToRepairMapper repairMapper;

    @Autowired
    private RepairFormToRepairMapperCreate repairMapperCreate;

    @Autowired
    private RepairToRepairModelMapper repairModelMapper;

    @Override
    public List<Repair> findAll() {
        return repairRepository.findAll();
    }

    @Override
    public List<Repair> findFirstTenUninished() {

        return repairRepository.findAll().stream()
                .filter(repair -> !repair.getStatus().equals(Status.FINISHED))
                .sorted(Comparator.comparing(repair-> repair.getRepairDate()))
                .limit(10)
                .collect(Collectors.toList());

    }
    @Override
    public List<Repair> findByRepairDate(LocalDate date) {
        return repairRepository.findByRepairDate(date);
    }

    @Override
    public List<Repair> findByRepairDateBetween(LocalDate date1, LocalDate date2) {
        return repairRepository.findByRepairDateBetween(date1, date2);
    }

    @Override
    public Optional<Repair> findById(Long id) {
        return repairRepository.findById(id);
    }

    @Override
    public RepairModel insertRepair(RepairForm repairForm) {
//        Owner owner=ownerService.findOwnerBySsn(editRepairForm.getOwner()).get();
        Repair repair=repairMapperCreate.map(repairForm);
        Repair newRepair=repairRepository.save(repair);
        return repairModelMapper.map(newRepair);
    }

    @Override
    public Repair updateRepair(EditRepairForm repairform, Long id) {
        Owner owner= ownerRepository.findOwnerBySsn(repairform.getOwner()).get();
        if(repairRepository.findById(id).isPresent()){
            Repair repair=repairMapper.map(repairform,owner);
            repair.setId(id);
            return repairRepository.save(repair);
        }
        return  null; //this needs an exception implementation
    }

    @Override
    public List<Repair> findByOwnerSSN(String SSN) {
        Optional<Owner> owner = ownerRepository.findOwnerBySsn(SSN);
        if(owner.isPresent()){
            return repairRepository.findByOwner(owner.get());
        }
        else{
            return null; //this needs an exception implementation
        }
    }

    @Override
    public List<Repair> findByOwnerId(Long id) {

        Optional<Owner> owner = ownerRepository.findById(id);
        if(owner.isPresent())
        {
            return repairRepository.findByOwner(owner.get());
        }
        else{
            return  null;
        }
    }

    @Override
    public List<Repair> findBySearchForm(RepairSearchForm form) {
        List<Repair> searchResults = null;
        if (form.getRepairDate() != "") {
            searchResults = findByRepairDate(LocalDate.parse(form.getRepairDate()));
        }
        if (form.getSSN() != "") {
            if (searchResults != null) {
                searchResults.retainAll(findByOwnerSSN(form.getSSN()));
            } else {
                searchResults = findByOwnerSSN(form.getSSN());
            }
        }
        if (form.getBetweenDate1() != "" && form.getBetweenDate2() != "") {
            if (searchResults != null) {
                searchResults.retainAll(findByRepairDateBetween(LocalDate.parse(form.getBetweenDate1()), LocalDate.parse(form.getBetweenDate2())));
            } else {
                searchResults = findByOwnerSSN(form.getSSN());
            }
        }
        return searchResults;

    }

    @Override
    public void deleteRepairById(Long id) {
        repairRepository.deleteById(id);
    }


}
