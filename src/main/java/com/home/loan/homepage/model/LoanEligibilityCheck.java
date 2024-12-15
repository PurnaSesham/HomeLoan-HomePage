package com.home.loan.homepage.model;

import java.math.BigDecimal;

public class LoanEligibilityCheck {

    // Customer Personal Details
    private int age; // Customer's age
    private String employmentType; // "Salaried" or "Self-Employed"
    private BigDecimal monthlyIncome; // Monthly income of the customer
    private BigDecimal existingEMIs; // Total existing monthly EMIs (if any)

    // Loan Details
    private BigDecimal loanAmount; // Desired loan amount
    private int loanTenureMonths; // Desired loan tenure in months
    private BigDecimal interestRate; // Proposed interest rate

    // Property Details
    private BigDecimal propertyValue; // Estimated value of the property
    private boolean isPropertyOwned; // Whether the property is owned by the applicant

    // Credit Details
    private int creditScore; // Customer's credit score (e.g., 300-900)
    private boolean hasDefaultHistory; // Whether the customer has defaulted on past loans

    // Eligibility Status
    private boolean isEligible; // Final eligibility result
    private String eligibilityMessage; // Message explaining eligibility or rejection

    // Default Constructor
    public LoanEligibilityCheck() {}

    // Getters and Setters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }

    public BigDecimal getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(BigDecimal monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public BigDecimal getExistingEMIs() {
        return existingEMIs;
    }

    public void setExistingEMIs(BigDecimal existingEMIs) {
        this.existingEMIs = existingEMIs;
    }

    public BigDecimal getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(BigDecimal loanAmount) {
        this.loanAmount = loanAmount;
    }

    public int getLoanTenureMonths() {
        return loanTenureMonths;
    }

    public void setLoanTenureMonths(int loanTenureMonths) {
        this.loanTenureMonths = loanTenureMonths;
    }

    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }

    public BigDecimal getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(BigDecimal propertyValue) {
        this.propertyValue = propertyValue;
    }

    public boolean isPropertyOwned() {
        return isPropertyOwned;
    }

    public void setPropertyOwned(boolean isPropertyOwned) {
        this.isPropertyOwned = isPropertyOwned;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public boolean isHasDefaultHistory() {
        return hasDefaultHistory;
    }

    public void setHasDefaultHistory(boolean hasDefaultHistory) {
        this.hasDefaultHistory = hasDefaultHistory;
    }

    public boolean isEligible() {
        return isEligible;
    }

    public void setEligible(boolean isEligible) {
        this.isEligible = isEligible;
    }

    public String getEligibilityMessage() {
        return eligibilityMessage;
    }

    public void setEligibilityMessage(String eligibilityMessage) {
        this.eligibilityMessage = eligibilityMessage;
    }
}
