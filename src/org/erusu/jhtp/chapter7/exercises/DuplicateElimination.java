package org.erusu.jhtp.chapter7.exercises;

import java.util.Scanner;

public class DuplicateElimination {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num,
			numArr[] = new int[5],
			nextValidIndex = 0;
		
		boolean isContained = false;
		
		for(int counter = 0; counter < 5; counter++) {
			System.out.print("Enter number between 10 and 100: ");
			num = input.nextInt();
			for(int testNum : numArr) {
				if(num == testNum) {
					isContained = true;
				}
			}
			
			if(isContained == false) {
				System.out.println(num);
				numArr[nextValidIndex] = num;
				nextValidIndex++;
				for(int number : numArr) {
					if(number != 0)
						System.out.print(number + " ");
				}
			}
			System.out.println();
			isContained = false;
		}
		
		input.close();
	}
}