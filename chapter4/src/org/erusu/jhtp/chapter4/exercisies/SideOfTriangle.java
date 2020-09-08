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
		side1 = input.nextInt();
		System.out.print("Enter length of side 2: ");
		side2 = input.nextInt();
		System.out.print("Enter length of side 3: ");
		side3 = input.nextInt();
		
		System.out.println((Math.abs(side1) < Math.abs(side2) + Math.abs(side3) && 
							Math.abs(side1) > Math.abs(Math.abs(side2) - Math.abs(side3)) &&
							Math.abs(side2) < Math.abs(side1) + Math.abs(side3) &&
							Math.abs(side2) > Math.abs(Math.abs(side1) - Math.abs(side3)) &&
							Math.abs(side3) < Math.abs(side2) + Math.abs(side1) &&
							Math.abs(side3) > Math.abs(Math.abs(side2) - Math.abs(side1))) 
				? "Numbers entered makes a triangle." : "Numbers enterd do not make a triangle.");
		
		input.close();
	}
}