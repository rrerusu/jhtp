package org.erusu.jhtp.chapter6.exercises;

import java.util.Scanner;

public class SeparatingDigits {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		for(int counter = 0; counter < 99999; counter++) {
			System.out.println(displayDigits(counter + 1));
		}
		
		input.close();
	}
	
	public static int getQuotient(int dividend, int divisor) {
		return dividend / divisor;
	}
	
	public static int getRemainder(int dividend, int divisor) {
		return dividend % divisor;
	}
	
	public static String displayDigits(int num) {
		String digits = "";
		
		while(num > 9) {
			digits = "  " + getRemainder(num, 10) + digits;
			num = getQuotient(num, 10);
		}
		
		return (num + digits);
	}
}
