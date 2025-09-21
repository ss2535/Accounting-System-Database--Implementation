package com.account4.account4.controller;

import com.account4.account4.model.PersonType;
import com.account4.account4.service.PersonTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/persontypes")
public class PersonTypeController {

    @Autowired
    private PersonTypeService personTypeService;

    @GetMapping
    public List<PersonType> getAllPersonTypes() {
        return personTypeService.findAll();
    }

    @PostMapping
    public PersonType addPersonType(@RequestBody PersonType personType) {
        return personTypeService.save(personType);
    }

    @GetMapping("/{id}")
    public PersonType getPersonTypeById(@PathVariable Long id) {
        return personTypeService.findById(id);
    }

    @PutMapping("/{id}")
    public PersonType updatePersonType(@PathVariable Long id, @RequestBody PersonType personType) {
        personType.setId(id);
        return personTypeService.save(personType);
    }

    @DeleteMapping("/{id}")
    public void deletePersonType(@PathVariable Long id) {
        personTypeService.delete(id);
    }
}
