package gr.codehub.team7.propertywebapp.controller;

import gr.codehub.team7.propertywebapp.domain.Owner;
import gr.codehub.team7.propertywebapp.service.OwnerService;
import gr.codehub.team7.propertywebapp.service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserHomePageController {

    @Autowired
    private OwnerService ownerService;

    @Autowired
    private RepairService repairService;

    @GetMapping("{id}/user")
    public String hello(Model model, @PathVariable Long id){
        model.addAttribute("repairs", repairService.findByOwnerId(id));
        return "userhomepage";

    }

    @GetMapping("{id}/info")
    public  String information(Model model, @PathVariable Long id){
        model.addAttribute("owner",ownerService.findOwnerById(id).get());
        return "ownerinfo";

    }

    @GetMapping("{id}/repairs")
    public String getRepairs(Model model, @PathVariable Long id){
        model.addAttribute("repairs", repairService.findByOwnerId(id));
        return "showrepairs";
    }

}
