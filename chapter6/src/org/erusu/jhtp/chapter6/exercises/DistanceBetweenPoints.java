package org.erusu.jhtp.chapter6.exercises;

import java.util.Scanner;

public class DistanceBetweenPoints {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter point 1 with space between x and y: ");
		double x1 = input.nextDouble(),
			y1 = input.nextDouble();
		
		System.out.print("Enter point 2 with space between x and y: ");
		double x2 = input.nextDouble(),
			y2 = input.nextDouble();
		
		System.out.printf("Distance between (%f, %f) and (%f, %f) is %f",
				x1, y1, x2, y2, calcDistance(x1, y1, x2, y2));
		
		input.close();
	}
	
	public static double calcDistance(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}
}
