package com.example.artWeb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/services")
@Controller
public class ServicesController {
    @RequestMapping(method = RequestMethod.GET)
    public String servicesPage(Model model){
        model.addAttribute("viewName", "services_pg");
        return "services_pg";
    }
}
