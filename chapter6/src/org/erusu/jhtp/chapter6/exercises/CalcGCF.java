package org.erusu.jhtp.chapter6.exercises;

import java.util.Scanner;

public class CalcGCF {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter 2 numbers: ");
		int num1 = input.nextInt(),
			num2 = input.nextInt();
		
		System.out.printf("GCF of %d and %d: %d", num1, num2, calcGCF(num1, num2));
		
		input.close();
	}
	
	public static int calcGCF(int num1, int num2) {
		int min = Math.min(num1, num2),
			max = Math.max(num1, num2);
		
		if(max % min == 0)
			return min;
		else
			return calcGCF(max - min, min);
	}

}
