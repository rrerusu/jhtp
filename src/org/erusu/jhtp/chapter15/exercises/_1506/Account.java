package org.erusu.jhtp.chapter15.exercises._1506;

import java.io.Serializable;

public class Account implements Serializable{
    private int account;
    private String firstName,
        lastName;
    private double balance;
    
    // Constructors
    public Account() {
        this(0, "", "", 0.0);
    }

    public Account(int account, String firstName, String lastName, double balance) {
        this.account = account;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }


    public void combine(TransactionRecord record) {
        balance += record.getTransactionAmount();
    }


    // Accessor Methods
    public int getAccount() {
        return account;
    }

    public double getBalance() {
        return balance;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    // Modifier Methods
    public void setAccount(int acct) {
        account = acct;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    // overrides
    @Override
    public String toString() {
        return String.format("%d %s %s %.2f",
            getAccount(),
            getFirstName(),
            getLastName(),
            getBalance());
    }
}
