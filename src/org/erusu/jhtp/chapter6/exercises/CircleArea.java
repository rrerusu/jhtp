package org.erusu.jhtp.chapter6.exercises;

import java.util.Scanner;

public class CircleArea {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double rad = input.nextDouble();
		
		System.out.printf("Circle with radius %f has area %f", rad, calcCircleArea(rad));
		
		input.close();
	}
	
	public static double calcCircleArea(double radius) {
		return Math.pow(Math.PI, 2) * radius;
	}
}
