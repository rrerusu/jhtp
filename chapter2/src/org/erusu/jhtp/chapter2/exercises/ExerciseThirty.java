package org.erusu.jhtp.chapter2.exercises;
import java.util.Scanner;

public class ExerciseThirty {

	public static void main(String[] args) {
		// instantiate Scanner object 'input'
		Scanner input = new Scanner(System.in);
		
		// Declare variable num
		int num;
		
		// Declare variable newNum
		String newNum;
		
		// Get user input
		System.out.print("Enter number: ");
		num = Integer.parseInt(input.nextLine());
		
		// Calculate number spaced out
		newNum = num / 10000 + "   " +
				 (num % 10000) / 1000 + "   " +
				 (num % 1000) / 100 + "   " +
				 (num % 100) / 10 + "   " + 
				 (num % 10);
		
		// Print output
		System.out.print(newNum);
		
		// close scanner
		input.close();

	}

}