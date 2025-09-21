package com.account4.account4.service;

import com.account4.account4.model.CashReceipt;
import com.account4.account4.repository.CashReceiptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CashReceiptService {

    @Autowired
    private CashReceiptRepository cashReceiptRepository;

    public CashReceipt addReceipt(CashReceipt receipt) {
        return cashReceiptRepository.save(receipt);
    }

    public List<CashReceipt> getAllReceipts() {
        return cashReceiptRepository.findAll();
    }

    public CashReceipt getReceiptById(Long id) {
        return cashReceiptRepository.findById(id).orElse(null);
    }

    public CashReceipt updateReceipt(Long id, CashReceipt receipt) {
        receipt.setId(id);
        return cashReceiptRepository.save(receipt);
    }

    public void deleteReceipt(Long id) {
        cashReceiptRepository.deleteById(id);
    }
}
