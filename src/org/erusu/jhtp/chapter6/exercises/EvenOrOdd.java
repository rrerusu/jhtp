package org.erusu.jhtp.chapter6.exercises;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = 0;
		
		do {
			System.out.print("Enter number(0 to exit): ");
			num = input.nextInt();
			
			if(num != 0) {
				System.out.println(isEven(num) ? String.format("%d is even", num) :
					String.format("%d is odd", num));
			}
		} while(num != 0);
		
		input.close();
	}
	
	public static boolean isEven(int num) {
		return num % 2 == 0;
	}
}
