package com.account4.account4.controller;

import com.account4.account4.model.AccountHeadingSub;
import com.account4.account4.service.AccountHeadingSubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/account-headings-sub")
public class AccountHeadingSubController {
    @Autowired
    private AccountHeadingSubService service;

    @GetMapping
    public List<AccountHeadingSub> getAll() {
        return service.findAll();
    }

    @PostMapping
    public AccountHeadingSub create(@RequestBody AccountHeadingSub accountHeadingSub) {
        return service.save(accountHeadingSub);
    }
    @GetMapping("/{id}")
    public AccountHeadingSub getById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PutMapping("/{id}")
    public AccountHeadingSub update(@PathVariable Long id, @RequestBody AccountHeadingSub accountHeadingSub) {
        accountHeadingSub.setId(id);
        return service.save(accountHeadingSub);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteById(id);
    }
}