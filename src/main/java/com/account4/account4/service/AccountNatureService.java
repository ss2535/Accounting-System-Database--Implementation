package com.account4.account4.service;

import com.account4.account4.model.AccountNature;
import com.account4.account4.repository.AccountNatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountNatureService {
    @Autowired
    private AccountNatureRepository repository;

    public List<AccountNature> findAll() {
        return repository.findAll();
    }

    public AccountNature save(AccountNature accountNature) {
        return repository.save(accountNature);
    }

    public AccountNature findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
