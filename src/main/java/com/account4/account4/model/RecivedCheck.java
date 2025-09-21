package com.account4.account4.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "recivedCheck")
public class RecivedCheck {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date date;
    private Double price;
    private String accountNumber;
    private String bankCode;
    private String shebaNumber;
    private String description;

    @ManyToOne
    @JoinColumn(name = "accountHeading_detail_id")
    private AccountHeadingDetail accountHeadingDetail;

    @ManyToOne
    @JoinColumn(name = "cashReceipt_id")
    private CashReceipt cashReceipt;

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

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getShebaNumber() {
        return shebaNumber;
    }

    public void setShebaNumber(String shebaNumber) {
        this.shebaNumber = shebaNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AccountHeadingDetail getAccountHeadingDetail() {
        return accountHeadingDetail;
    }

    public void setAccountHeadingDetail(AccountHeadingDetail accountHeadingDetail) {
        this.accountHeadingDetail = accountHeadingDetail;
    }

    public CashReceipt getCashReceipt() {
        return cashReceipt;
    }

    public void setCashReceipt(CashReceipt cashReceipt) {
        this.cashReceipt = cashReceipt;
    }

    public SalesInvoice getSalesInvoice() {
        return salesInvoice;
    }

    public void setSalesInvoice(SalesInvoice salesInvoice) {
        this.salesInvoice = salesInvoice;
    }
}
