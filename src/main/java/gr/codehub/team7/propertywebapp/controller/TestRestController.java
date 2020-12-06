package gr.codehub.team7.propertywebapp.controller;

import gr.codehub.team7.propertywebapp.domain.Owner;
import gr.codehub.team7.propertywebapp.domain.Repair;
import gr.codehub.team7.propertywebapp.service.OwnerService;
import gr.codehub.team7.propertywebapp.service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
public class TestRestController {

    @Autowired
    private OwnerService ownerService;

    @Autowired
    private RepairService repairService;

    @GetMapping("owners")
    public List<Owner> getOwners(){
        return ownerService.getAllOwners();
    }


    @GetMapping("repairs")
    public List<Repair> getBooks(){
        return repairService.findAll();
    }


    @DeleteMapping("repairs/{id}")
    public void deleteRepairById(@PathVariable Long id){
        repairService.deleteRepairById(id);
    }

}
