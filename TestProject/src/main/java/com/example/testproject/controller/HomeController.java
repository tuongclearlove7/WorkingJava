package com.example.TestProject.controller;

import com.example.TestProject.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Map;


@Controller
@AllArgsConstructor

public class HomeController {

    private PersonService personService;

    @GetMapping("/")
    public String index(Model model) {

        System.out.println("hello");

        return "home/index";
    }


}
