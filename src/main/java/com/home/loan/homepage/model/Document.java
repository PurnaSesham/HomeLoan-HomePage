package com.home.loan.homepage.model;

public class Document {

    private boolean identityProofUploaded;
    private boolean incomeProofUploaded;
    private boolean propertyDocumentUploaded;

    // Default Constructor
    public Document() {}

    // Getters and Setters
    public boolean isIdentityProofUploaded() {
        return identityProofUploaded;
    }

    public void setIdentityProofUploaded(boolean identityProofUploaded) {
        this.identityProofUploaded = identityProofUploaded;
    }

    public boolean isIncomeProofUploaded() {
        return incomeProofUploaded;
    }

    public void setIncomeProofUploaded(boolean incomeProofUploaded) {
        this.incomeProofUploaded = incomeProofUploaded;
    }

    public boolean isPropertyDocumentUploaded() {
        return propertyDocumentUploaded;
    }

    public void setPropertyDocumentUploaded(boolean propertyDocumentUploaded) {
        this.propertyDocumentUploaded = propertyDocumentUploaded;
    }
}
