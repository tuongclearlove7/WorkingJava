package com.example.TestProject.controller;

import com.example.TestProject.dto.PersonDto;
import com.example.TestProject.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@AllArgsConstructor
public class DisplayPersonController {

    private PersonService personService;


    @GetMapping("/persons")
    public String index(Model model) {

        List<PersonDto> personDtos = personService.findAllPersons();

        model.addAttribute("persons", personDtos);

        return "person/index";
    }

    @GetMapping("/persons/create")
    public String create(Model model) {

        System.out.println("Load person create!");
        return "person/create";
    }

    @PostMapping("/upload-persons-data-by-display")
    public String uploadPeronsData(@RequestParam("file") MultipartFile file, RedirectAttributes flashMessage){

        if (file.isEmpty()) {

            flashMessage.addFlashAttribute("isEmpty", "Upload file, Please!");
            System.out.println("Upload file, Please!");

            return "redirect:/persons/create";
        }

        try{
            this.personService.savePersonsToDatabase(file);
            flashMessage.addFlashAttribute("success", "Insert data successfully");

            return "redirect:/persons";
        }catch (Exception error){

            flashMessage.addFlashAttribute("failed", error);

            return "redirect:/persons/create";
        }
    }


}
