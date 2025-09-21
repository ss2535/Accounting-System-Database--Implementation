package com.account4.account4.service;

import com.account4.account4.model.Person;
import com.account4.account4.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public List<Person> findAll() {
        return personRepository.findAll();
    }

    public Person save(Person person) {
        return personRepository.save(person);
    }
    public Person findById(Long id) {
        return personRepository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        personRepository.deleteById(id);
    }
}