package com.account4.account4.controller;

import com.account4.account4.model.PurchaseInvoice;
import com.account4.account4.service.PurchaseInvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/invoices")
public class PurchaseInvoiceController {

    @Autowired
    private PurchaseInvoiceService purchaseInvoiceService;

    @PostMapping
    public PurchaseInvoice createInvoice(@RequestBody PurchaseInvoice invoice) {
        return purchaseInvoiceService.addInvoice(invoice);
    }

    @GetMapping
    public List<PurchaseInvoice> getAllInvoices() {
        return purchaseInvoiceService.getAllInvoices();
    }
}
