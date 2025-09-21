package com.account4.account4.service;

import com.account4.account4.model.ReceiptTransaction;
import com.account4.account4.repository.ReceiptTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReceiptTransactionService {
    @Autowired
    private ReceiptTransactionRepository receiptTransactionRepository;

    public ReceiptTransaction addReceiptTransaction(ReceiptTransaction transaction) {
        return receiptTransactionRepository.save(transaction);
    }

    public List<ReceiptTransaction> getAllReceiptTransactions() {
        return receiptTransactionRepository.findAll();
    }
}