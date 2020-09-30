package org.erusu.jhtp.chapter5.exercises;

import java.util.Scanner;

public class TaxPlanAlternative {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double expense = 0,
			total = 0;
		
		do {
			total += expense;
			System.out.print("Enter expense (-1 to exit): ");
			expense = input.nextDouble();
		} while(expense != -1);
		
		System.out.println("Total expenses without Fair Tax: " + total + 
				"\nTotal expenses with Fair Tax: " + total * 1.23);
		
		input.close();
	}
}
