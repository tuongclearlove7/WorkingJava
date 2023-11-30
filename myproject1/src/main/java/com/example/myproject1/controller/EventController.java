package com.example.myproject1.controller;

import com.example.myproject1.dto.EventDto;
import com.example.myproject1.models.Event;
import com.example.myproject1.service.EventService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class EventController {

    private EventService eventService;

    @Autowired
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }


    @GetMapping("/events/create/{clubId}")
    public String create(@PathVariable("clubId") Long clubId, Model model){

        Event event = new Event();
        model.addAttribute("clubId", clubId);
        model.addAttribute("event", event);

        return "event/create";
    }

    @PostMapping("/events/{clubId}")
    public String store(@PathVariable("clubId") Long clubId, @ModelAttribute("event") EventDto eventDto, Model model , BindingResult res, RedirectAttributes flashMessage){

        String success = "Create event successfully";

        //        if(res.hasErrors()){
        //
        //            model.addAttribute("event", eventDto);
        //
        //            return "redirect:/events/create/" + clubId;
        //
        //        }

        try {

            eventService.createEvent(clubId, eventDto);

            flashMessage.addFlashAttribute("success", success);

            return "redirect:/clubs";
        }
        catch (Exception error)
        {
            flashMessage.addFlashAttribute("failed", error);

            return "redirect:/clubs";
        }

    }


}
