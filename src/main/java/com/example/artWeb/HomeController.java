package com.example.artWeb;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping({"/"})
public class HomeController {

    @RequestMapping(method = RequestMethod.GET)
    public String homePage(){
        return "home";
    }

}
