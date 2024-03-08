package com.example.TestProject.service.impl;

import com.example.TestProject.dto.PersonDto;
import com.example.TestProject.mapper.PersonMapper;
import com.example.TestProject.model.Person;
import com.example.TestProject.repository.PersonRepository;
import com.example.TestProject.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;


    @Override
    public List<PersonDto> findAllPersons() {

        List<Person> persons = personRepository.findAll();

        return persons.stream().map(PersonMapper::mapToPersonDto).collect(Collectors.toList());
    }

    @Override
    public void savePersonsToDatabase(MultipartFile file){

        if(ExcelUploadService.isValidExcelFile(file)){
            try {

                List<Person> persons = ExcelUploadService.getPersonsDataFromExcel(file.getInputStream());
                this.personRepository.saveAll(persons);
                System.out.println("Insert data successfully");

            } catch (IOException e) {

                System.out.println("Error save !");
                throw new IllegalArgumentException(e);
            }
        }
    }
}
