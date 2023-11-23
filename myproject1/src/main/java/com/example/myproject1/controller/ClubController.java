package com.example.myproject1.controller;

import com.example.myproject1.dto.ClubDto;
import org.springframework.ui.Model;
import com.example.myproject1.service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ClubController {

    private ClubService clubService;

    @Autowired
    public ClubController(ClubService clubService) {

        this.clubService = clubService;
    }

    @GetMapping("/clubs")
    public String listClubs(Model model){

        List<ClubDto> clubs = clubService.findAllClubs();

        model.addAttribute("clubs", clubs);

        return "club/clubs-list";
    }


}
