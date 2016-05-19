package com.devopslab.controller;


import com.devopslab.domain.Person;
import com.devopslab.domain.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/mongodb")
public class MongodbRestController {

    @Autowired
    PersonRepository personRepo;

    @RequestMapping(value = "/data", method = RequestMethod.GET)
    public String pushData(){

        Person person = new Person();
        person.setFirstName("Juan");
        person.setLastName("Apellido");
        personRepo.save(person);

        return "ok";
    }




}
