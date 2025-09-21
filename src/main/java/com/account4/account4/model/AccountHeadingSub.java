package com.account4.account4.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "accountHeading_sub")
public class AccountHeadingSub {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String data;
    private String headingCode;
    private String headingName;
    private Long accountNatureSubId;

    @ManyToOne
    @JoinColumn(name = "account_heading_id")
    private AccountHeading accountHeading;

    @OneToMany(mappedBy = "accountHeadingSub")
    private List<AccountHeadingDetail> accountHeadingDetails;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getData() { return data; }
    public void setData(String data) { this.data = data; }

    public String getHeadingCode() { return headingCode; }
    public void setHeadingCode(String headingCode) { this.headingCode = headingCode; }

    public String getHeadingName() { return headingName; }
    public void setHeadingName(String headingName) { this.headingName = headingName; }

    public Long getAccountNatureSubId() { return accountNatureSubId; }
    public void setAccountNatureSubId(Long accountNatureSubId) {
        this.accountNatureSubId = accountNatureSubId;
    }

    public AccountHeading getAccountHeading() { return accountHeading; }
    public void setAccountHeading(AccountHeading accountHeading) {
        this.accountHeading = accountHeading;
    }

    public List<AccountHeadingDetail> getAccountHeadingDetails() {
        return accountHeadingDetails;
    }
    public void setAccountHeadingDetails(List<AccountHeadingDetail> accountHeadingDetails) {
        this.accountHeadingDetails = accountHeadingDetails;
    }
}
