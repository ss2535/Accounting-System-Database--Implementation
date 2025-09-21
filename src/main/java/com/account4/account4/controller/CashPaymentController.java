package com.account4.account4.controller;

import com.account4.account4.model.CashPayment;
import com.account4.account4.service.CashPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cash-payments")
public class CashPaymentController {

    @Autowired
    private CashPaymentService cashPaymentService;

    @PostMapping
    public CashPayment createPayment(@RequestBody CashPayment payment) {
        return cashPaymentService.addPayment(payment);
    }

    @GetMapping
    public List<CashPayment> getAllPayments() {
        return cashPaymentService.getAllPayments();
    }
    @GetMapping("/{id}")
    public CashPayment getPaymentById(@PathVariable Long id) {
        return cashPaymentService.getPaymentById(id);
    }

    @PutMapping("/{id}")
    public CashPayment updatePayment(@PathVariable Long id, @RequestBody CashPayment payment) {
        return cashPaymentService.updatePayment(id, payment);
    }

    @DeleteMapping("/{id}")
    public void deletePayment(@PathVariable Long id) {
        cashPaymentService.deletePayment(id);
    }
}
