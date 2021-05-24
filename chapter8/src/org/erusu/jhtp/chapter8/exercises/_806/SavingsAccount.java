package org.erusu.jhtp.chapter8.exercises._806;

public class SavingsAccount {
    private static double annualInterestRate;

    private double savingsBalance;

    public SavingsAccount(double bal) {
        savingsBalance = bal;
    }

    public static void setInterest(double newInterest) {
        annualInterestRate = newInterest;
    }

    public static void modifyInterestBalance(double newBal) {
        annualInterestRate = newBal;
    }

    public double calculateMonthlyInterest() {
        return savingsBalance * annualInterestRate / 12.0;
    }
}
