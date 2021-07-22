package com.basicCrudPractice.CrudDemo.service;

import com.basicCrudPractice.CrudDemo.dao.IPersonDao;
import com.basicCrudPractice.CrudDemo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PersonService {


    private final IPersonDao personDao;

    @Autowired
    public PersonService(@Qualifier("dbDaoImpl") IPersonDao personDao) {
        this.personDao = personDao;
    }

    public boolean addPerson(Person person){
        return personDao.addPerson(person);
    }

    public List<Person> getAllPeople(){
        return personDao.listAllPeople();
    }

    public Optional<Person> selectPersonById(UUID id){
        return personDao.selectPersonById(id);
    }

    public boolean deletePersonById(UUID id){
        return personDao.deletePersonById(id);
    }
    public boolean updatePersonById(UUID id,Person person){
        return personDao.updatePersonById(id,person);
    }
}
