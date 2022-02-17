package com.example.artWeb;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//home controller
@RequestMapping({"/"})
@Controller
public class HomeController {

    @RequestMapping(method = RequestMethod.GET)
    public String homePage(){
        return "home";
    }

}
