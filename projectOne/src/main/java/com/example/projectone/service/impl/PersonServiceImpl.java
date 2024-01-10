package com.example.projectone.service.impl;

import com.example.projectone.dto.PersonDto;
import com.example.projectone.mapper.PersonMapper;
import com.example.projectone.models.Person;
import com.example.projectone.repository.PersonRepository;
import com.example.projectone.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonServiceImpl(PersonRepository personRepository) {

        this.personRepository = personRepository;
    }



    @Override
    public List<PersonDto> findAllPersons() {

        List<Person> persons = personRepository.findAll();

        return persons.stream().map(PersonMapper::mapToPersonDto).collect(Collectors.toList());
    }
}
