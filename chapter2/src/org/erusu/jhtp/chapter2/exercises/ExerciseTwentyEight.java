package org.erusu.jhtp.chapter2.exercises;
import java.util.Scanner;
import java.lang.Math;

public class ExerciseTwentyEight {

	public static void main(String[] args) {
		// instantiate Scanner object 'input'
		Scanner input = new Scanner(System.in);
		
		// Declare variables radius and diameter
		int radius, diameter;
		
		// Declare variables circumference and area
		double circumference, area;
		
		// Get user input for radius
		System.out.print("Enter radius of the circle: ");
		radius = Integer.parseInt(input.nextLine());
		
		// Calculate diameter, circumference, and area
		diameter = 2 * radius;
		circumference = 2 * radius * 3.14159;
		area = 3.14159 * Math.pow(radius, 2);
		
		// Output values
		System.out.printf("Diameter = %d%nCircumference = %f%nArea = %f%n" , diameter, circumference, area);
		
		// close scanner
		input.close();

	}

}
