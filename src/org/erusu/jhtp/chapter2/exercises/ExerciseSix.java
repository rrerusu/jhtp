package org.erusu.jhtp.chapter2.exercises;
import java.util.Scanner;

public class ExerciseSix {
	public static void main(String[] args) {
		// Instantiate scanner object 'input'
		Scanner input = new Scanner(System.in);
		
		// Declare variables int1, int2, int3, and product
		int int1, int2, int3, product;
		
		// Get user inputs for first 3 numbers
		System.out.print("Enter first integer: ");
		int1 = Integer.parseInt(input.nextLine());
		
		System.out.print("Enter second integer: ");
		int2 = Integer.parseInt(input.nextLine());
		
		System.out.print("Enter third integer: ");
		int3 = Integer.parseInt(input.nextLine());
		
		// multiply all 3 numbers and return result
		product = int1 * int2 * int3;
		System.out.printf("%d * %d * %d = %d", int1, int2, int3, product);
		
		// close scanner
		input.close();
	}
}