package org.erusu.jhtp.chapter3.examples;

public class Account {
	
	private double balance;
	
	// constructor that sets initial balance
	public Account(double initialBalance) {
		if(initialBalance > 0.0) {
			balance = initialBalance;
		}
	}
	
	// add an amount to the account
	public void credit(double amount) {
		balance += amount;
	}
	
	// 3.12 addition: withdraw amount from account
	public void debit(double withdrawalAmt) {
		if(withdrawalAmt < balance) {
			balance -= withdrawalAmt;
		} else {
			System.out.print("Debit amount exceeded account balance.\n");
		}
	}
	
	// get method for variable balance
	public double getBalance() {
		return balance;
	}

}
