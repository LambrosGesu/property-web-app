package gr.codehub.team7.propertywebapp.service;

import gr.codehub.team7.propertywebapp.domain.Owner;
import gr.codehub.team7.propertywebapp.domain.Repair;
import gr.codehub.team7.propertywebapp.enums.Status;
import gr.codehub.team7.propertywebapp.forms.EditRepairForm;
import gr.codehub.team7.propertywebapp.forms.RepairSearchForm;
import gr.codehub.team7.propertywebapp.mappers.RepairFormToRepairMapper;
import gr.codehub.team7.propertywebapp.mappers.RepairToRepairModelMapper;
import gr.codehub.team7.propertywebapp.model.RepairModel;
import gr.codehub.team7.propertywebapp.repository.RepairRepository;
import jdk.swing.interop.SwingInterOpUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.oauth2.client.reactive.ReactiveOAuth2ClientAutoConfiguration;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;


@Service
public class RepairServiceImpl implements RepairService{

    @Autowired
    private RepairRepository repairRepository;

    @Autowired
    private OwnerService ownerService;

    @Autowired
    private RepairFormToRepairMapper repairMapper;

    @Autowired
    private RepairToRepairModelMapper repairModelMapper;

    @Override
    public List<RepairModel> findAll() {
        return repairRepository
                .findAll()
                .stream()
                .map(repair -> repairModelMapper.map(repair))
                .collect(Collectors.toList());
    }

    @Override
    public List<RepairModel> findFirstTenUnfinished() {

        return repairRepository
                .findAll()
                .stream()
                .map(repair -> repairModelMapper.map(repair))
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
    public Repair insertRepair(Repair repair) {
        return repairRepository.save(repair);
    }

    @Override
    public Repair updateRepair(EditRepairForm repairform, Long id) {
        Owner owner= ownerService.findOwnerBySsn(repairform.getOwner()).get();
        if(repairRepository.findById(id).isPresent()){
            Repair repair=repairMapper.map(repairform,owner);
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
    public List<Repair> findByOwnerId(Long id) {
        Optional<Owner> owner = ownerService.findOwnerById(id);
        if(owner.isPresent())
        {
            return repairRepository.findByOwner(owner.get());
        }
        else{
            return  null;
        }
    }

    @Override
    public List<RepairModel> findBySearchForm(RepairSearchForm form) {
/*
        //// TEEEEEEEEEEEEEESTING
        System.out.println("=------------------------------");
        Set<Repair> searchResultsTest = new HashSet<>();
        //List<Repair> searchResultsTest = new ArrayList<>();
        List<Repair> thenullone = null;
        List<Repair> thefirst = findByRepairDate(LocalDate.of(2020,1,1));
        List<Repair> thesecond = findByOwnerSSN("398135972");
        Set<Repair> tSet ;

        List<Repair>[] al = new ArrayList[3];
        al[1]=thefirst;
        al[2]=thesecond;
        for(List<Repair> l:al){
            if(l!=null){
                tSet = new HashSet<Repair>(l);
                searchResultsTest.addAll(tSet);
                searchResultsTest.retainAll(tSet);
            }
        }
        System.out.println(searchResultsTest);
        System.out.println("=------------------------------");


*/
/*
        //Second try working codee

        Set<Repair> searchResults = new HashSet<>();
        Set<Repair>[] formResults = new HashSet[3];

        if (form.getRepairDate() != "" && form.getRepairDate() != null) {
            formResults[0]= new HashSet<Repair>(findByRepairDate(LocalDate.parse(form.getRepairDate())));
            searchResults.addAll(formResults[0]);
        }
        if (form.getSSN() != "" ) {
            formResults[1]= new HashSet<Repair>(findByOwnerSSN(form.getSSN()));
            searchResults.addAll(formResults[1]);
        }
        if (form.getBetweenDate1() != "" && form.getBetweenDate1()!=null && form.getBetweenDate2()!=null && form.getBetweenDate2() != "") {
            formResults[2]= new HashSet<Repair>(findByRepairDateBetween(LocalDate.parse(form.getBetweenDate1()),LocalDate.parse(form.getBetweenDate2())));
            searchResults.addAll(formResults[2]);
        }

        for(Set<Repair> l:formResults){
            if(l!=null){
                searchResults.retainAll(l);
            }
        }
*/
/*
        //thrid try working codee
        List<Repair> searchResults = new ArrayList<>();
        List<Repair>[] formResults = new ArrayList[3];

        if (form.getRepairDate() != "" && form.getRepairDate() != null) {
            formResults[0] = findByRepairDate(LocalDate.parse(form.getRepairDate()));
            searchResults.addAll(formResults[0]);
        }
        if (form.getSSN() != "" && form.getRepairDate() != null ) {
            formResults[1]= findByOwnerSSN(form.getSSN());
            System.out.println(formResults[1]);
            searchResults.addAll(formResults[1]);
        }
        if (form.getBetweenDate1() != "" && form.getBetweenDate1()!=null && form.getBetweenDate2()!=null && form.getBetweenDate2() != "") {
            formResults[2]= findByRepairDateBetween(LocalDate.parse(form.getBetweenDate1()),LocalDate.parse(form.getBetweenDate2()));
            searchResults.addAll(formResults[2]);
        }

        for(List<Repair>l:formResults){
            if(l!=null){
                searchResults.retainAll(l);
            }
        }
        List<Repair> searchResultsDist = searchResults.stream().distinct().collect(Collectors.toList());
        if(searchResults.size() == searchResultsDist.size() ){
            return searchResults.stream()
                    .map(repair -> repairModelMapper.map(repair))
                    .collect(Collectors.toList());
        }
        else{
            return searchResultsDist
                    .stream()
                    .map(repair -> repairModelMapper.map(repair))
                    .collect(Collectors.toList());
        }
    }*/

//working codeee

        List<Repair> searchResults = null;

        if (form.getRepairDate() != "" && form.getRepairDate() != null) {
            searchResults = findByRepairDate(LocalDate.parse(form.getRepairDate()));
        }
        if (form.getSSN() != "") {
            if (searchResults != null) {
                searchResults.retainAll(findByOwnerSSN(form.getSSN()));
            } else {
                searchResults = findByOwnerSSN(form.getSSN());
            }
        }
        if (form.getBetweenDate1() != "" && form.getBetweenDate1() != null && form.getBetweenDate2() != null && form.getBetweenDate2() != "") {
            if (searchResults != null) {
                searchResults.retainAll(findByRepairDateBetween(LocalDate.parse(form.getBetweenDate1()), LocalDate.parse(form.getBetweenDate2())));
            } else {
                searchResults = findByRepairDateBetween(LocalDate.parse(form.getBetweenDate1()), LocalDate.parse(form.getBetweenDate2()));
            }
        }

        if (searchResults != null) {
            return searchResults.stream()
                    .map(repair -> repairModelMapper.map(repair))
                    .collect(Collectors.toList());
        } else {
            return Collections.emptyList();
        }
    }

    @Override
    public void deleteRepairById(Long id) {
        repairRepository.deleteById(id);
    }


}
