package com.account4.account4.model;

import jakarta.persistence.*;

@Entity
@Table(name = "bankAccountInfo")
public class BankAccountInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String bankCode;
    private String branchCode;
    private String shebaNumber;
    private String accountNumber;
    private Double initialBalance;
    private Boolean isActive;

    @ManyToOne
    @JoinColumn(name = "accountHeadingDetailId", nullable = false)
    private AccountHeadingDetail accountHeadingDetail;

    @ManyToOne
    @JoinColumn(name = "personId", nullable = false)
    private Person person;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getBankCode() { return bankCode; }
    public void setBankCode(String bankCode) { this.bankCode = bankCode; }

    public String getBranchCode() { return branchCode; }
    public void setBranchCode(String branchCode) { this.branchCode = branchCode; }

    public String getShebaNumber() { return shebaNumber; }
    public void setShebaNumber(String shebaNumber) { this.shebaNumber = shebaNumber; }

    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getInitialBalance() { return initialBalance; }
    public void setInitialBalance(Double initialBalance) {
        this.initialBalance = initialBalance;
    }

    public Boolean getIsActive() { return isActive; }
    public void setIsActive(Boolean isActive) { this.isActive = isActive; }

    public AccountHeadingDetail getAccountHeadingDetail() { return accountHeadingDetail; }
    public void setAccountHeadingDetail(AccountHeadingDetail accountHeadingDetail) {
        this.accountHeadingDetail = accountHeadingDetail;
    }

    public Person getPerson() { return person; }
    public void setPerson(Person person) { this.person = person; }
}