package org.erusu.jhtp.chapter4.exercisies;

import java.util.Scanner;

public class SalesCommissionCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double totalSales = 0;
		double currentSale = 0;
		
		while(true) {
			System.out.print("Enter value(-1 to exit): ");
			currentSale = input.nextDouble();
			
			if(currentSale == -1)
				break;
			else
				totalSales += currentSale;
		}
		
		System.out.println("Salary: " + (200 + 0.09 * totalSales));
		input.close();
	}

}