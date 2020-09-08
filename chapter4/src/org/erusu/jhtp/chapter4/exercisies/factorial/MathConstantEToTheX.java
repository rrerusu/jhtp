package org.erusu.jhtp.chapter4.exercisies.factorial;

import java.util.Scanner;
import java.lang.Math;

public class MathConstantEToTheX {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int currentNum,
			factorial = 1,
			tempForFactorial,
			numTerms,
			exponent;
		
		double mathConstE = 1;
		
		System.out.print("Enter number of terms of e to calculate: ");
		numTerms = input.nextInt();
		currentNum = numTerms;
		tempForFactorial = currentNum;
		
		System.out.print("Enter exponent to raise e: ");
		exponent = input.nextInt();
		
		while(currentNum > 0) {
			while(tempForFactorial > 0) {
				factorial *= tempForFactorial--;
			}
			
			mathConstE += Math.pow(exponent, currentNum) / factorial;
			tempForFactorial = currentNum-- - 1;
			factorial = 1;
		}
		
		System.out.println("e to " + numTerms + " terms to the power of " + exponent + " = " + mathConstE);
		
		input.close();
	}
}