package org.erusu.jhtp.chapter5.exercises;

import java.util.Scanner;

public class ModifiedDiamondPrinter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		
		while(num % 2 == 0) {
			System.out.print("Enter odd number between 1 - 19: ");
			num = Integer.parseInt(input.next());
		}
		
		System.out.println("\nDiamond of size " + num + ":\n");
		
		for(int row = 0; row < num; row++) {
			for(int column = 0; column < num; column++) {
				if(column > Math.abs(num / 2 - row) - 1 &&
					column < num - Math.abs(num / 2 - row))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		input.close();
	}
}
