package gr.codehub.team7.propertywebapp.controller.error;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ErrorController {

    @GetMapping("/error/deny_error")
    public String denyController(Model model){
        return "error/deny";
    }
}
