package org.erusu.jhtp.chapter3.examples;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		// create account objects
		Account account1 = new Account(50.00);
		Account account2 = new Account(-7.53);
		
		// instantiate Scanner object 'input'
		Scanner input = new Scanner(System.in);
		
		// declare variable depositAmount
		// double depositAmount;
		double withdrawalAmount;		// 3.12 addition: used to test debit method
		
		// display initial amounts in each account
		System.out.printf("account1 balance: $%.2f%n", account1.getBalance());
		System.out.printf("account2 balance: $%.2f%n%n", account2.getBalance());
		
		/*
		// prompt user to enter amount of money to deposit in account1
		System.out.print("Enter deposit amount for account1: ");
		depositAmount = Double.parseDouble(input.nextLine());
		
		// notify user that their deposit is happening
		System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
		account1.credit(depositAmount);
		
		// display balances
		System.out.printf("account1 balance: $%.2f%n", account1.getBalance());
		System.out.printf("account2 balance: $%.2f%n%n", account2.getBalance());
		
		// prompt user to enter amount of money to deposit in account2
		System.out.print("Enter deposit amount for account2: ");
		depositAmount = Double.parseDouble(input.nextLine());
		
		// notify use that their deposit is happening
		System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
		account2.credit(depositAmount);
		*/
		
		// 3.13 addition: prompt use to enter amount of money to withdraw from account1 and account2
		System.out.print("Enter withdrawal amount from account1: ");
		withdrawalAmount = Double.parseDouble(input.nextLine());
		account1.debit(withdrawalAmount);
		
		System.out.print("Enter withdrawal amount from account2: ");
		withdrawalAmount = Double.parseDouble(input.nextLine());
		account2.debit(withdrawalAmount);
		
		
		// display balances
		System.out.printf("account1 balance: $%.2f%n", account1.getBalance());
		System.out.printf("account2 balance: $%.2f%n", account2.getBalance());
		
		// close scanner
		input.close();
	}

}
