package com.basicCrudPractice.CrudDemo.api;

import com.basicCrudPractice.CrudDemo.model.Person;
import com.basicCrudPractice.CrudDemo.service.PersonService;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RequestMapping("app/")
@RestController
public class PersonController {


    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping("add")
        public void addPerson(@Valid @NonNull @RequestBody Person person){
        personService.addPerson(person);
    }

    @GetMapping("listAll")
    public List<Person> getAllPeople(){
        return personService.getAllPeople();
    }

    @GetMapping(path="{id}")
    public Person getPersonById(@PathVariable("id") UUID id){
        return personService.selectPersonById(id).orElse(null); //you can add custom comparator as well
    }

    @DeleteMapping(path="{id}")
    public boolean deletePersonById(@PathVariable("id") UUID id){
        return personService.deletePersonById(id);
    }

    @PutMapping(path="{id}")
    public boolean updatePersonById(
            @PathVariable("id") UUID id,
            @Valid @NonNull @RequestBody Person person){
        return personService.updatePersonById(id,person);
    }

}
