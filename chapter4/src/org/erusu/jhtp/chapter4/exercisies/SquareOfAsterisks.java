package org.erusu.jhtp.chapter4.exercisies;

import java.util.Scanner;

public class SquareOfAsterisks {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int size;
		
		System.out.print("Enter size of square: ");
		size = input.nextInt();
		
		if(size == 1)
			System.out.println("*");
		else
			for(int row = 0; row < size; row++) {
				
				for(int col = 0; col < size; col++) {
					
					if(row == 0 || row == size - 1)
						System.out.print("*");
					else
						System.out.print((col == 0 || col == size - 1)? "*" : " ");
				}
				System.out.println();
				
			}
		
		input.close();
	}
}