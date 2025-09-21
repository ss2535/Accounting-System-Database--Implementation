package com.account4.account4.controller;

import com.account4.account4.model.AccountHeading;
import com.account4.account4.model.AccountHeadingSub;
import com.account4.account4.service.AccountHeadingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/account-headings")
public class AccountHeadingController {
    @Autowired
    private AccountHeadingService service;

    @GetMapping
    public List<AccountHeading> getAll() {
        return service.findAll();
    }

    @PostMapping
    public AccountHeading create(@RequestBody AccountHeading accountHeading) {
        return service.save(accountHeading);
    }

    @GetMapping("/{id}")
    public AccountHeading getById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PutMapping("/{id}")
    public AccountHeading update(@PathVariable Long id, @RequestBody AccountHeading accountHeading) {
        accountHeading.setId(id);
        return service.save(accountHeading);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteById(id);
    }

    @GetMapping("/{id}/sub-headings")
    public List<AccountHeadingSub> getSubHeadings(@PathVariable Long id) {
        return service.getSubHeadings(id);
    }
}