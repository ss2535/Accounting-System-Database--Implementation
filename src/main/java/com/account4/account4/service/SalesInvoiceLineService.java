package com.account4.account4.service;

import com.account4.account4.model.SalesInvoiceLine;
import com.account4.account4.repository.SalesInvoiceLineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesInvoiceLineService {

    @Autowired
    private SalesInvoiceLineRepository salesInvoiceLineRepository;

    public SalesInvoiceLine addLine(SalesInvoiceLine line) {
        return salesInvoiceLineRepository.save(line);
    }

    public List<SalesInvoiceLine> getAllLines() {
        return salesInvoiceLineRepository.findAll();
    }

    public SalesInvoiceLine updateLine(Long id, SalesInvoiceLine line) {
        line.setId(id);
        return salesInvoiceLineRepository.save(line);
    }

    public void deleteLine(Long id) {
        salesInvoiceLineRepository.deleteById(id);
    }
}
