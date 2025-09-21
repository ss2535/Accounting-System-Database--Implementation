package com.account4.account4.service;

import com.account4.account4.model.AccountHeading;
import com.account4.account4.model.AccountHeadingSub;
import com.account4.account4.repository.AccountHeadingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountHeadingService {
    @Autowired
    private AccountHeadingRepository repository;

    public List<AccountHeading> findAll() {
        return repository.findAll();
    }

    public AccountHeading save(AccountHeading accountHeading) {
        return repository.save(accountHeading);
    }
    public AccountHeading findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public List<AccountHeadingSub> getSubHeadings(Long headingId) {
        AccountHeading heading = findById(headingId);
        return heading != null ? heading.getAccountHeadingSubs() : null;
    }
}