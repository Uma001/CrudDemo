package com.basicCrudPractice.CrudDemo.dao;

import com.basicCrudPractice.CrudDemo.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("daoImpl1")  //this name will be used when injecting dao interface
public class FakePersonDao implements IPersonDao {

    private static List<Person> people=new ArrayList<>();

    @Override
    public boolean addPerson(UUID id, Person person) {
        people.add(new Person(id,person.getName()));
        return true;
    }

    public List<Person> listAllPeople(){
        return people;
    }

    @Override
    public Optional<Person> selectPersonById(UUID id) {

        return people.stream().filter(peron->peron.getId().equals(id)).findFirst();
    }

    @Override
    public boolean deletePersonById(UUID id) {
        Optional<Person> person=selectPersonById(id);
        if(!person.isPresent()){
            return false;
        }
        people.remove(person.get());
        return true;
    }

    @Override
    public boolean updatePersonById(UUID id, Person update) {

        return selectPersonById(id).
                map(p->{
            int index= people.indexOf(p);
            if(index>=0){
                people.set(index,new Person(id,update.getName()));
                return true;
            }
            return false;
        }).orElse(false);
    }
}
