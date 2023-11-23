package com.example.myproject1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    public HomeController() {

    }

    @GetMapping("/")
    public String index(Model model){

        model.addAttribute("club", "CLUB");

        return "home/index";
    }
}
