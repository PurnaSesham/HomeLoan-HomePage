package com.home.loan.homepage.model;

import java.math.BigDecimal;

public class Property {

    private String address;
    private BigDecimal value;
    private boolean ownedByApplicant;

    // Default Constructor
    public Property() {}

    // Getters and Setters
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public boolean isOwnedByApplicant() {
        return ownedByApplicant;
    }

    public void setOwnedByApplicant(boolean ownedByApplicant) {
        this.ownedByApplicant = ownedByApplicant;
    }
}
