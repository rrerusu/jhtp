package org.erusu.jhtp.chapter4.exercisies.factorial;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int factorial = 1,
			numToCalcFactorial,
			currentNum;
		
		System.out.print("Enter non-negative number to calculate factorial: ");
		numToCalcFactorial = input.nextInt();
		currentNum = numToCalcFactorial;
		
		// calculate factorial
		while(currentNum > 0) {
			factorial *= currentNum--;
		}
		
		System.out.println(numToCalcFactorial + "! = " + factorial);
		
		input.close();
	}
}