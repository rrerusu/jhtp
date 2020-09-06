package org.erusu.jhtp.chapter2.exercises;
import java.util.Scanner;

public class ExerciseSeventeen {

	public static void main(String[] args) {
		// Create object Scanner 'input'
		Scanner input = new Scanner(System.in);
		
		// Declare variables num1, num2, num3, sum, and product
		int num1, num2, num3, sum, product, largest, smallest;
		
		// Declare variable average
		double average;
		
		// Get input
		System.out.print("Enter first number: ");
		num1 = Integer.parseInt(input.nextLine());
		
		System.out.print("Enter second number: ");
		num2 = Integer.parseInt(input.nextLine());
		
		System.out.print("Enter third number: ");
		num3 = Integer.parseInt(input.nextLine());
		
		// calculate sum, average, product
		sum = num1 + num2 + num3;
		average = (double)sum / 3;
		product = num1 * num2 * num3;
		
		// calculate largest
		if(num1 > num2) {
			largest = num1;
		} else {
			largest = num2;
		}
		
		if(num3 > largest) {
			largest = num3;
		}
		
		// calculate smallest
		if(num1 < num2) {
			smallest = num1;
		} else {
			smallest = num2;
		}
		
		if(num3 < smallest) {
			smallest = num3;
		}
		
		// Print results
		System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + sum);
		System.out.println("Average of " + num1 + ", " + num2 + ", and " + num3 + " is " + average);
		System.out.println(num1 + " * " + num2 + " * " + num3 + " = " + product);
		System.out.println("The smallest is " + smallest + "\nThe largest is " + largest);
		
		// close scanner
		input.close();
	}
}