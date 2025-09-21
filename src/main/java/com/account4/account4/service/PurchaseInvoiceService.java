package com.account4.account4.service;

import com.account4.account4.model.PurchaseInvoice;
import com.account4.account4.repository.PurchaseInvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseInvoiceService {

    @Autowired
    private PurchaseInvoiceRepository purchaseInvoiceRepository;

    public PurchaseInvoice addInvoice(PurchaseInvoice invoice) {
        return purchaseInvoiceRepository.save(invoice);
    }

    public List<PurchaseInvoice> getAllInvoices() {
        return purchaseInvoiceRepository.findAll();
    }


}