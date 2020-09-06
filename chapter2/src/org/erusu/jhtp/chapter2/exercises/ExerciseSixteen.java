package org.erusu.jhtp.chapter2.exercises;
import java.util.Scanner;

public class ExerciseSixteen {

	public static void main(String[] args) {
		// Instantiate Scanner object 'input'
		Scanner input = new Scanner(System.in);
		
		// Declare variables for num1 and num2
		int num1, num2;
		
		// Get user input
		System.out.print("Enter number 1: ");
		num1 = Integer.parseInt(input.nextLine());
		
		System.out.print("Enter number 2: ");
		num2 = Integer.parseInt(input.nextLine());
		
		if(num1 == num2) {
			System.out.println("These numbers are equal");
		} else if(num1 > num2) {
			System.out.println(num1 + " is greater");
		} else {
			System.out.println(num2 + " is greater");
		}
		
		// close scanner
		input.close();

	}

}
