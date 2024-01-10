package com.example.projectone.controller;
import com.example.projectone.dto.PersonDto;
import com.example.projectone.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
public class HomeController {

    private PersonService personService;

    @Autowired
    public HomeController(PersonService personService) {

        this.personService = personService;
    }


    @GetMapping("/")
    public List<PersonDto> getAllPersons() {

        return personService.findAllPersons();
    }

}
