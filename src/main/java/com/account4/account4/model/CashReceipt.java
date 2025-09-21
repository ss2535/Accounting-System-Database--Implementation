package com.account4.account4.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "cashReceipt")
public class CashReceipt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date date;
    private Double price;
    private String documentNumber;

    @ManyToOne
    @JoinColumn(name = "persion_id")
    private Person person;

    @ManyToOne
    @JoinColumn(name = "accountHeading_detail_id")
    private AccountHeadingDetail accountHeadingDetail;

    @ManyToOne
    @JoinColumn(name = "salesInvoice_id")
    private SalesInvoice salesInvoice;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {

        this.documentNumber = documentNumber;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public AccountHeadingDetail getAccountHeadingDetail() {
        return accountHeadingDetail;
    }

    public void setAccountHeadingDetail(AccountHeadingDetail accountHeadingDetail) {
        this.accountHeadingDetail = accountHeadingDetail;
    }

    public SalesInvoice getSalesInvoice() {
        return salesInvoice;
    }

    public void setSalesInvoice(SalesInvoice salesInvoice) {
        this.salesInvoice = salesInvoice;
    }
}