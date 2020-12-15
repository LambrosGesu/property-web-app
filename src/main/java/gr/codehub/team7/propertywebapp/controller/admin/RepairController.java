package gr.codehub.team7.propertywebapp.controller.admin;

import gr.codehub.team7.propertywebapp.domain.Repair;
import gr.codehub.team7.propertywebapp.enums.JobType;
import gr.codehub.team7.propertywebapp.enums.Status;
import gr.codehub.team7.propertywebapp.forms.EditRepairForm;
import gr.codehub.team7.propertywebapp.service.OwnerService;
import gr.codehub.team7.propertywebapp.service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.text.DecimalFormat;

@Controller
public class RepairController {

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

    @PostMapping("/repair/create")
    public String createRepairPost(Model model, @ModelAttribute Repair repair){
        repairService.insertRepair(repair);
        return "redirect:/repairs";
    }

    @GetMapping("{id}/editrepair")
    public String editRepair(Model model, @PathVariable Long id){
        model.addAttribute("status",Status.values());
        model.addAttribute("jobTypes",JobType.values());
        model.addAttribute("repair",repairService.findById(id).get());
        model.addAttribute("owners",ownerService.getAllOwners());
        return "editrepair";
    }

    @PostMapping("{id}/editrepair")
    public String editRepair(@ModelAttribute EditRepairForm repair, @PathVariable Long id){

        repairService.updateRepair(repair,id);
        return "redirect:/repairs";
    }
}
