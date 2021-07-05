package org.erusu.jhtp.chapter5.exercises;

public class Factorials {
	public static void main(String[] args) {
		long factorial;
		
		System.out.println(" n                   n!");
		for(int counter = 1; counter < 21; counter++) {
			factorial = 1;
			for(int factorialCounter = 1; factorialCounter <= counter; factorialCounter++) {
				factorial *= factorialCounter;
			}
			System.out.printf("%2d  %19d%n", counter, factorial);
		}
	}
}