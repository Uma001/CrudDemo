package com.basicCrudPractice.CrudDemo.dao;

import com.basicCrudPractice.CrudDemo.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IPersonDao {

    boolean addPerson(UUID id, Person person);

    default boolean addPerson(Person person){
        UUID id=UUID.randomUUID();
        return addPerson(id,person);
    }

    List<Person> listAllPeople();

    Optional<Person> selectPersonById(UUID id);

    boolean deletePersonById(UUID id);
    boolean updatePersonById(UUID id, Person person);
}
