package org.erusu.jhtp.chapter4.examples;

import java.util.Scanner;

public class Analysis {

	public static void main(String[] args) {
		
		// Instantiate Scanner object 'input'
		Scanner input = new Scanner(System.in);

		// initialize and declare variables
		int passes, failures, studentCounter, result;
		passes = 0;
		failures = 0;
		studentCounter = 1;
		
		// process 10 students
		while(studentCounter <= 10) {
			// prompt user for pass or fail
			System.out.print("Enter result (1 = pass, 2 = fail): ");
			result = input.nextInt();
			
			// add to passes or fails based off results
			if(result == 1)
				passes++;
			else
				failures++;
			
			// increment student counter
			studentCounter++;
		}
		
		// display results
		System.out.printf("# Passed: %d%n# Failed: %d%n", passes, failures);
		
		// determine bonus to instructor
		if (passes > 8)
			System.out.println("Bonus to instructor!");
		
		// close input
		input.close();
	}

}
