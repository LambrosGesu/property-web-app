package gr.codehub.team7.propertywebapp.controller;

import gr.codehub.team7.propertywebapp.domain.Repair;
import gr.codehub.team7.propertywebapp.forms.RepairSearchForm;
import gr.codehub.team7.propertywebapp.service.RepairService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class SearchBookController {
    private static final String REPAIRS_LIST = "repairs";
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private RepairService repairService;

    @GetMapping("/searchRepairs")
    public String searchTest(Model model) {
        model.addAttribute("searchForm", new RepairSearchForm());
        return "pages/searchRepairs";
    }

    @PostMapping("/searchRepairs)
    public String searchTest(@ModelAttribute("searchForm") RepairSearchForm searchForm, Model model) {

        return "pages/searchRepairs";
    }
}
