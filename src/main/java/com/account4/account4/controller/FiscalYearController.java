package com.account4.account4.controller;

import com.account4.account4.model.FiscalYear;
import com.account4.account4.service.FiscalYearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fiscal-years")
public class FiscalYearController {

    private final FiscalYearService fiscalYearService;

    @Autowired
    public FiscalYearController(FiscalYearService fiscalYearService) {
        this.fiscalYearService = fiscalYearService;
    }

    @PostMapping
    public ResponseEntity<FiscalYear> createFiscalYear(@RequestBody FiscalYear fiscalYear) {
        FiscalYear createdFiscalYear = fiscalYearService.addFiscalYear(fiscalYear);
        return ResponseEntity.ok(createdFiscalYear);
    }

    @PutMapping("/{id}")
    public ResponseEntity<FiscalYear> updateFiscalYear(@PathVariable Long id, @RequestBody FiscalYear fiscalYear) {
        FiscalYear updatedFiscalYear = fiscalYearService.updateFiscalYear(id, fiscalYear);
        return ResponseEntity.ok(updatedFiscalYear);
    }

    @GetMapping
    public ResponseEntity<List<FiscalYear>> getAllFiscalYears() {
        List<FiscalYear> fiscalYears = fiscalYearService.getAllFiscalYears();
        return ResponseEntity.ok(fiscalYears);
    }
    @GetMapping("/{id}")
    public ResponseEntity<FiscalYear> getFiscalYearById(@PathVariable Long id) {
        FiscalYear fiscalYear = fiscalYearService.getFiscalYearById(id);
        return ResponseEntity.ok(fiscalYear);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFiscalYear(@PathVariable Long id) {
        fiscalYearService.deleteFiscalYear(id);
        return ResponseEntity.noContent().build();
    }
}
