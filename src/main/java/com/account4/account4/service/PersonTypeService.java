package com.account4.account4.service;

import com.account4.account4.model.PersonType;
import com.account4.account4.repository.PersonTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonTypeService {

    @Autowired
    private PersonTypeRepository personTypeRepository;

    public List<PersonType> findAll() {
        return personTypeRepository.findAll();
    }

    public PersonType save(PersonType personType) {
        return personTypeRepository.save(personType);
    }

    public PersonType findById(Long id) {
        return personTypeRepository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        personTypeRepository.deleteById(id);
    }
}