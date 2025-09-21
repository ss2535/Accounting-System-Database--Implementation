package com.account4.account4.controller;

import com.account4.account4.model.SalesInvoice;
import com.account4.account4.service.SalesInvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sales-invoices")
public class SalesInvoiceController {

    @Autowired
    private SalesInvoiceService salesInvoiceService;

    @PostMapping
    public SalesInvoice createInvoice(@RequestBody SalesInvoice invoice) {
        return salesInvoiceService.addInvoice(invoice);
    }

    @GetMapping
    public List<SalesInvoice> getAllInvoices() {
        return salesInvoiceService.getAllInvoices();
    }
}