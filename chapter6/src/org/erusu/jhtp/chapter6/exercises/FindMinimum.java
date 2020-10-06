package org.erusu.jhtp.chapter6.exercises;

import java.util.Scanner;

public class FindMinimum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first num: ");
		float num1 = input.nextFloat();
		
		System.out.print("Enter second num: ");
		float num2 = input.nextFloat();
		
		System.out.print("Enter third num: ");
		float num3 = input.nextFloat();
		
		System.out.print("Smallest: " + minimum3(num1, num2, num3));
		
		input.close();
	}
	
	public static float minimum3(float num1, float num2, float num3) {
		return Math.min(num1, Math.min(num2, num3));
	}

}
