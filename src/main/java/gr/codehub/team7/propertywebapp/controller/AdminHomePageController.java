package gr.codehub.team7.propertywebapp.controller;

import gr.codehub.team7.propertywebapp.domain.Owner;
import gr.codehub.team7.propertywebapp.domain.Repair;
import gr.codehub.team7.propertywebapp.enums.JobType;
import gr.codehub.team7.propertywebapp.enums.PropertyType;
import gr.codehub.team7.propertywebapp.enums.Status;
import gr.codehub.team7.propertywebapp.service.OwnerService;
import gr.codehub.team7.propertywebapp.service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdminHomePageController {
    private static final String PROPERTY_TYPE = "propertyType";

    @Autowired
    private OwnerService ownerService;

    @Autowired
    private RepairService repairService;

    @GetMapping("/team")
    public String team(Model model) {
        return "team7";
    }

    @GetMapping("/admin")
    public String hello(Model model) {
        model.addAttribute("repairs",repairService.findFirstTenUninished());
        return "adminhomepage";
    }

    @GetMapping("/repairs")
    public String getRepairs(Model model){
        model.addAttribute("repairs", repairService.findAll());
        return "showrepairs";
    }

    @GetMapping("/owners")
    public String getOwners(Model model){
        model.addAttribute("owners",ownerService.getAllOwners());
        return "showowners";
    }

    @GetMapping("/owner/create")
    public String createOwner(Model model){
        model.addAttribute(PROPERTY_TYPE, PropertyType.values());
        return "createowner";
    }

    @PostMapping("/owner/create")
    public String createOwnerPost(Model model, @ModelAttribute Owner owner){
        ownerService.insertOwner(owner);
        return "redirect:/owners";
    }

    @GetMapping("/repair/create")
    public String createRepair(Model model){
        model.addAttribute("owners",ownerService.getAllOwners());
        model.addAttribute("status", Status.values());
        model.addAttribute("jobTypes", JobType.values());
        return "createrepair";
    }

    @PostMapping("/repair/create")
    public String createRepairPost(Model model, @ModelAttribute Repair repair){
        repairService.insertRepair(repair);
        return "redirect:/repairs";
    }


}
