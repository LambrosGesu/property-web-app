package gr.codehub.team7.propertywebapp.controller.admin;

import gr.codehub.team7.propertywebapp.domain.Owner;
import gr.codehub.team7.propertywebapp.domain.Repair;
import gr.codehub.team7.propertywebapp.enums.JobType;
import gr.codehub.team7.propertywebapp.enums.Status;
import gr.codehub.team7.propertywebapp.forms.EditRepairForm;
import gr.codehub.team7.propertywebapp.forms.RepairForm;
import gr.codehub.team7.propertywebapp.forms.RepairSearchForm;
import gr.codehub.team7.propertywebapp.mappers.OwnerToOwnerModelMapper;
import gr.codehub.team7.propertywebapp.model.OwnerModel;
import gr.codehub.team7.propertywebapp.model.RepairModel;
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
import org.springframework.web.bind.annotation.RequestMapping;

import javax.swing.text.html.Option;
import javax.validation.Valid;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("admin")
public class RepairController {
    private static final String REPAIRS_LIST = "repairs";
    private static final String REPAIRS_FORM = "add-repair";
    public static final String ERROR_MESSAGE = "errorMessage";

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
            model.addAttribute(ERROR_MESSAGE, "an error occurred");
            return "pages/createrepair";
        }
        repairService.insertRepair(repairForm);
        return "redirect:/admin/repairs";
    }

    @GetMapping("/repairs/search")
    public String searchRepairs(Model model) {
        return "pages/searchRepairs";
    }

    @PostMapping("/repairs/search")
    public String returnRepairs(@ModelAttribute("repairSearchForm") RepairSearchForm repairSearchForm, Model model) {
        List<RepairModel> results = repairService.findBySearchForm(repairSearchForm);
        model.addAttribute("postflag",1);
        if(!results.isEmpty()){model.addAttribute(REPAIRS_LIST,results);}
        return "pages/searchRepairs";
    }


    @GetMapping("{id}/editrepair")
    public String editRepair(Model model, @PathVariable Long id){
        model.addAttribute("status",Status.values());
        model.addAttribute("jobTypes",JobType.values());
        model.addAttribute("repair",repairService.findById(id).get());
        model.addAttribute("owners",ownerService.getAllOwners());
        return "pages/editrepair";
    }

    @PostMapping("/editrepair")
    public String editRepair(@ModelAttribute EditRepairForm repair){
        repairService.updateRepair(repair,Long.parseLong(repair.getId()));
        return "redirect:/admin/repairs";
    }

    @PostMapping("/repair/{id}/delete")
    public  String deleteRepair(@PathVariable Long id){
        repairService.deleteRepairById(id);
        return "redirect:/admin/repairs";
    }
}
