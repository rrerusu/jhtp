package org.erusu.jhtp.chapter2.exercises;
import java.util.Scanner;

public class ExerciseTwentyFour {

	public static void main(String[] args) {
		// instantiate Scanner object 'input'
		Scanner input = new Scanner(System.in);
		
		// Declare variables num1, num2, num3, num4, num5, largest, and smallest
		int num1, num2, num3, num4, num5, largest, smallest;
		
		// Get inputs for num1, num2, num3, num4, and num5
		System.out.print("Enter first number: ");
		num1 = Integer.parseInt(input.nextLine());
		
		System.out.print("Enter second number: ");
		num2 = Integer.parseInt(input.nextLine());
		
		System.out.print("Enter third number: ");
		num3 = Integer.parseInt(input.nextLine());
		
		System.out.print("Enter fourth number: ");
		num4 = Integer.parseInt(input.nextLine());
		
		System.out.print("Enter fifth number: ");
		num5 = Integer.parseInt(input.nextLine());
		
		// Calculate largest
		if(num1 > num2) {
			largest = num1;
		} else {
			largest = num2;
		}
		if(num3 > largest) {
			largest = num3;
		}
		if(num4 > largest) {
			largest = num4;
		}
		if(num5 > largest) {
			largest = num5;
		}
		
		// Calculate smallest
		if(num1 < num2) {
			smallest = num1;
		} else {
			smallest = num2;
		}
		if(num3 < smallest) {
			smallest = num3;
		}
		if(num4 < smallest) {
			smallest = num4;
		}
		if(num5 < smallest) {
			smallest = num5;
		}
		
		// Output results
		System.out.println("Largest is " + largest + "\nSmallest is " + smallest);
		
		// close scanner
		input.close();

	}

}
