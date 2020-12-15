package gr.codehub.team7.propertywebapp.controller.admin;

import gr.codehub.team7.propertywebapp.domain.Repair;
import gr.codehub.team7.propertywebapp.enums.JobType;
import gr.codehub.team7.propertywebapp.enums.Status;
import gr.codehub.team7.propertywebapp.forms.RepairSearchForm;
import gr.codehub.team7.propertywebapp.service.OwnerService;
import gr.codehub.team7.propertywebapp.service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RepairController {
    private static final String REPAIRS_LIST = "repairs";
    @Autowired
    private RepairService repairService;

    @Autowired
    private OwnerService ownerService;

    @GetMapping("/repairs")
    public String getRepairs(Model model){
        model.addAttribute("repairs", repairService.findAll());
        return "showrepairs";
    }

    @GetMapping("/repair/create")
    public String createRepair(Model model){
        model.addAttribute("owners",ownerService.getAllOwners());
        model.addAttribute("status", Status.values());
        model.addAttribute("jobTypes", JobType.values());
        return "createrepair";
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

    @PostMapping("/repair/create")
    public String createRepairPost(Model model, @ModelAttribute Repair repair){
        repairService.insertRepair(repair);
        return "redirect:/repairs";
    }
}
