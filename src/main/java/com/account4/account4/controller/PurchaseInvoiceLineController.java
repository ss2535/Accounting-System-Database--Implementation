package com.account4.account4.controller;

import com.account4.account4.model.PurchaseInvoiceLine;
import com.account4.account4.service.PurchaseInvoiceLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/purchase-invoice-lines")
public class PurchaseInvoiceLineController {

    @Autowired
    private PurchaseInvoiceLineService purchaseInvoiceLineService;
    @PostMapping
    public PurchaseInvoiceLine createLine(@RequestBody PurchaseInvoiceLine line) {
        return purchaseInvoiceLineService.addLine(line);
    }

    @GetMapping
    public List<PurchaseInvoiceLine> getAllLines() {
        return purchaseInvoiceLineService.getAllLines();
    }

    @PutMapping("/{id}")
    public PurchaseInvoiceLine updateLine(@PathVariable Long id, @RequestBody PurchaseInvoiceLine line) {
        return purchaseInvoiceLineService.updateLine(id, line);
    }

    @DeleteMapping("/{id}")
    public void deleteLine(@PathVariable Long id) {
        purchaseInvoiceLineService.deleteLine(id);
    }
}