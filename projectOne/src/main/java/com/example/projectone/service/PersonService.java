package com.example.projectone.service;

import com.example.projectone.dto.PersonDto;
import com.example.projectone.models.Person;

import java.util.List;

public interface PersonService {

    List<PersonDto> findAllPersons();

}
