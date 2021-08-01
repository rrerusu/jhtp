package org.erusu.jhtp.chapter15.exercises._1506;

import java.io.Serializable;

public class TransactionRecord implements Serializable{
    private int accNum;
    private double transAmt;
    
    public TransactionRecord() {
        this(0, 0);
    }

    public TransactionRecord(int accNumber, double transAmount) {
        setAccountNumber(accNumber);
        setTransactionAmount(transAmount);
    }

    public int getAccountNumber() {
        return accNum;
    }

    public double getTransactionAmount() {
        return transAmt;
    }

    public void setAccountNumber(int accNumber) {
        accNum = accNumber;
    }

    public void setTransactionAmount(double transAmount) {
        transAmt = transAmount;
    }


    // overrides
    @Override
    public String toString() {
        return String.format("%d %.2f",
            getAccountNumber(),
            getTransactionAmount());
    }
}