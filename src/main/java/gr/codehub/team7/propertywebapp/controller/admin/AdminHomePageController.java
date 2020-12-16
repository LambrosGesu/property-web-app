package gr.codehub.team7.propertywebapp.controller.admin;

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

}
