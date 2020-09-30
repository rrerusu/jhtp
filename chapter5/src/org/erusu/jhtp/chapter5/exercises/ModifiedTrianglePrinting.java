package org.erusu.jhtp.chapter5.exercises;

public class ModifiedTrianglePrinting {
	public static void main(String[] args) {
		String bottomLeft = "",
			   topLeft = "",
			   topRight = "",
			   bottomRight = "";
		
		for(int row = 0; row < 10; row++) {
			for(int column = 0; column <= row; column++) {
				bottomLeft += "*";
				bottomRight += "*";
			}
			
			for(int column = 0; column < 10 - row; column++) {
				topLeft += "*";
				topRight += "*";
			}
			
			System.out.printf("%-10s %10s %-10s %10s%n", bottomLeft, bottomRight, topLeft, topRight);
			bottomLeft = "";
			bottomRight = "";
			topLeft = "";
			topRight = "";
		}
	}
}
