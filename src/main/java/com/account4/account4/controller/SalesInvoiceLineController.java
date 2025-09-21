package com.account4.account4.controller;

import com.account4.account4.model.SalesInvoiceLine;
import com.account4.account4.service.SalesInvoiceLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sales-invoice-lines")
public class SalesInvoiceLineController {

    @Autowired
    private SalesInvoiceLineService salesInvoiceLineService;

    @PostMapping
    public SalesInvoiceLine createLine(@RequestBody SalesInvoiceLine line) {
        return salesInvoiceLineService.addLine(line);
    }

    @GetMapping
    public List<SalesInvoiceLine> getAllLines() {
        return salesInvoiceLineService.getAllLines();
    }

    @PutMapping("/{id}")
    public SalesInvoiceLine updateLine(@PathVariable Long id, @RequestBody SalesInvoiceLine line) {
        return salesInvoiceLineService.updateLine(id, line);
    }

    @DeleteMapping("/{id}")
    public void deleteLine(@PathVariable Long id) {
        salesInvoiceLineService.deleteLine(id);
    }
}
