package org.erusu.jhtp.chapter8.exercises._806;

public class SavingsAccountDriver {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        SavingsAccount.setInterest(0.04);

        System.out.printf("Monthly Interest for saver 1: %.2f%nMonthly Interest for saver 2: %.2f%n",
            saver1.calculateMonthlyInterest(), saver2.calculateMonthlyInterest());

        SavingsAccount.setInterest(0.05);

        System.out.printf("Monthly Interest for saver 1: %.2f%nMonthly Interest for saver 2: %.2f%n",
            saver1.calculateMonthlyInterest(), saver2.calculateMonthlyInterest());
    }
}
