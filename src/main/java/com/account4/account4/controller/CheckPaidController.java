package com.account4.account4.controller;

import com.account4.account4.model.CheckPaid;
import com.account4.account4.service.CheckPaidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/checks-paid")
public class CheckPaidController {

    @Autowired
    private CheckPaidService checkPaidService;

    @PostMapping
    public CheckPaid createCheck(@RequestBody CheckPaid check) {
        return checkPaidService.addCheck(check);
    }

    @GetMapping
    public List<CheckPaid> getAllChecks() {
        return checkPaidService.getAllChecks();
    }

    @GetMapping("/{id}")
    public CheckPaid getCheckById(@PathVariable Long id) {
        return checkPaidService.getCheckById(id);
    }

    @PutMapping("/{id}")
    public CheckPaid updateCheck(@PathVariable Long id, @RequestBody CheckPaid check) {
        return checkPaidService.updateCheck(id, check);
    }

    @DeleteMapping("/{id}")
    public void deleteCheck(@PathVariable Long id) {
        checkPaidService.deleteCheck(id);
    }
}
