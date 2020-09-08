package org.erusu.jhtp.chapter4.exercisies;

import java.util.Scanner;
import java.lang.Math;

public class SideOfRightTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int leg1, leg2, hypotenuse;
		
		System.out.print("Enter length of side 1: ");
		leg1 = input.nextInt();
		System.out.print("Enter length of side 2: ");
		leg2 = input.nextInt();
		System.out.print("Enter length of side 3: ");
		hypotenuse = input.nextInt();
		
		if(leg1 > hypotenuse && leg1 > leg2) {
			int temp = hypotenuse;
			hypotenuse = leg1;
			leg1 = temp;
		} else
			if(leg2 > hypotenuse && leg2 > leg1) {
				int temp = hypotenuse;
				hypotenuse = leg2;
				leg2 = temp;
			}
		
		System.out.println((Math.pow(leg1, 2) + Math.pow(leg2, 2) == Math.pow(hypotenuse, 2))
				? "Numbers entered make a right triangle." : "Numbers entered do not make a right triangle.");
		
		input.close();
	}
}