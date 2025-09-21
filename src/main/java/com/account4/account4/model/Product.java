package com.account4.account4.model;

import jakarta.persistence.*;

@Entity
@Table(name = "productinfo")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String productCode;
    private String stockBarcode;
    private String description;

    @ManyToOne
    @JoinColumn(name = "productType_id", nullable = false)
    private ProductType productType;

    @ManyToOne
    @JoinColumn(name = "accountHeader_detail_id", nullable = false)
    private AccountHeadingDetail accountHeadingDetail;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getStockBarcode() {
        return stockBarcode;
    }

    public void setStockBarcode(String stockBarcode) {
        this.stockBarcode = stockBarcode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public AccountHeadingDetail getAccountHeadingDetail() {
        return accountHeadingDetail;
    }

    public void setAccountHeadingDetail(AccountHeadingDetail accountHeadingDetail) {
        this.accountHeadingDetail = accountHeadingDetail;
    }
}
