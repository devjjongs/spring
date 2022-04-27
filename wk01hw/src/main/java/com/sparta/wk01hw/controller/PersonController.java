package com.sparta.wk01hw.controller;

import com.sparta.wk01hw.domain.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @GetMapping("/myinfo")
    public Person getPerson() {
        Person person = new Person();

        person.setName("종석");
        person.setAge(30);
        person.setAddress("서울특별시");
        person.setEmail("jjong@sparta.com");

        return person;
    }
}
