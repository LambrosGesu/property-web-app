package gr.codehub.team7.propertywebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestMVCController {
    //private final Logger Log = (Logger) LoggerFactory.getLogger(this.getClass());
    @GetMapping("/linktoshowrepairs")
    public String hello(Model model) {
        model.addAttribute("sidebarid",1);
        return "homepageTest";
    }



}
