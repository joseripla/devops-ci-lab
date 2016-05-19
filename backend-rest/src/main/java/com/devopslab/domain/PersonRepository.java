package com.devopslab.domain;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

//public interface PersonRepository extends MongoRepository<Person, String> {
//@Repository
@RepositoryRestResource(collectionResourceRel = "people", path = "mongodb/people")
public interface PersonRepository extends MongoRepository<Person, String> {
    public Person findByFirstName(String firstName);
    public List<Person> findByLastName(String lastName);

}