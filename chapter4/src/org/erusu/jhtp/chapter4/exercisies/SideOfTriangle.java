package org.erusu.jhtp.chapter4.exercisies;

import java.util.Scanner;
import java.lang.Math;

public class SideOfTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int side1,
			side2,
			side3;
		
		System.out.print("Enter length of side 1: ");
		side1 = Math.abs(input.nextInt());
		System.out.print("Enter length of side 2: ");
		side2 = Math.abs(input.nextInt());
		System.out.print("Enter length of side 3: ");
		side3 = Math.abs(input.nextInt());
		
		System.out.println((side1 < side2 + side3 && 
							side1 > Math.abs(side2 - side3) &&
							side2 < side1 + side3 &&
							side2 > Math.abs(side1 - side3) &&
							side3 < side2 + side1 &&
							side3 > Math.abs(side2 - side1))
				? "Numbers entered make a triangle." : "Numbers entered do not make a triangle.");
		
		input.close();
	}
}