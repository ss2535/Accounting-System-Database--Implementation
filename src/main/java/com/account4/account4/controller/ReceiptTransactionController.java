package com.account4.account4.controller;

import com.account4.account4.model.ReceiptTransaction;
import com.account4.account4.service.ReceiptTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/receiptTransactions")
public class ReceiptTransactionController {
    @Autowired
    private ReceiptTransactionService receiptTransactionService;

    @PostMapping
    public ResponseEntity<ReceiptTransaction> addReceiptTransaction(@RequestBody ReceiptTransaction transaction) {
        ReceiptTransaction savedTransaction = receiptTransactionService.addReceiptTransaction(transaction);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedTransaction);
    }

    @GetMapping
    public List<ReceiptTransaction> getAllReceiptTransactions() {
        return receiptTransactionService.getAllReceiptTransactions();
    }
}
