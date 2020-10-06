package org.erusu.jhtp.chapter6.exercises;

import java.util.Scanner;

public class ParkingCharges {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double hoursParked = 0;
		double totalCost = 0;
		
		do {
			totalCost += calculateCharges(hoursParked);
			System.out.print("Enter hours parked, -1 to exit: ");
			hoursParked = input.nextDouble();
			
		}while(hoursParked > -1);
		
		System.out.println("Total: " + totalCost);
		
		input.close();
	}
	
	public static double calculateCharges(double hours) {
		if(hours > 0) {
			if(hours <= 3)
				return 2;
			else
				return 2 + (hours - 3) * 0.5;
		} else
			return 0;
	}
}
