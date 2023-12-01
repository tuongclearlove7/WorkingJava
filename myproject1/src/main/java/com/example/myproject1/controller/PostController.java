package com.example.myproject1.controller;

import com.example.myproject1.dto.ClubDto;
import com.example.myproject1.dto.EventDto;
import com.example.myproject1.models.Post;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {

    @GetMapping(value = { "posts"})
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
            HttpServletRequest request,
            RedirectAttributes flashMessage
    ) {

        try{

            @SuppressWarnings("unchecked")
            List<Post> posts = (List<Post>) request.getSession().getAttribute("MY_SESSIONS");

            if (posts == null) {

                posts = new ArrayList<>();
                request.getSession().setAttribute("MY_SESSIONS", posts);
            }

            Post post = new Post(msg, status, image);
            posts.add(post);
            request.getSession().setAttribute("MY_SESSIONS", posts);
            flashMessage.addFlashAttribute("success", "Create successfully");

            return "redirect:/posts";

        }catch (Exception error){

            flashMessage.addFlashAttribute("failed", error);

            return "redirect:/posts";
        }

    }


    @PostMapping("/destroy")
    public String destroy(HttpServletRequest request) {

        request.getSession().invalidate();

        return "redirect:/";
    }

    @GetMapping("/delete/post/{index}")
    public String deletePost(@PathVariable int index, HttpSession session, RedirectAttributes flashMessage) {

        try{

            @SuppressWarnings("unchecked")
            List<Post> posts = (List<Post>) session.getAttribute("MY_SESSIONS");

            if (posts != null && index >= 0 && index < posts.size()) {
                posts.remove(index);
                session.setAttribute("MY_SESSIONS", posts);
            }

            flashMessage.addFlashAttribute("success", "Delete successfully");

            return "redirect:/posts";

        }catch (Exception error){

            flashMessage.addFlashAttribute("failed", error);

            return "redirect:/posts";
        }

    }

}
