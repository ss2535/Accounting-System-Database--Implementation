package com.account4.account4.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "receipt_transaction")
public class ReceiptTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;
    private BigDecimal price;
    private String description;

    @ManyToOne
    @JoinColumn(name = "accountHeading_detail_id")
    private AccountHeadingDetail accountHeadingDetail;

    @ManyToOne
    @JoinColumn(name = "bankAccountInfo_id")
    private BankAccountInfo bankAccountInfo;

    @ManyToOne
    @JoinColumn(name = "cashReceipt_id")
    private CashReceipt cashReceipt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
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

    public BankAccountInfo getBankAccountInfo() {
        return bankAccountInfo;
    }

    public void setBankAccountInfo(BankAccountInfo bankAccountInfo) {
        this.bankAccountInfo = bankAccountInfo;
    }

    public CashReceipt getCashReceipt() {
        return cashReceipt;
    }

    public void setCashReceipt(CashReceipt cashReceipt) {
        this.cashReceipt = cashReceipt;
    }
}