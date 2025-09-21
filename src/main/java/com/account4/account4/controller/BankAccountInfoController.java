package com.account4.account4.controller;

import com.account4.account4.model.BankAccountInfo;
import com.account4.account4.service.BankAccountInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/bank-account-info")
public class BankAccountInfoController {
    @Autowired
    private BankAccountInfoService service;

    @GetMapping
    public List<BankAccountInfo> getAll() {
        return service.findAll();
    }

    @PostMapping
    public BankAccountInfo create(@RequestBody BankAccountInfo bankAccountInfo) {
        return service.save(bankAccountInfo);
    }

    @GetMapping("/{id}")
    public BankAccountInfo getById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PutMapping("/{id}")
    public BankAccountInfo update(@PathVariable Long id, @RequestBody BankAccountInfo bankAccountInfo) {
        bankAccountInfo.setId(id);
        return service.save(bankAccountInfo);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteById(id);
    }
}
