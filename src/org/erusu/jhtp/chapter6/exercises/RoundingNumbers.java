package org.erusu.jhtp.chapter6.exercises;

import java.util.Scanner;

public class RoundingNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		double num = input.nextDouble();
		
		double roundedNum = round(num);
		
		System.out.println("\nOriginal number: " + num + "\nRounded Num: " + roundedNum);
		
		input.close();
	}
	
	public static double round(double x) {
		double y = Math.floor(x + 0.5);
		return y;
	}
}
