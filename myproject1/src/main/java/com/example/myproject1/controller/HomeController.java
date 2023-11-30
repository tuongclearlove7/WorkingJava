package com.example.myproject1.controller;

import com.example.myproject1.models.Club;
import com.example.myproject1.models.Post;
import groovyjarjarantlr4.v4.runtime.misc.NotNull;
import jakarta.annotation.Priority;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    private final String COUNT_VIEW = "COUNT_VIEW";

    public HomeController() {

    }

    @GetMapping(value = {"/", "post", "home"})
    public String index(Model model, HttpSession session){
        @SuppressWarnings("unchecked")

        long view = 10103234;
        List<Post> posts = (List<Post>) session.getAttribute("MY_SESSIONS");
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        String formattedTime = currentTime.format(formatter);

        if (posts == null) {

            posts = new ArrayList<>();
        }

        model.addAttribute("posts", posts);
        model.addAttribute("admin", "ADMIN");
        model.addAttribute("view", view + " Views");
        model.addAttribute("formattedTime", formattedTime);

        return "home/index";
    }

    @GetMapping("/post/create")
    public String create(Model model){

        return "home/create";
    }

    @PostMapping("/saveSessionMessage")
    public String store(
            @RequestParam("msg")  String msg,
            @RequestParam("status")  String status,
            @RequestParam("image")  String image,
            HttpServletRequest request
    ) {
        @SuppressWarnings("unchecked")
        List<Post> posts = (List<Post>) request.getSession().getAttribute("MY_SESSIONS");

        if (posts == null) {

            posts = new ArrayList<>();
            request.getSession().setAttribute("MY_SESSIONS", posts);
        }

        Post post = new Post(msg, status, image);
        posts.add(post);
        request.getSession().setAttribute("MY_SESSIONS", posts);

        return "redirect:/";
    }


    @PostMapping("/destroy")
    public String destroy(HttpServletRequest request) {

        request.getSession().invalidate();

        return "redirect:/";
    }


}
