package gr.codehub.team7.propertywebapp.controller.admin;

import gr.codehub.team7.propertywebapp.enums.PropertyType;
import gr.codehub.team7.propertywebapp.forms.OwnerEditForm;
import gr.codehub.team7.propertywebapp.forms.OwnerForm;
import gr.codehub.team7.propertywebapp.forms.SearchOwnerForm;
import gr.codehub.team7.propertywebapp.model.OwnerModel;
import gr.codehub.team7.propertywebapp.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Controller
@RequestMapping("admin")
public class OwnerController {
    private static final String PROPERTY_TYPE = "propertyType";

    @Autowired
    private OwnerService ownerService;

    @GetMapping("/owners")
    public String getOwners(Model model){
        model.addAttribute("owners",ownerService.getAllOwners());
        return "pages/showowners";
    }

    @GetMapping("/owner/create")
    public String createOwner(Model model){
        model.addAttribute("ownerForm",new OwnerForm());
        model.addAttribute(PROPERTY_TYPE, PropertyType.values());
        return "pages/createowner";
    }

    @PostMapping("/owner/create")
    public String createOwnerPost(Model model, @Valid @ModelAttribute OwnerForm ownerForm, BindingResult bindingResult, RedirectAttributes redirectAttributes){

        if (bindingResult.hasErrors()) {
            //have some error handling here, perhaps add extra error messages to the model
            model.addAttribute("errors", "an error occurred");
            return "pages/createowner";
        }

        if(Optional.ofNullable(ownerService.insertOwner(ownerForm)).isEmpty()){
            redirectAttributes.addFlashAttribute("ssnErrorFlag", 1);
            return "redirect:/admin/owner/create";
        }
        ownerService.insertOwner(ownerForm);

        return "redirect:/admin/owners";
    }

    @GetMapping("{id}/edit-owner")
    public String editOwner(Model model, @PathVariable Long id){
           model.addAttribute("ownerForm",new OwnerEditForm());
           model.addAttribute("owner",ownerService.findOwnerById(id).get());
           model.addAttribute(PROPERTY_TYPE,PropertyType.values());
           return "pages/editowner";
    }

    @PostMapping("/edit-owner")
    public  String editOwner(Model model, @Valid @ModelAttribute OwnerEditForm ownerForm, BindingResult bindingResult,RedirectAttributes redirectAttributes){
        Optional<OwnerModel> ownerId=ownerService.findOwnerById(Long.parseLong(ownerForm.getId()));
        if (bindingResult.hasErrors()) {
            //have some error handling here, perhaps add extra error messages to the model
            model.addAttribute("errors", "an error occurred");
            return "pages/editowner";
        }
        if(Optional.ofNullable(ownerService.updateOwner(ownerForm,ownerId.get().getId())).isEmpty()){
            redirectAttributes.addFlashAttribute("ssnErrorFlag", 1);
            model.addAttribute("ownerForm",new OwnerEditForm());
            model.addAttribute("owner",ownerService.findOwnerById(ownerId.get().getId()).get());
            model.addAttribute(PROPERTY_TYPE,PropertyType.values());

            return  "redirect:/admin/"+ownerId.get().getId()+"/edit-owner";
        }

        ownerService.updateOwner(ownerForm,ownerId.get().getId());

        return  "redirect:/admin/owners";
    }



    @PostMapping("/owner/{id}/delete")
    public  String deleteOwner(@PathVariable Long id){
        ownerService.deleteOwnerById(id);
        return "redirect:/admin/owners";
    }

    @GetMapping("/searchOwner")
    public String searchOwner(Model model){
        model.addAttribute("searchOwnerForm", new SearchOwnerForm());
        return "pages/searchowner";
    }
    @PostMapping("/searchOwner")
    public String searchOwner(@ModelAttribute("searchOwnerForm") SearchOwnerForm owner, Model model){
        List<OwnerModel> owners = ownerService.findOwnerBySsnOrEmail(owner.getSsn(), owner.getEmail());
        if (owners.isEmpty()){
            model.addAttribute("message", "generic.no-results");
        }
        else{
            model.addAttribute("owners", owners.stream().distinct().collect(Collectors.toList()));
        }
        return "pages/searchowner";
    }
}
