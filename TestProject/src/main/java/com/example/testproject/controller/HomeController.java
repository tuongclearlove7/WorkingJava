package com.example.TestProject.controller;

import com.example.TestProject.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

    private PersonService personService;
    @GetMapping("/")
    public String index(Model model) {

        System.out.println("hello");

        return "home/index";
    }

    @GetMapping("/persons/create")
    public String create(Model model) {

        return "person/create";
    }
}
