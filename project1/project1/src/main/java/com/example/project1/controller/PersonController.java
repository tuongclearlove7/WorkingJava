package com.example.project1.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@Controller
public class PersonController {

    @GetMapping("/persons/create")
    public String create(Model model) {

        System.out.println("hello");
        return "person/create";
    }
}
