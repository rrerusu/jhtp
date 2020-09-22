package org.erusu.jhtp.chapter5.exercises;

public class RightTriangles {
	public static void main(String[] args) {
		
		// triangle, vertex in bottom left
		for(int row = 0; row < 10; row++) {
			for(int column = 0; column <= row; column++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		// triangle, vertex in top left
		for(int row = 0; row < 10; row++) {
			for(int column = 0; column < 10 - row; column++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		String rowOfStars = "";
		
		// triangle, vertex in top right
		for(int row = 0; row < 10; row++) {
			
			for(int column = 0; column < 10 - row; column++) {
				rowOfStars += "*";
			}
			
			System.out.printf("%10s%n", rowOfStars);
			rowOfStars = "";
		}
		
		System.out.println();
		
		// triangle, vertex in bottom right
		for(int row = 0; row < 10; row++) {
			
			for(int column = 0; column <= row; column++) {
				rowOfStars += "*";
			}
			
			System.out.printf("%10s%n", rowOfStars);
			rowOfStars = "";
		}
	}
}