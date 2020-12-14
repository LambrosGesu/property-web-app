package gr.codehub.team7.propertywebapp.controller.admin;

import gr.codehub.team7.propertywebapp.domain.Owner;
import gr.codehub.team7.propertywebapp.enums.PropertyType;
import gr.codehub.team7.propertywebapp.service.OwnerService;
import gr.codehub.team7.propertywebapp.service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class OwnerController {
    private static final String PROPERTY_TYPE = "propertyType";

    @Autowired
    private OwnerService ownerService;

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

    @GetMapping("{id}/edit-owner")
    public String editOwner(Model model, @PathVariable Long id){

           Optional<Owner> owner= ownerService.findOwnerById(id);
           model.addAttribute("owner",owner.get());
           model.addAttribute(PROPERTY_TYPE,PropertyType.values());
           return "editowner";
    }

    @PostMapping("{id}/edit-owner")
    public  String editOwner(@ModelAttribute Owner owner, @PathVariable Long id){
        //Optional<Owner> ownerId=ownerService.findOwnerBySsn(owner.getSsn());
        ownerService.updateOwner(owner,id);
        return  "redirect:/owners";
    }


}
