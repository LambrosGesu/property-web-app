package gr.codehub.team7.propertywebapp.controller;

import gr.codehub.team7.propertywebapp.domain.Owner;
import gr.codehub.team7.propertywebapp.domain.Repair;
import gr.codehub.team7.propertywebapp.service.OwnerService;
import gr.codehub.team7.propertywebapp.service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("insertowner")
    public Owner insertOwner(@RequestBody Owner owner){
        return ownerService.insertOwner(owner);
    }

    @PutMapping("updateowner/{id}")
    public Owner updateOwner(@RequestBody Owner owner, @PathVariable Long id) {

        return ownerService.updateOwner(owner, id);
    }

    @PostMapping("insertrepair")
    public Repair insertRepair(@RequestBody Repair repair){

        return repairService.insertRepair(repair);
    }

    @PutMapping("updaterepair/{id}")
    public Repair updateRepair(@RequestBody Repair repair, @PathVariable Long id){
        return repairService.updateRepair(repair,id);
    }

}
