package com.account4.account4.service;

import com.account4.account4.model.RecivedCheck;
import com.account4.account4.repository.RecivedCheckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecivedCheckService {

    @Autowired
    private RecivedCheckRepository recivedCheckRepository;

    public RecivedCheck addCheck(RecivedCheck check) {
        return recivedCheckRepository.save(check);
    }

    public List<RecivedCheck> getAllChecks() {
        return recivedCheckRepository.findAll();
    }

    public RecivedCheck getCheckById(Long id) {
        return recivedCheckRepository.findById(id).orElse(null);
    }

    public RecivedCheck updateCheck(Long id, RecivedCheck check) {
        check.setId(id);
        return recivedCheckRepository.save(check);
    }

    public void deleteCheck(Long id) {
        recivedCheckRepository.deleteById(id);
    }
}
