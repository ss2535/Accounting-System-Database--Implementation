package com.account4.account4.service;

import com.account4.account4.model.CashPayment;
import com.account4.account4.repository.CashPaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CashPaymentService {

    @Autowired
    private CashPaymentRepository cashPaymentRepository;

    public CashPayment addPayment(CashPayment payment) {
        return cashPaymentRepository.save(payment);
    }

    public List<CashPayment> getAllPayments() {
        return cashPaymentRepository.findAll();
    }

    public CashPayment getPaymentById(Long id) {
        return cashPaymentRepository.findById(id).orElse(null);
    }

    public CashPayment updatePayment(Long id, CashPayment payment) {
        payment.setId(id);
        return cashPaymentRepository.save(payment);
    }

    public void deletePayment(Long id) {
        cashPaymentRepository.deleteById(id);
    }
}
