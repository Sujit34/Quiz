package edu.miu.ContactApplication.model;

public class Email {

    private String emailAddress;
    private String label;
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Email(String emailAddress, String label) {
        this.emailAddress = emailAddress;
        this.label = label;
    }
}
