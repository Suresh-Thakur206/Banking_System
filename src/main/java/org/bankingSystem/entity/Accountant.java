package org.bankingSystem.entity;

public class Accountant {


    private String AccountantUserName;
    private String AccountantEmail;
    private String AccountantPassword;

    public Accountant(String accountantUserName, String accountantEmail, String accountantPassword) {
        AccountantUserName = accountantUserName;
        AccountantEmail = accountantEmail;
        AccountantPassword = accountantPassword;
    }

    public String getAccountantUserName() {
        return AccountantUserName;
    }

    public void setAccountantUserName(String accountantUserName) {
        AccountantUserName = accountantUserName;
    }

    public String getAccountantEmail() {
        return AccountantEmail;
    }

    public void setAccountantEmail(String accountantEmail) {
        AccountantEmail = accountantEmail;
    }

    public String getAccountantPassword() {
        return AccountantPassword;
    }

    public void setAccountantPassword(String accountantPassword) {
        AccountantPassword = accountantPassword;
    }

    @Override
    public String toString() {
        return "Accountant{" +
                "AccountantUserName='" + AccountantUserName + '\'' +
                ", AccountantEmail='" + AccountantEmail + '\'' +
                ", AccountantPassword='" + AccountantPassword + '\'' +
                '}';
    }





}
