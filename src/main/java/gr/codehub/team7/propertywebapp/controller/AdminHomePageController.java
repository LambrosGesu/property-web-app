package gr.codehub.team7.propertywebapp.controller;

import gr.codehub.team7.propertywebapp.domain.Repair;
import gr.codehub.team7.propertywebapp.service.OwnerService;
import gr.codehub.team7.propertywebapp.service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AdminHomePageController {
    @Autowired
    private OwnerService ownerService;

    @Autowired
    private RepairService repairService;

    @GetMapping("/admin")
    public String hello(Model model) {
        model.addAttribute("repairs",repairService.findFirstTenUninished());
        return "adminhomepage";
    }

    @GetMapping("/repairs")
    public String getRepairs(Model model){
        return "repairs";
    }

    @GetMapping("/owners")
    public String getOwners(Model model){
        model.addAttribute("owners",ownerService.getAllOwners());
        return "showowners";
    }
}
