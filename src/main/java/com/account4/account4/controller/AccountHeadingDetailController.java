package com.account4.account4.controller;

import com.account4.account4.model.AccountHeadingDetail;
import com.account4.account4.service.AccountHeadingDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/account-headings-detail")
public class AccountHeadingDetailController {
    @Autowired
    private AccountHeadingDetailService service;

    @GetMapping
    public List<AccountHeadingDetail> getAll() {
        return service.findAll();
    }

    @PostMapping
    public AccountHeadingDetail create(@RequestBody AccountHeadingDetail accountHeadingDetail) {
        return service.save(accountHeadingDetail);
    }

    @GetMapping("/{id}")
    public AccountHeadingDetail getById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PutMapping("/{id}")
    public AccountHeadingDetail update(@PathVariable Long id, @RequestBody AccountHeadingDetail accountHeadingDetail) {
        accountHeadingDetail.setId(id);
        return service.save(accountHeadingDetail);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteById(id);
    }
}