package com.account4.account4.service;

import com.account4.account4.model.PaymentTransaction;
import com.account4.account4.repository.PaymentTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentTransactionService {
    @Autowired
    private PaymentTransactionRepository paymentTransactionRepository;

    public PaymentTransaction addPaymentTransaction(PaymentTransaction transaction) {
        return paymentTransactionRepository.save(transaction);
    }

    public List<PaymentTransaction> getAllPaymentTransactions() {
        return paymentTransactionRepository.findAll();
    }
}
