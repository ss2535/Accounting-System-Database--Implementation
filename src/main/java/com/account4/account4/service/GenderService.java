package com.account4.account4.service;

import com.account4.account4.model.Gender;
import com.account4.account4.repository.GenderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenderService {

    @Autowired
    private GenderRepository genderRepository;

    public List<Gender> findAll() {
        return genderRepository.findAll();
    }

    public Gender save(Gender gender) {
        return genderRepository.save(gender);
    }

    public Gender findById(Long id) {
        return genderRepository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        genderRepository.deleteById(id);
    }
}
