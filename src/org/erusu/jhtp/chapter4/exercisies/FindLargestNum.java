package org.erusu.jhtp.chapter4.exercisies;

import java.util.Scanner;

public class FindLargestNum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number, largest = Integer.MIN_VALUE;
		
		for(int counter = 0; counter < 10; counter++) {
			System.out.print("Enter number " + (counter + 1) + ": ");
			number = input.nextInt();
			
			if(largest < number)
				largest = number;
		}
		
		System.out.println("Largest number = " + largest);
		
		input.close();
	}

}
