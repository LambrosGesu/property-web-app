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
        System.out.println("didi it? ------------------------");
        System.out.println("didi it? ------------------------");
        return "redirect:/owners";
    }

    @PostMapping("/owner/{id}/delete")
    public  String deleteOwner(@PathVariable Long id){
        ownerService.deleteOwnerById(id);
        return "redirect:/owners";
    }
}
