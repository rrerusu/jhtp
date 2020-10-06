package org.erusu.jhtp.chapter6.exercises;

import java.util.Scanner;

public class RoundingNumbersSpecific {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number to round: ");
		double num = input.nextDouble();
		
		System.out.printf("%f rounded to nearest integer: %d" + 
				"%n%f rounded to nearest tenth: %.1f" + 
				"%n%f rounded to nearest hundredth: %.2f" + 
				"%n%f rounded to nearest thousandth: %.3f",
				num, roundToInteger(num),
				num, roundToTenths(num),
				num, roundToHundredths(num),
				num, roundToThousandths(num));
		
		input.close();
	}
	
	public static int roundToInteger(double x) {
		return (int) Math.floor(x + 0.5);
	}
	
	public static double roundToTenths(double x) {
		return Math.floor(x * 10 + 0.5) / 10;
	}
	
	public static double roundToHundredths(double x) {
		return Math.floor(x * 100 + 0.5) / 100;
	}
	
	public static double roundToThousandths(double x) {
		return Math.floor(x * 1000 + 0.5) / 1000;
	}
}
