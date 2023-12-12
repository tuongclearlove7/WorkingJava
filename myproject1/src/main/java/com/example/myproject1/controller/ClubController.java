package com.example.myproject1.controller;

import com.example.myproject1.dto.ClubDto;
import com.example.myproject1.models.Club;
import com.example.myproject1.models.Event;
import com.example.myproject1.models.UserEntity;
import com.example.myproject1.security.SecurityUtil;
import com.example.myproject1.service.UserService;
import org.springframework.ui.Model;
import com.example.myproject1.service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.security.Principal;
import java.util.List;
import java.util.Objects;

@Controller
public class ClubController {

    private ClubService clubService;
    private UserService userService;

    @Autowired
    public ClubController(ClubService clubService, UserService userService) {

        this.clubService = clubService;
        this.userService = userService;
    }

    @GetMapping("/clubs")
    public String index(Model model){

        UserEntity user = new UserEntity();
        List<ClubDto> clubs = clubService.findAllClubs();
        String email = SecurityUtil.getSessionUser();

        if(email != null){

            user = userService.findByEmail(email);
            model.addAttribute("user", user);
        }

        model.addAttribute("user", user);
        model.addAttribute("clubs", clubs);

        return "club/clubs-list";
    }


    @GetMapping("/clubs/{id}")
    public String show(@PathVariable("id") Long id, Model model){

        UserEntity user = new UserEntity();
        ClubDto clubDto = clubService.findClubById(id);
        String email = SecurityUtil.getSessionUser();

        if(email != null){

            user = userService.findByEmail(email);
            model.addAttribute("user", user);
        }

        model.addAttribute("user", user);
        model.addAttribute("club", clubDto);

        return "club/show";
    }

    @GetMapping("/clubs/create")
    public String create(Model model, Principal principal){

        UserEntity user = new UserEntity();
        List<ClubDto> clubs = clubService.findAllClubs();
        String email = SecurityUtil.getSessionUser();

        if(principal != null){

            if(email != null){

                user = userService.findByEmail(email);

                for (ClubDto clubItem : clubs) {

                    if (Objects.equals(user.getId(), clubItem.getCreatedBy().getId())) {

                        Club club = new Club();
                        model.addAttribute("club", club);

                        return "club/create";
                    }
                }
            }
        }

        return "redirect:/home";
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
    public String edit(@PathVariable("id") Long id, Model model, Principal principal){

        UserEntity user = new UserEntity();
        List<ClubDto> clubs = clubService.findAllClubs();
        String email = SecurityUtil.getSessionUser();

        if(principal != null){

            if(email != null){

                user = userService.findByEmail(email);

                for (ClubDto club : clubs) {

                    if (Objects.equals(user.getId(), club.getCreatedBy().getId())) {

                        ClubDto clubDto = clubService.findClubById(id);
                        model.addAttribute("club", clubDto);

                        return "/club/edit";
                    }
                }
            }
        }

        return "redirect:/home";
    }

    @PostMapping("/clubs/{id}/edit")
    public String update(@PathVariable("id") Long id, @Valid @ModelAttribute("club") ClubDto clubDto, BindingResult res, RedirectAttributes flashMessage, Model model){

        String success = "Update successfully";

        if(res.hasErrors()){

            model.addAttribute("club", clubDto);

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
    public String delete(@PathVariable("id") Long id, RedirectAttributes flashMessage, Principal principal){

        String success = "Delete successfully";
        UserEntity user = new UserEntity();
        List<ClubDto> clubs = clubService.findAllClubs();
        String email = SecurityUtil.getSessionUser();

        try{

            if(principal != null){

                if(email != null){

                    user = userService.findByEmail(email);

                    for (ClubDto club : clubs) {

                        if (Objects.equals(user.getId(), club.getCreatedBy().getId())) {

                            clubService.deleteClub(id);
                            flashMessage.addFlashAttribute("success", success);

                            return "redirect:/clubs";

                        }else{

                            flashMessage.addFlashAttribute("notPermission", "You are not permission!");
                        }
                    }
                }
            }

            return "redirect:/home";

        }catch (Exception error){

            flashMessage.addFlashAttribute("failed", error);

            return "redirect:/clubs";
        }
    }

    @GetMapping("clubs/search")
    public String search(@RequestParam(value = "query") String query, Model model,RedirectAttributes flashMessage ){

        try{

            List<ClubDto> clubs = clubService.searchClubs(query);
            model.addAttribute("clubs",clubs);

            return "club/clubs-list";

        }catch (Exception error){

            flashMessage.addFlashAttribute("failed", error);

            return "club/clubs-list";
        }
    }



}
