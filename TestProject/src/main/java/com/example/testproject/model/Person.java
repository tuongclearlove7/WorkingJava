package com.example.TestProject.model;

import lombok.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "persons")
public class Person {

    @Id
    @Column(name = "id")
    Long id;
    @Column(name = "name")
    String name;
    @Column(name = "age")
    int age;
}
