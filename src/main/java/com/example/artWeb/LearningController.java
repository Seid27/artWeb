package com.example.artWeb;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/learning")
@Controller
public class LearningController {
    @RequestMapping(method = RequestMethod.GET)
    public String learningPage(Model model){
        model.addAttribute("viewName", "learning_pg");
        return "learning_pg";
    }
}
