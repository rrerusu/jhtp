package org.erusu.jhtp.chapter5.exercises;

public class ProductOfOddInts {
	public static void main(String[] args) {
		int product = 1;
		
		for(int counter = 1; counter <= 15; counter += 2) {
			product *= counter;
		}
		
		System.out.println("product of odd nums between 1 and 15 (inclusive)  is: " + product);
	}
}