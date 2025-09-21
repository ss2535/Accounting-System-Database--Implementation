package com.account4.account4.service;

import com.account4.account4.model.AccountHeadingSub;
import com.account4.account4.repository.AccountHeadingSubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountHeadingSubService {
    @Autowired
    private AccountHeadingSubRepository repository;

    public List<AccountHeadingSub> findAll() {
        return repository.findAll();
    }

    public AccountHeadingSub save(AccountHeadingSub accountHeadingSub) {
        return repository.save(accountHeadingSub);
    }

    public AccountHeadingSub findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}