package com.example.myproject1.controller;

import com.example.myproject1.dto.ClubDto;
import com.example.myproject1.dto.EventDto;
import com.example.myproject1.models.Club;
import com.example.myproject1.models.Post;
import com.example.myproject1.models.Reuse;
import com.example.myproject1.models.UserEntity;
import com.example.myproject1.security.SecurityUtil;
import com.example.myproject1.service.ClubService;
import com.example.myproject1.service.EventService;
import com.example.myproject1.service.UserService;
import groovyjarjarantlr4.v4.runtime.misc.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.security.Principal;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Controller
public class HomeController {

    private EventService eventService;
    private ClubService clubService;
    private UserService userService;

    @Autowired
    public HomeController(EventService eventService, ClubService clubService, UserService userService) {

        this.eventService = eventService;
        this.clubService = clubService;
        this.userService = userService;
    }

    @GetMapping(value = {"/", "home"})
    public String index(Model model, HttpSession session, Principal principal){

        long view = 10103234;
        List<EventDto> events = eventService.findAllEvents();
        List<ClubDto> clubs = clubService.findAllClubs();
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        String formattedTime = currentTime.format(formatter);
        UserEntity user = new UserEntity();
        String email = SecurityUtil.getSessionUser();

        System.out.println("Guest");

        if(principal != null){

            if(email != null){

                user = userService.findByEmail(email);
                System.out.println(email);

                model.addAttribute("user", user);
                model.addAttribute("clubs", clubs);
                model.addAttribute("events", events);
                model.addAttribute("email", email);
                model.addAttribute("view", view + " Views");
                model.addAttribute("formattedTime", formattedTime);

                return "event/index";
            }
        }

        return "redirect:/login";
    }
}
