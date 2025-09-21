package com.account4.account4.controller;

import com.account4.account4.model.PaymentTransaction;
import com.account4.account4.service.PaymentTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/paymentTransactions")
public class PaymentTransactionController {
    @Autowired
    private PaymentTransactionService paymentTransactionService;

    @PostMapping
    public ResponseEntity<PaymentTransaction> addPaymentTransaction(@RequestBody PaymentTransaction transaction) {
        PaymentTransaction savedTransaction = paymentTransactionService.addPaymentTransaction(transaction);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedTransaction);
    }

    @GetMapping
    public List<PaymentTransaction> getAllPaymentTransactions() {
        return paymentTransactionService.getAllPaymentTransactions();
    }
}