package com.example.myproject1.controller;

import com.example.myproject1.dto.ClubDto;
import com.example.myproject1.dto.EventDto;
import com.example.myproject1.models.Club;
import com.example.myproject1.models.Post;
import com.example.myproject1.models.Reuse;
import com.example.myproject1.service.ClubService;
import com.example.myproject1.service.EventService;
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

@Controller
public class HomeController {

    private EventService eventService;
    private ClubService clubService;

    @Autowired
    public HomeController(EventService eventService, ClubService clubService) {
        this.eventService = eventService;
        this.clubService = clubService;
    }

    @GetMapping(value = {"/", "home"})
    public String index(Model model, HttpSession session){
        @SuppressWarnings("unchecked")

        long view = 10103234;
        List<EventDto> events = eventService.findAllEvents();
        List<ClubDto> clubs = clubService.findAllClubs();
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        String formattedTime = currentTime.format(formatter);
        List<Reuse> reuses = new ArrayList<>();

        reuses.add(new Reuse(
                "CLUB","/clubs","List club","",""
        ));
        reuses.add(new Reuse(
                "EVENT","/events","List event","",""
        ));

        System.out.println("Number of reuses: " + reuses.size());

        model.addAttribute("clubs", clubs);
        model.addAttribute("events", events);
        model.addAttribute("admin", "ADMIN");
        model.addAttribute("view", view + " Views");
        model.addAttribute("formattedTime", formattedTime);

        return "event/index";
    }




}
