package com.account4.account4.service;

import com.account4.account4.model.CheckPaid;
import com.account4.account4.repository.CheckPaidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CheckPaidService {

    @Autowired
    private CheckPaidRepository checkPaidRepository;

    public CheckPaid addCheck(CheckPaid check) {
        return checkPaidRepository.save(check);
    }

    public List<CheckPaid> getAllChecks() {
        return checkPaidRepository.findAll();
    }

    public CheckPaid getCheckById(Long id) {
        return checkPaidRepository.findById(id).orElse(null);
    }

    public CheckPaid updateCheck(Long id, CheckPaid check) {
        check.setId(id);
        return checkPaidRepository.save(check);
    }

    public void deleteCheck(Long id) {
        checkPaidRepository.deleteById(id);
    }
}

