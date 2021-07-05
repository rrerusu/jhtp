package org.erusu.jhtp.chapter7.exercises;

import java.util.Scanner;

public class SalesCommission {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int ranges[] = new int[9],
			salary;
		
		System.out.print("Enter gross (-1 to exit): ");
		double gross = input.nextDouble();
		
		while(gross != -1) {
			salary = (int) (200 + gross * 0.09);
			if(salary > 1000)
				ranges[8]++;
			else
				ranges[(salary / 100) - 2]++;
			
			System.out.print("Enter gross (-1 to exit): ");
			gross = input.nextDouble();
		}
		
		for(int counter = 0; counter < ranges.length; counter++) {
			System.out.printf("%d-%d: %d%n", (counter + 2) * 100,
					(counter + 2) * 100 + 99, ranges[counter]);
		}
		
		input.close();
	}
}