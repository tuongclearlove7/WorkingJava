package com.example.TestProject.controller;

import com.example.TestProject.dto.PersonDto;
import com.example.TestProject.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

@RestController
@AllArgsConstructor

public class PersonController {

    private PersonService personService;

    @GetMapping("/persons")
    public List<PersonDto> getAllPersons() {

        return personService.findAllPersons();
    }


    @PostMapping("/upload-persons-data")
    public ResponseEntity<?> uploadPeronsData(@RequestParam("file") MultipartFile file){

        this.personService.savePersonsToDatabase(file);
        return ResponseEntity.ok(Map.of("Message" , " Persons data uploaded and saved to database successfully"));
    }

}