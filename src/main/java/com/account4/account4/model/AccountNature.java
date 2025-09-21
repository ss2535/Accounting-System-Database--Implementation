package com.account4.account4.model;

import jakarta.persistence.*;

//import javax.persistence.*;

@Entity
@Table(name = "account_nature")
public class AccountNature {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String natureName;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNatureName() {
        return natureName;
    }

    public void setNatureName(String natureName) {
        this.natureName = natureName;
    }
}

