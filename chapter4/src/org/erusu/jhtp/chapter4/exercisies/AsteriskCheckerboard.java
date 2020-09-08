package org.erusu.jhtp.chapter4.exercisies;

public class AsteriskCheckerboard {
	public static void main(String[] args) {
		for(int row = 0; row < 8; row++) {
			if(row % 2 == 1)
				System.out.print(" ");
			for(int column = 0; column < 8; column++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}