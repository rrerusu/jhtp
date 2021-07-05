package org.erusu.jhtp.chapter6.exercises;

import java.util.Scanner;

public class SquareOfAsterisks {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter size: ");
		int sideLength = input.nextInt();
		
		// 6.19 Addition
		System.out.print("Enter character to fill square in: ");
		char charToFill = input.next().charAt(0);
		
		System.out.println();
		createAsteriskSquare(sideLength, charToFill);
		
		input.close();
	}
	
	// 6.19 Addition: fill square with any character
	public static void createAsteriskSquare(int size, char fillCharacter) {
		for(int row = 0; row < size; row++) {
			for(int col = 0; col < size; col++) {
				System.out.print(fillCharacter);
			}
			System.out.println();
		}
	}
}
