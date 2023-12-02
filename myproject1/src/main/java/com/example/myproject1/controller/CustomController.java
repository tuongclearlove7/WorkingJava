package com.example.myproject1.controller;

import com.example.myproject1.models.Reuse;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CustomController implements ErrorController {


    @RequestMapping("/error")
    public String handleError() {

        return "redirect:/";
    }


}