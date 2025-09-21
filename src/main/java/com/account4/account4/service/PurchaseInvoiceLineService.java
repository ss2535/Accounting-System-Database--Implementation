package com.account4.account4.service;

import com.account4.account4.model.PurchaseInvoiceLine;
import com.account4.account4.repository.PurchaseInvoiceLineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseInvoiceLineService {

    @Autowired
    private PurchaseInvoiceLineRepository purchaseInvoiceLineRepository;

    public PurchaseInvoiceLine addLine(PurchaseInvoiceLine line) {
        return purchaseInvoiceLineRepository.save(line);
    }

    public List<PurchaseInvoiceLine> getAllLines() {
        return purchaseInvoiceLineRepository.findAll();
    }

    public PurchaseInvoiceLine updateLine(Long id, PurchaseInvoiceLine line) {
        line.setId(id);
        return purchaseInvoiceLineRepository.save(line);
    }

    public void deleteLine(Long id) {
        purchaseInvoiceLineRepository.deleteById(id);
    }
}