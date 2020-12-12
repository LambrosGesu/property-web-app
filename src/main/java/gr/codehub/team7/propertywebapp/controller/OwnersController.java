package gr.codehub.team7.propertywebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OwnersController {

    @GetMapping("create-owner-view")
    public String insertOnwer(){
        return "create-owner-view";
    }
}
