package com.home.loan.homepage.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class LoanApplication {

    private String applicationId;
    private BigDecimal loanAmount;
    private int loanTenureMonths;
    private String interestType;
    private String loanPurpose;

    // Associated Classes
    private Customer customer;
    private CoApplicant coApplicant; // Optional
    private Property property;
    private Document documents;

    private String applicationStatus;
    private LocalDate submittedDate;
    private LocalDate approvalDate;

    // Default Constructor
    public LoanApplication() {}

    // Getters and Setters
    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
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

    public String getInterestType() {
        return interestType;
    }

    public void setInterestType(String interestType) {
        this.interestType = interestType;
    }

    public String getLoanPurpose() {
        return loanPurpose;
    }

    public void setLoanPurpose(String loanPurpose) {
        this.loanPurpose = loanPurpose;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public CoApplicant getCoApplicant() {
        return coApplicant;
    }

    public void setCoApplicant(CoApplicant coApplicant) {
        this.coApplicant = coApplicant;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public Document getDocuments() {
        return documents;
    }

    public void setDocuments(Document documents) {
        this.documents = documents;
    }

    public String getApplicationStatus() {
        return applicationStatus;
    }

    public void setApplicationStatus(String applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    public LocalDate getSubmittedDate() {
        return submittedDate;
    }

    public void setSubmittedDate(LocalDate submittedDate) {
        this.submittedDate = submittedDate;
    }

    public LocalDate getApprovalDate() {
        return approvalDate;
    }

    public void setApprovalDate(LocalDate approvalDate) {
        this.approvalDate = approvalDate;
    }
}