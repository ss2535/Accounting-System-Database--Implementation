package com.account4.account4.service;

import com.account4.account4.model.AccountHeadingDetail;
import com.account4.account4.model.AccountNatureDetail;
import com.account4.account4.model.AccountHeadingSub;
import com.account4.account4.repository.AccountHeadingDetailRepository;
import com.account4.account4.repository.AccountNatureDetailRepository;
import com.account4.account4.repository.AccountHeadingSubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountHeadingDetailService {
    @Autowired
    private AccountHeadingDetailRepository repository;

    @Autowired
    private AccountNatureDetailRepository accountNatureDetailRepository;

    @Autowired
    private AccountHeadingSubRepository accountHeadingSubRepository;

    public List<AccountHeadingDetail> findAll() {
        return repository.findAll();
    }

    public AccountHeadingDetail save(AccountHeadingDetail accountHeadingDetail) {

        if (accountHeadingDetail.getAccountNatureDetail() == null ||
                !accountNatureDetailRepository.existsById(accountHeadingDetail.getAccountNatureDetail().getId())) {
            throw new IllegalArgumentException("Invalid AccountNatureDetail ID");
        }

        if (accountHeadingDetail.getAccountHeadingSub() == null ||
                !accountHeadingSubRepository.existsById(accountHeadingDetail.getAccountHeadingSub().getId())) {
            throw new IllegalArgumentException("Invalid AccountHeadingSub ID");
        }

        return repository.save(accountHeadingDetail);
    }

    public AccountHeadingDetail findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}