package com.example.myproject1.controller;

import com.example.myproject1.dto.ClubDto;
import com.example.myproject1.dto.EventDto;
import com.example.myproject1.models.Club;
import com.example.myproject1.models.Event;
import com.example.myproject1.models.UserEntity;
import com.example.myproject1.security.SecurityUtil;
import com.example.myproject1.service.ClubService;
import com.example.myproject1.service.EventService;
import com.example.myproject1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Objects;

@Controller
public class EventController {

    private EventService eventService;
    private ClubService clubService;
    private UserService userService;


    @Autowired
    public EventController(EventService eventService, ClubService clubService, UserService userService) {

        this.eventService = eventService;
        this.clubService = clubService;
        this.userService = userService;
    }

    @GetMapping(value = { "/events"})
    public String index(Model model){

        String email = SecurityUtil.getSessionUser();
        List<EventDto> events = eventService.findAllEvents();
        List<ClubDto> clubs = clubService.findAllClubs();
        long view = 10103234;
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        String formattedTime = currentTime.format(formatter);
        UserEntity user = new UserEntity();

        System.out.println("Guest");

        if(email != null){

            user = userService.findByEmail(email);
            model.addAttribute("user", user);
            model.addAttribute("clubs", clubs);
            model.addAttribute("events", events);
            model.addAttribute("admin", "ADMIN");
            model.addAttribute("view", view + " Views");
            model.addAttribute("formattedTime", formattedTime);
            System.out.println("events");

            return "/event/index";

        }else{

            return "redirect:/login";
        }
    }

    @GetMapping(value = {"/events/{id}"})
    public String show(@PathVariable("id") Long id, Model model){

        EventDto eventDto = eventService.findByEventId(id);

        model.addAttribute("event", eventDto);

        return "event/show";
    }


    @GetMapping("/events/create/{clubId}")
    public String create(@PathVariable("clubId") Long clubId, Model model){

        UserEntity user = new UserEntity();
        List<ClubDto> clubs = clubService.findAllClubs();
        String email = SecurityUtil.getSessionUser();

        if(email != null){

            user = userService.findByEmail(email);

            for (ClubDto club : clubs) {

                if (Objects.equals(user.getId(), club.getCreatedBy().getId())) {

                    Event event = new Event();
                    model.addAttribute("clubId", clubId);
                    model.addAttribute("event", event);

                    return "event/create";
                }
            }
        }

        return "redirect:/home";
    }

    @PostMapping("/events/{clubId}")
    public String store(@PathVariable("clubId") Long clubId, @Valid @ModelAttribute("event") EventDto eventDto, Model model , BindingResult res, RedirectAttributes flashMessage){

        String success = "Create event successfully";

        if(res.hasErrors()){

            model.addAttribute("event", eventDto);

            return "event/create";
        }

        try {

            eventService.createEvent(clubId, eventDto);
            flashMessage.addFlashAttribute("success", success);

            return "redirect:/events";
        }
        catch (Exception error)
        {
            flashMessage.addFlashAttribute("failed", error);

            return "redirect:/events";
        }

    }

    @GetMapping("/events/{id}/edit")
    public String edit(@PathVariable("id") Long id, Model model){

        UserEntity user = new UserEntity();
        List<ClubDto> clubs = clubService.findAllClubs();
        String email = SecurityUtil.getSessionUser();

        if(email != null){

            user = userService.findByEmail(email);

            for (ClubDto club : clubs) {

                if (Objects.equals(user.getId(), club.getCreatedBy().getId())) {

                    EventDto eventDto = eventService.findByEventId(id);
                    model.addAttribute("event", eventDto);

                    return "/event/edit";
                }
            }
        }

        return "redirect:/home";
    }

    @PostMapping("/events/{id}/edit")
    public String update(@PathVariable("id") Long id, @Valid @ModelAttribute("event") EventDto event, BindingResult res, RedirectAttributes flashMessage, Model model){

        String success = "Update successfully";

        if(res.hasErrors()){

            model.addAttribute("event", event);

            return "/event/edit";
        }

        try{

            EventDto eventDto = eventService.findByEventId(id);
            eventDto.setId(id);
            eventDto.setClub(eventDto.getClub());
            eventService.updateEvent(event);
            flashMessage.addFlashAttribute("success", success);

            return "redirect:/events";

        }catch (Exception error){

            flashMessage.addFlashAttribute("failed", error);

            return "redirect:/events";
        }

    }


    @GetMapping("events/{id}/delete")
    public String delete(@PathVariable("id") Long id, RedirectAttributes flashMessage){

        String success = "Delete successfully";

        try{

            UserEntity user = new UserEntity();
            List<ClubDto> clubs = clubService.findAllClubs();
            String email = SecurityUtil.getSessionUser();

            if(email != null){

                user = userService.findByEmail(email);

                for (ClubDto club : clubs) {

                    if (Objects.equals(user.getId(), club.getCreatedBy().getId())) {

                        eventService.deleteEvent(id);
                        flashMessage.addFlashAttribute("success", success);

                        return "redirect:/events";

                    }else{

                        flashMessage.addFlashAttribute("notPermission", "You are not permission!");
                    }
                }
            }

            return "redirect:/home";

        }catch (Exception error){

            flashMessage.addFlashAttribute("failed", error);

            return "redirect:/events";
        }
    }
}