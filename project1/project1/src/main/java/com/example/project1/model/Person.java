package com.example.project1.model;

import java.io.Serializable;

public class Person implements Serializable {


    String name, address, course_name;
    int age;

    public Person(){

    }

    public Person(String name, String address, String course_name, int age) {
        this.name = name;
        this.address = address;
        this.course_name = course_name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
