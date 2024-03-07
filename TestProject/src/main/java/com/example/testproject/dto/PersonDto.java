package com.example.TestProject.dto;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PersonDto {

    Long id;
    String name;
    int age;
}
