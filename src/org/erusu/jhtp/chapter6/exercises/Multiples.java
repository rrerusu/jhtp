package org.erusu.jhtp.chapter6.exercises;

import java.util.Scanner;

public class Multiples {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = 1, num2 = 1;
		
		while(num > 0 && num2 > 0) {
			System.out.print("Enter number to test as multiple and other number with space between (-1 to exit): ");
			num = input.nextInt();
			num2 = input.nextInt();
			
			if(num > 0 && num2 > 0) {
				System.out.println(isMultiple(num, num2) ? String.format("%d is a multiple of %d", num, num2) :
					String.format("%d is not a multiple of %d", num, num2));
			}
		}
		
		input.close();
	}
	
	public static boolean isMultiple(int num, int potentialFactor) {
		return num % potentialFactor == 0;
	}
}
