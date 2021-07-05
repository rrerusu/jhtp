package org.erusu.jhtp.chapter4.exercisies;

import java.util.Scanner;

public class FindTheTwoLargest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int largest = Integer.MIN_VALUE, 
			secondLargest = Integer.MIN_VALUE, 
			number = 0;
		
		for(int counter = 0; counter < 10; counter++) {
			System.out.print("Enter number " + (counter + 1) + ": ");
			number = input.nextInt();
			
			if(number >= largest) {
				secondLargest = largest;
				largest = number;
			} else
				if(number >= secondLargest)
					secondLargest = number;
		}
		
		System.out.println("Largest = " + largest + "\nSecond largest = " + secondLargest);
		
		input.close();
	}
}