package org.erusu.jhtp.chapter2.exercises;
import java.util.Scanner;

public class ExerciseFifteen{
	public static void main(String[] args){
		// Instantiate Scanner object 'input'
		Scanner input = new Scanner(System.in);
		
		// Declare variables num1, num2, sum, diff, prod, and quot
		int num1, num2, sum, diff, prod;
		double quot;
		
		// Get inputs from user for num1 and num2
		System.out.print("Enter first number: ");
		num1 = Integer.parseInt(input.nextLine());
		
		System.out.print("Enter second number: ");
		num2 = Integer.parseInt(input.nextLine());
		
		// Store the sum, difference, product, and quotient in their respective variables
		sum = num1 + num2;
		diff = num1 - num2;
		prod = num1 * num2;
		quot = (double) num1 / num2;
		
		// Print results
		System.out.println(num1 + " + " + num2 + " = " + sum);
		System.out.println(num1 + " - " + num2 + " = " + diff);
		System.out.println(num1 + " * " + num2 + " = " + prod);
		System.out.println(num1 + " / " + num2 + " = " + quot);
		
		// close input
		input.close();
	}
}