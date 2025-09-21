package com.account4.account4.controller;

import com.account4.account4.model.AccountNature;
import com.account4.account4.service.AccountNatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/account-natures")
public class AccountNatureController {
    @Autowired
    private AccountNatureService service;

    @GetMapping
    public List<AccountNature> getAll() {
        return service.findAll();
    }

    @PostMapping
    public AccountNature create(@RequestBody AccountNature accountNature) {
        return service.save(accountNature);
    }

    @GetMapping("/{id}")
    public AccountNature getById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PutMapping("/{id}")
    public AccountNature update(@PathVariable Long id, @RequestBody AccountNature accountNature) {
        accountNature.setId(id);
        return service.save(accountNature);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteById(id);
    }
}