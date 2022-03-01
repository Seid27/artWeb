package com.example.artWeb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/aboutus")
@Controller
public class AboutUsController {
    @RequestMapping(method = RequestMethod.GET)
    public String aboutusPage(Model model){
        model.addAttribute("viewName", "aboutUs");
        return "aboutUs";
    }
}
