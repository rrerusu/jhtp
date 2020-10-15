package org.erusu.jhtp.chapter7.examples;

public class EnhancedForLoop {
	public static void main(String[] args) {
		int array[] = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87},
			total = 0;
		
		for(int number : array)
			total += number;
		
		System.out.printf("Total of array elements: %d%n", total);
	}
}
