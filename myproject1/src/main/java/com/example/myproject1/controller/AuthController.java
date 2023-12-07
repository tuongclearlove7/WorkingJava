package com.example.myproject1.controller;

import com.example.myproject1.dto.RegistrationDto;
import com.example.myproject1.models.UserEntity;
import com.example.myproject1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class AuthController {

    private UserService userService;

    @Autowired
    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public String login(){

        return "auth/login";
    }


    @GetMapping("/register")
    public String register(Model model){

        RegistrationDto user = new RegistrationDto();
        model.addAttribute("user", user);

        return "auth/register";
    }

    @PostMapping("/register/save")
    public String register(@Valid @ModelAttribute("user") RegistrationDto user, BindingResult res, Model model){

        UserEntity existingUserEmail = userService.findByEmail(user.getEmail());
        UserEntity existingUserUsername = userService.findByUsername(user.getUsername());

        if(existingUserEmail != null && existingUserEmail.getEmail() != null
                && !existingUserEmail.getEmail().isEmpty()){

            //res.rejectValue("email", "There is alread a user with this email/username");
            return "redirect:/register?fail";
        }

        if(existingUserUsername != null && existingUserUsername.getUsername() != null
                && !existingUserUsername.getUsername().isEmpty()){

            //res.rejectValue("username", "There is alread a user with this email/username");
            return "redirect:/register?fail";
        }

        if(res.hasErrors()){

            model.addAttribute("user", user);

            return "auth/register";
        }

        userService.saveUser(user);

        return "redirect:/register?success";
    }



}
