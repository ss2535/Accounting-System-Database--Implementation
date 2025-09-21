package com.account4.account4.service;

import com.account4.account4.model.BankAccountInfo;
import com.account4.account4.model.Person;
import com.account4.account4.repository.BankAccountInfoRepository;
import com.account4.account4.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankAccountInfoService {
    @Autowired
    private BankAccountInfoRepository repository;

    @Autowired
    private PersonRepository personRepository;

    public List<BankAccountInfo> findAll() {
        return repository.findAll();
    }

    public BankAccountInfo save(BankAccountInfo bankAccountInfo) {
        Person person = personRepository.findById(bankAccountInfo.getPerson().getId()).orElse(null);
        if (person != null) {
            bankAccountInfo.setPerson(person);
        }
        return repository.save(bankAccountInfo);
    }

    public BankAccountInfo findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}

