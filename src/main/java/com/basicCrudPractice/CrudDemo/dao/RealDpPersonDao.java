package com.basicCrudPractice.CrudDemo.dao;


import com.basicCrudPractice.CrudDemo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("dbDaoImpl")
public class RealDpPersonDao implements IPersonDao {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public RealDpPersonDao(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate=jdbcTemplate;
    }

    @Override
    public boolean addPerson(UUID id, Person person) {
        return false;
    }

    @Override
    public List<Person> listAllPeople() {
        final String sqlQuery="SELECT id,name FROM person";
        return  jdbcTemplate.query(sqlQuery, (resultSet,i)->{
            UUID id= UUID.fromString(resultSet.getString("id"));
            String name=resultSet.getString("name");
            return new Person(id,name);
        });
    }

    @Override
    public Optional<Person> selectPersonById(UUID id) {
        return Optional.empty();
    }

    @Override
    public boolean deletePersonById(UUID id) {
        return false;
    }

    @Override
    public boolean updatePersonById(UUID id, Person person) {
        return false;
    }
}
