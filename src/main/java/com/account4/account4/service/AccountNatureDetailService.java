package com.account4.account4.service;

import com.account4.account4.model.AccountNatureDetail;
import com.account4.account4.repository.AccountNatureDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountNatureDetailService {
    @Autowired
    private AccountNatureDetailRepository repository;

    public List<AccountNatureDetail> findAll() {
        return repository.findAll();
    }

    public AccountNatureDetail save(AccountNatureDetail accountNatureDetail) {
        return repository.save(accountNatureDetail);
    }

    public AccountNatureDetail findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}