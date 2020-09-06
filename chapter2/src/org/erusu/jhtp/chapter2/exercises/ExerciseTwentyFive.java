package org.erusu.jhtp.chapter2.exercises;
import java.util.Scanner;

public class ExerciseTwentyFive {

	public static void main(String[] args) {
		// instantiate Scanner object 'input'
		Scanner input = new Scanner(System.in);
		
		// declare variable num
		int num;
		
		// get input
		System.out.print("Enter number: ");
		num = Integer.parseInt(input.nextLine());
		
		// calculate whether num1 is even or odd and return result
		if(num % 2 == 0) {
			System.out.println(num + " is even");
		} else {
			System.out.println(num + " is odd");
		}
		
		// close scanner
		input.close();

	}

}
