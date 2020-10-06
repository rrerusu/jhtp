package org.erusu.jhtp.chapter6.exercises;

import java.util.Scanner;

public class Exponentiation {
	
	private static final Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Enter base: ");
		int base = input.nextInt();
		
		System.out.print("Enter exponent: ");
		int exp = input.nextInt();
		
		System.out.printf("%d to the power of %d is %d", base, exp, integerPower(base, exp));
		
		input.close();
	}
	
	public static int integerPower(int base, int exponent) {
		int result = 1;
		for(int counter = 0; counter < exponent; counter++) {
			result *= base;
		}
		
		return result;
	}
}
