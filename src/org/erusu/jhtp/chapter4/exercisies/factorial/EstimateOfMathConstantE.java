package org.erusu.jhtp.chapter4.exercisies.factorial;

import java.util.Scanner;

public class EstimateOfMathConstantE {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int currentNum,
			factorial = 1,
			tempForFactorial,
			numTerms;
		
		double mathConstE = 1;
		
		System.out.print("Enter number of terms of e to calculate: ");
		numTerms = input.nextInt();
		currentNum = numTerms;
		tempForFactorial = currentNum;
		
		// An approximation for e is 1 + 1/1! + 1/2! + ...
		while(currentNum > 0) {
			
			// calculate factorial
			while(tempForFactorial > 0) {
				factorial *= tempForFactorial--;
			}
			
			// add 1 / n! to current value
			mathConstE += 1.0 / factorial;
			tempForFactorial = currentNum-- - 1;
			factorial = 1;
		}
		
		System.out.println("e to " + numTerms + " terms = " + mathConstE);
		
		input.close();
	}
}