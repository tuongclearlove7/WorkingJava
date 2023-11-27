package com.example.myproject1.controller;

import com.example.myproject1.dto.ClubDto;
import com.example.myproject1.models.Club;
import jakarta.validation.Valid;
import org.springframework.ui.Model;
import com.example.myproject1.service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class ClubController {

    private ClubService clubService;

    @Autowired
    public ClubController(ClubService clubService) {

        this.clubService = clubService;
    }

    @GetMapping("/clubs")
    public String index(Model model){

        List<ClubDto> clubs = clubService.findAllClubs();

        model.addAttribute("clubs", clubs);

        return "club/clubs-list";
    }

    @GetMapping("clubs/search")
    public String search(@RequestParam(value = "query") String query, Model model ){

        List<ClubDto> clubs = clubService.searchClubs(query);

        model.addAttribute("clubs",clubs);

        return "club/clubs-list";
    }

    @GetMapping("/clubs/{id}")
    public String show(@PathVariable("id") long id, Model model){

        ClubDto clubDto = clubService.findClubById(id);

        model.addAttribute("club", clubDto);

        return "club/show";
    }

    @GetMapping("/clubs/create")
    public String create(Model model){

        Club club = new Club();

        model.addAttribute("club", club);

        return "club/create";
    }

    @PostMapping("/clubs/store")
    public String store(@Valid @ModelAttribute("club") ClubDto clubDto, BindingResult res, Model model, RedirectAttributes flashMessage){

        String success = "Create successfully";

        if(res.hasErrors()){

            model.addAttribute("club", clubDto);

            return "club/create";
        }

        try{

            clubService.saveClub(clubDto);
            flashMessage.addFlashAttribute("success", success);

            return "redirect:/clubs";

        }catch (Exception error){

            flashMessage.addFlashAttribute("failed", error);

            return "redirect:/clubs";
        }
    }


    @GetMapping("/clubs/{id}/edit")
    public String edit(@PathVariable("id") Long id, Model model){

        ClubDto clubDto = clubService.findClubById(id);

        model.addAttribute("club", clubDto);

        return "/club/edit";
    }

    @PostMapping("/clubs/{id}/edit")
    public String update(@PathVariable("id") Long id, @Valid @ModelAttribute("club") ClubDto clubDto, BindingResult res, RedirectAttributes flashMessage){

        String success = "Update successfully";

        if(res.hasErrors()){

            return "/club/edit";
        }

        try{

            clubDto.setId(id);

            clubService.updateClub(clubDto);

            flashMessage.addFlashAttribute("success", success);

            return "redirect:/clubs";

        }catch (Exception error){

            flashMessage.addFlashAttribute("failed", error);

            return "redirect:/clubs";
        }

    }

    @GetMapping("clubs/{id}/delete")
    public String delete(@PathVariable("id") Long id, RedirectAttributes flashMessage){

        String success = "Delete successfully";

        try{

            clubService.deleteClub(id);

            flashMessage.addFlashAttribute("success", success);

            return "redirect:/clubs";

        }catch (Exception error){

            flashMessage.addFlashAttribute("failed", error);

            return "redirect:/clubs";
        }

    }


}
