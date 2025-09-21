package com.account4.account4.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "accountHeading_main")
public class AccountHeading {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String date;

    private String headingCode;

    private String headingName;

    @ManyToOne
    @JoinColumn(name = "accountNature_main_id", referencedColumnName = "id")
    private AccountNature accountNature;

    @ManyToOne
    @JoinColumn(name = "fiscalYearInfo_id", referencedColumnName = "id")
    private FiscalYear fiscalYear;

    @OneToMany(mappedBy = "accountHeading")
    private List<AccountHeadingSub> accountHeadingSubs;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHeadingCode() {
        return headingCode;
    }

    public void setHeadingCode(String headingCode) {
        this.headingCode = headingCode;
    }

    public String getHeadingName() {
        return headingName;
    }

    public void setHeadingName(String headingName) {
        this.headingName = headingName;
    }

    public AccountNature getAccountNature() {
        return accountNature;
    }

    public void setAccountNature(AccountNature accountNature) {
        this.accountNature = accountNature;
    }

    public FiscalYear getFiscalYear() {
        return fiscalYear;
    }

    public void setFiscalYear(FiscalYear fiscalYear) {
        this.fiscalYear = fiscalYear;
    }

    public List<AccountHeadingSub> getAccountHeadingSubs() {
        return accountHeadingSubs;
    }

    public void setAccountHeadingSubs(List<AccountHeadingSub> accountHeadingSubs) {
        this.accountHeadingSubs = accountHeadingSubs;
    }
}
