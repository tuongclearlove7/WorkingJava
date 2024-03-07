/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.project1.controller;

import com.example.project1.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author clearlove7
 */
@Controller

public class HomeController {
    
    @GetMapping("/")
    public String index(Model model){
        

        List<Person> persons = new ArrayList<>();

        for (int i=0; i<10; i++){
            persons.add(new Person(
                    "TuongClearlove" + (i+1),
                    "58 Chon Tam 10 Lien Chieu Da Nang",
                    "Spring Boot Java",
                    21
                )
            );
        }

        model.addAttribute("hello","HELLO WORLD");
        model.addAttribute("welcome","WELCOME TO HOME");
        model.addAttribute("msg","This is home page!!!");
        model.addAttribute("persons", persons);
        model.addAttribute("index", 0);

        return "home/index";
    }
    
    
}
