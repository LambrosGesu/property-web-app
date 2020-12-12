package gr.codehub.team7.propertywebapp.service;

import gr.codehub.team7.propertywebapp.domain.Owner;
import gr.codehub.team7.propertywebapp.domain.Repair;
import gr.codehub.team7.propertywebapp.enums.Status;
import gr.codehub.team7.propertywebapp.repository.RepairRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RepairServiceImpl implements RepairService{

    @Autowired
    private RepairRepository repairRepository;
    @Autowired
    private OwnerService ownerService;

    @Override
    public List<Repair> findAll() {
        return repairRepository.findAll();
    }

    @Override
    public List<Repair> findFirstTenUninished() {
        List<Repair> firstTen= repairRepository.findAll();

        List<Repair> repairs= firstTen.stream().sorted(Comparator.comparing(repair-> repair.getRepairDate()))
                .filter(repair -> !repair.getStatus().equals(Status.FINISHED))
                .limit(10)
                     .collect(Collectors.toList());

        return repairs;
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
    public Repair insertRepair(Repair repair) {
        return repairRepository.save(repair);
    }

    @Override
    public Repair updateRepair(Repair repair, Long id) {
        if(repairRepository.findById(id).isPresent()){
            repair.setId(id);
            return repairRepository.save(repair);
        }
        return  null; //this needs an exception implementation
    }

    @Override
    public List<Repair> findByOwnerSSN(String SSN) {
        Optional<Owner> owner = ownerService.findOwnerBySsn(SSN);
        if(owner.isPresent()){
            return repairRepository.findByOwner(owner.get());
        }
        else{
            return null; //this needs an exception implementation
        }
    }

    @Override
    public void deleteRepairById(Long id) {
        repairRepository.deleteById(id);
    }


}
