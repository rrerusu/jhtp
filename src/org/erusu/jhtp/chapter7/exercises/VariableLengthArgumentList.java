package org.erusu.jhtp.chapter7.exercises;

public class VariableLengthArgumentList {
	public static void main(String[] args) {
		System.out.println(product(1, 2));
		System.out.println(product(1, 2, 3));
		System.out.println(product(1, 2, 3, 4));
		System.out.println(product(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18));
	}
	
	public static int product(int... nums) {
		int product = 1;
		
		for(int num : nums)
			product *= num;
		
		return product;
	}
}