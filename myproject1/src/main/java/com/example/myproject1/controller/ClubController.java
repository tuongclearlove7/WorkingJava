package com.example.myproject1.controller;

import com.example.myproject1.dto.ClubDto;
import com.example.myproject1.models.Club;
import org.springframework.ui.Model;
import com.example.myproject1.service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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

    @GetMapping("/clubs/create")
    public String createClub(Model model){

        Club club = new Club();

        model.addAttribute("club", club);

        return "club/create";
    }

    @PostMapping("/clubs/create")
    public String saveClub(@ModelAttribute("club") Club club){

        clubService.saveClub(club);

        return "redirect:/clubs";
    }


    @GetMapping("/clubs/{id}/edit")
    public String editClub(@PathVariable("id") Long id, Model model){


        ClubDto clubDto = clubService.findClubById(id);

        model.addAttribute("club", clubDto);

        return "/club/edit";
    }

    @PostMapping("/clubs/{id}/edit")
    public String updateClub(@PathVariable("id") Long id, @ModelAttribute("club") ClubDto clubDto){

        clubDto.setId(id);

        clubService.updateClub(clubDto);

        return "redirect:/clubs";
    }


}
