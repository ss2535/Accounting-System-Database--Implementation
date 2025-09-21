package com.account4.account4.controller;

import com.account4.account4.model.CashReceipt;
import com.account4.account4.service.CashReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cash-receipts")
public class CashReceiptController {

    @Autowired
    private CashReceiptService cashReceiptService;

    @PostMapping
    public CashReceipt createReceipt(@RequestBody CashReceipt receipt) {
        return cashReceiptService.addReceipt(receipt);
    }

    @GetMapping
    public List<CashReceipt> getAllReceipts() {
        return cashReceiptService.getAllReceipts();
    }
    @GetMapping("/{id}")
    public CashReceipt getReceiptById(@PathVariable Long id) {
        return cashReceiptService.getReceiptById(id);
    }

    @PutMapping("/{id}")
    public CashReceipt updateReceipt(@PathVariable Long id, @RequestBody CashReceipt receipt) {
        return cashReceiptService.updateReceipt(id, receipt);
    }

    @DeleteMapping("/{id}")
    public void deleteReceipt(@PathVariable Long id) {
        cashReceiptService.deleteReceipt(id);
    }
}
