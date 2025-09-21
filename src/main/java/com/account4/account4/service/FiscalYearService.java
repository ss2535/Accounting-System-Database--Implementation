package com.account4.account4.service;

import com.account4.account4.model.FiscalYear;
import com.account4.account4.repository.FiscalYearRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FiscalYearService {

    private final FiscalYearRepository fiscalYearRepository;

    @Autowired
    public FiscalYearService(FiscalYearRepository fiscalYearRepository) {
        this.fiscalYearRepository = fiscalYearRepository;
    }

    public FiscalYear addFiscalYear(FiscalYear fiscalYear) {
        return fiscalYearRepository.save(fiscalYear);
    }

    public FiscalYear updateFiscalYear(Long id, FiscalYear updatedFiscalYear) {
        Optional<FiscalYear> existingFiscalYear = fiscalYearRepository.findById(id);
        if (existingFiscalYear.isPresent()) {
            FiscalYear fiscalYear = existingFiscalYear.get();
            fiscalYear.setCode(updatedFiscalYear.getCode());
            fiscalYear.setDateStart(updatedFiscalYear.getDateStart());
            fiscalYear.setDateEnd(updatedFiscalYear.getDateEnd());
            fiscalYear.setName(updatedFiscalYear.getName());
            fiscalYear.setDescription(updatedFiscalYear.getDescription());
            fiscalYear.setActive(updatedFiscalYear.isActive());
            return fiscalYearRepository.save(fiscalYear);
        } else {
            throw new RuntimeException("Fiscal Year not found with id: " + id);
        }
    }

    public List<FiscalYear> getAllFiscalYears() {
        return fiscalYearRepository.findAll();
    }

    public FiscalYear getFiscalYearById(Long id) {
        return fiscalYearRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Fiscal Year not found with id: " + id));
    }

    public void deleteFiscalYear(Long id) {
        fiscalYearRepository.deleteById(id);
    }
}
