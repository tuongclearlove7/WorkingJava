package com.example.TestProject.service;

import com.example.TestProject.dto.PersonDto;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface PersonService {

    List<PersonDto> findAllPersons();

    void savePersonsToDatabase(MultipartFile file);
}

