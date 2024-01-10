package com.example.projectone.mapper;

import com.example.projectone.dto.PersonDto;
import com.example.projectone.models.Person;
import java.util.stream.Collectors;


public class PersonMapper {

    public static Person mapToPerson(PersonDto person) {

        return Person.builder()
                .id(person.getId())
                .name(person.getName())
                .age(person.getAge())
                .build();
    }

    public static PersonDto mapToPersonDto(Person person) {

        PersonDto personDto = PersonDto.builder()
                .id(person.getId())
                .name(person.getName())
                .age(person.getAge())
                .build();

        if (personDto != null) {

            return personDto;

        } else {

            System.out.println("" + null);

            return null;
        }
    }

}
