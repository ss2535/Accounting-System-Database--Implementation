package com.account4.account4.controller;

import com.account4.account4.model.Gender;
import com.account4.account4.service.GenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/genders")
public class GenderController {

    @Autowired
    private GenderService genderService;

    @GetMapping
    public List<Gender> getAllGenders() {
        return genderService.findAll();
    }

    @PostMapping
    public Gender addGender(@RequestBody Gender gender) {
        return genderService.save(gender);
    }

    @GetMapping("/{id}")
    public Gender getGenderById(@PathVariable Long id) {
        return genderService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteGender(@PathVariable Long id) {
        genderService.delete(id);
    }
}
