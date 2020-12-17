package gr.codehub.team7.propertywebapp.controller.admin;

import gr.codehub.team7.propertywebapp.domain.Repair;
import gr.codehub.team7.propertywebapp.enums.JobType;
import gr.codehub.team7.propertywebapp.enums.Status;
import gr.codehub.team7.propertywebapp.forms.EditRepairForm;
import gr.codehub.team7.propertywebapp.forms.RepairForm;
import gr.codehub.team7.propertywebapp.forms.RepairSearchForm;
import gr.codehub.team7.propertywebapp.service.OwnerService;
import gr.codehub.team7.propertywebapp.service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class RepairController {
    private static final String REPAIRS_LIST = "repairs";
    private static final String REPAIRS_FORM = "add-repair";

    @Autowired
    private RepairService repairService;

    @Autowired
    private OwnerService ownerService;

    @GetMapping("/repairs")
    public String getRepairs(Model model){
        model.addAttribute("repairs", repairService.findAll());
        return "pages/showrepairs";
    }

    @GetMapping("/repair/create")
    public String createRepair(Model model){
//        model.addAttribute("owners",ownerService.getAllOwners());
//        model.addAttribute("status", Status.values());
//        model.addAttribute("jobTypes", JobType.values());
        model.addAttribute(REPAIRS_FORM, new RepairForm());
        model.addAttribute("owners",ownerService.getAllOwners());
        model.addAttribute("status", Status.values());
        model.addAttribute("jobTypes", JobType.values());
        return "pages/createrepair";
    }

    @PostMapping("/repair/create")
    public String createRepairPost(Model model, @Valid @ModelAttribute(REPAIRS_FORM) RepairForm repairForm,
                                   BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "pages/createrepair";
        }
        repairService.insertRepair(repairForm);
        return "redirect:/repairs";
    }

    @GetMapping("/repairs/search")
    public String searchRepairs(Model model) {
        return "pages/searchRepairs";
    }

    @PostMapping("/repairs/search")
    public String returnRepairs(@ModelAttribute("repairSearchForm") RepairSearchForm repairSearchForm, Model model) {
        model.addAttribute(REPAIRS_LIST,repairService.findBySearchForm(repairSearchForm));
        return "pages/searchRepairs";
    }

//    @PostMapping("/repair/create")
//    public String createRepairPost(Model model, @ModelAttribute Repair repair){
//        repairService.insertRepair(repair);
//        return "redirect:/repairs";
//    }

    @GetMapping("{id}/editrepair")
    public String editRepair(Model model, @PathVariable Long id){
        model.addAttribute("status",Status.values());
        model.addAttribute("jobTypes",JobType.values());
        model.addAttribute("repair",repairService.findById(id).get());
        model.addAttribute("owners",ownerService.getAllOwners());
        return "pages/editrepair";
    }

    @PostMapping("{id}/editrepair")
    public String editRepair(@ModelAttribute EditRepairForm repair, @PathVariable Long id){

        repairService.updateRepair(repair,id);
        return "redirect:/repairs";
    }

    @PostMapping("/repair/{id}/delete")
    public  String deleteRepair(@PathVariable Long id){
        repairService.deleteRepairById(id);
        return "redirect:/repairs";
        //for commit
    }
}
