package org.erusu.jhtp.chapter2.exercises;
import java.util.Scanner;

public class ExerciseTwentySix {

	public static void main(String[] args) {
		// instantiate Scanner object 'input'
		Scanner input = new Scanner(System.in);
		
		// Declare variables num1 and num2
		int num1, num2;
		
		// Get inputs
		System.out.print("Enter first number: ");
		num1 = Integer.parseInt(input.nextLine());
		
		System.out.print("Enter second number: ");
		num2 = Integer.parseInt(input.nextLine());
		
		// Calculate whether num1 is a multiple of num2 and print result
		if(num1 % num2 == 0) {
			System.out.println(num1 + " is a multiple of " + num2);
		} else {
			System.out.println(num1 + " is not a multiple of " + num2);
		}
		
		// close scanner
		input.close();

	}

}
