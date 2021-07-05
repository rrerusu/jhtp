package org.erusu.jhtp.chapter5.exercises;

import java.util.Scanner;

public class CalulatingSales {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int prodNum, qty;
		
		double total = 0;
		
		System.out.println("Product 1: $2.98\nProduct 2: $4.50\nProduct 3: $9.98\nProduct 4: $4.49\n" +
				"Produt 5: $6.87\n");
		
		for(int counter = 0; counter < 5; counter++) {
			
			System.out.print("Enter product number: ");
			prodNum = input.nextInt();
			System.out.print("Enter quantity: ");
			qty = input.nextInt();
			
			switch(prodNum) {
				case 1:
					total += qty * 2.98;
					break;
				case 2:
					total += qty * 4.50;
					break;
				case 3:
					total += qty * 9.98;
					break;
				case 4:
					total += qty * 4.49;
					break;
				case 5:
					total += qty * 6.78;
			}
		}
		
		System.out.printf("Total: $%.2f", total);
		
		input.close();
	}
}