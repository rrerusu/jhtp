package org.erusu.jhtp.chapter6.exercises;

import java.util.Scanner;
import java.lang.Math;

public class HypotenuseCalculations {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter leg 1: ");
		double leg1 = input.nextDouble();
		System.out.print("Enter leg 2: ");
		double leg2 = input.nextDouble();
		
		System.out.printf("Hypotenuse = %f", calcHypotenuse(leg1, leg2));
		
		input.close();
	}
	
	public static double calcHypotenuse(double leg1, double leg2) {
		return Math.sqrt(Math.pow(leg1, 2) + Math.pow(leg2, 2));
	}
}
