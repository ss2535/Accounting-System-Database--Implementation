package com.account4.account4.model;

import com.account4.account4.model.AccountNatureDetail;
import jakarta.persistence.*;

@Entity
@Table(name = "accountHeading_detail")
public class AccountHeadingDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String date;
    private String headingCode;
    private String headingName;
    private String description;

    @ManyToOne
    @JoinColumn(name = "accountNatureDetailId")
    private AccountNatureDetail accountNatureDetail;

    @ManyToOne
    @JoinColumn(name = "accountHeadingSubId")
    private AccountHeadingSub accountHeadingSub;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public String getHeadingCode() { return headingCode; }
    public void setHeadingCode(String headingCode) { this.headingCode = headingCode; }

    public String getHeadingName() { return headingName; }
    public void setHeadingName(String headingName) { this.headingName = headingName; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public AccountNatureDetail getAccountNatureDetail() { return accountNatureDetail; }
    public void setAccountNatureDetail(AccountNatureDetail accountNatureDetail) { this.accountNatureDetail = accountNatureDetail; }

    public AccountHeadingSub getAccountHeadingSub() { return accountHeadingSub; }
    public void setAccountHeadingSub(AccountHeadingSub accountHeadingSub) { this.accountHeadingSub = accountHeadingSub; }
}