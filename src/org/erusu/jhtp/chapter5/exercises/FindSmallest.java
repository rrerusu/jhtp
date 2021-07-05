package org.erusu.jhtp.chapter5.exercises;

import java.util.Scanner;

public class FindSmallest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int inputAmt,
			currentNum,
			smallest = Integer.MAX_VALUE;
		
		System.out.print("Enter amount of numbers to compare: ");
		inputAmt = input.nextInt();
		
		for(int counter = 0; counter < inputAmt; counter++) {
			System.out.print("Enter number: ");
			currentNum = input.nextInt();
			
			if(currentNum < smallest)
				smallest = currentNum;
		}
		
		System.out.println(smallest);
		
		input.close();
	}
}