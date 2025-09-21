package com.account4.account4.service;

import com.account4.account4.model.SalesInvoice;
import com.account4.account4.repository.SalesInvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesInvoiceService {

    @Autowired
    private SalesInvoiceRepository salesInvoiceRepository;

    public SalesInvoice addInvoice(SalesInvoice invoice) {
        return salesInvoiceRepository.save(invoice);
    }

    public List<SalesInvoice> getAllInvoices() {
        return salesInvoiceRepository.findAll();
    }

}
