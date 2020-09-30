package org.erusu.jhtp.chapter5.exercises;

import java.lang.Math;

public class DiamondPrinter {

	public static void main(String[] args) {
		for(int row = 0; row < 9; row++) {
			for(int column = 0; column < 9; column++) {
				if(column > Math.abs(4 - row) - 1 &&
					column < 9 - Math.abs(4 - row))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
