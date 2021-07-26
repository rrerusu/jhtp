package org.erusu.jhtp.chapter15.examples;

import java.io.Serializable;

public class Account implements Serializable{
    private double balance;
    private int account;
    private String firstName,
        lastName;
    
    public Account() {
        this(0, "", "", 0.0);
    }

    public Account(int account, String firstName, String lastName, double balance) {
        this.account = account;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    public void setAccount(int acct) {
        account = acct;
    }

    public int getAccount() {
        return account;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return lastName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}
