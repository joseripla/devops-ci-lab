package com.devopslab.test;


import com.devopslab.Application;

import com.devopslab.domain.Person;
import com.devopslab.domain.PersonRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertThat;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration( classes = Application.class)
public class PersonRepositoryTests {

  //  @Autowired
  //  PersonRepository repository;

    @Test
    public void readsFirstPageCorrectly() {

     //   Page<Person> persons = (Page<Person>) repository.findAll();

    }
}