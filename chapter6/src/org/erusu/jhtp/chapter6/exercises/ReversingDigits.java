package org.erusu.jhtp.chapter6.exercises;

import java.util.Scanner;

public class ReversingDigits {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int num = input.nextInt();
		
		System.out.println("Reverse: " + reverseNum(num));
		
		input.close();
	}
	
	public static String reverseNum(int num) {
		if(num / 10 == 0)
			return "" + num;
		else
			return "" + (num % 10) + reverseNum(num / 10);
	}
}
