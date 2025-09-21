package com.account4.account4.controller;

import com.account4.account4.model.AccountNatureDetail;
import com.account4.account4.service.AccountNatureDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/account-nature-detail")
public class AccountNatureDetailController {
    @Autowired
    private AccountNatureDetailService service;

    @GetMapping
    public List<AccountNatureDetail> getAll() {
        return service.findAll();
    }

    @PostMapping
    public AccountNatureDetail create(@RequestBody AccountNatureDetail accountNatureDetail) {
        return service.save(accountNatureDetail);
    }

    @GetMapping("/{id}")
    public AccountNatureDetail getById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PutMapping("/{id}")
    public AccountNatureDetail update(@PathVariable Long id, @RequestBody AccountNatureDetail accountNatureDetail) {
        accountNatureDetail.setId(id);
        return service.save(accountNatureDetail);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteById(id);
    }
}

