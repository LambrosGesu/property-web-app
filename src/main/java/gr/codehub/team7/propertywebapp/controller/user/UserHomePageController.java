package gr.codehub.team7.propertywebapp.controller.user;

import gr.codehub.team7.propertywebapp.domain.Owner;
import gr.codehub.team7.propertywebapp.model.OwnerModel;
import gr.codehub.team7.propertywebapp.service.OwnerService;
import gr.codehub.team7.propertywebapp.service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class UserHomePageController {

    @Autowired
    private OwnerService ownerService;

    @Autowired
    private RepairService repairService;

    @GetMapping("/user")
    public String hello(Model model) {
        Optional<OwnerModel> owner = ownerService.findOwnerByEmail(SecurityContextHolder.getContext().getAuthentication().getName());
        model.addAttribute("repairs", repairService.findByOwnerId(owner.get().getId()));
        return "userhomepage";

    }

    @GetMapping("/info")
    public  String information(Model model){
        Optional<OwnerModel> owners = ownerService.findOwnerByEmail(SecurityContextHolder.getContext().getAuthentication().getName());
        model.addAttribute("owner",ownerService.findOwnerById(owners.get().getId()).get());
        return "ownerinfo";

    }

    @GetMapping("/repairs")
    public String getRepairs(Model model){
        Optional<OwnerModel> owner = ownerService.findOwnerByEmail(SecurityContextHolder.getContext().getAuthentication().getName());
        model.addAttribute("repairs", repairService.findByOwnerId(owner.get().getId()));
        return "showrepairs";
    }

}
