package org.erusu.jhtp.chapter4.exercisies;

import java.util.Scanner;

public class Palindromes {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0, reverse = 0, currentNum = 0;
		boolean getInput = true;
		
		while(getInput == true) {
			System.out.print("Enter number: ");
			num = input.nextInt();
			
			currentNum = num;
			
			if(num / 10000 < 10 && num / 10000 > 0)
				getInput = false;
		}
		
		while(currentNum != 0) {
			reverse = reverse * 10 + (currentNum % 10);
			currentNum /= 10;
		}
		
		System.out.println((reverse == num) ? num + " is a palindrome." : num + " isn't a palindrome.");
		
		input.close();
	}
}