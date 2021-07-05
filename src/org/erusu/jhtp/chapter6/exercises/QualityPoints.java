package org.erusu.jhtp.chapter6.exercises;

import java.util.Scanner;

public class QualityPoints {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int grade = 0;
		
		do {
			System.out.print("Enter grade (-1 to exit): ");
			grade = input.nextInt();
		} while(grade > -1);
		
		System.out.printf("Quality points: %d", qualityPoints(grade));
		
		input.close();
	}
	
	public static int qualityPoints(int grade) {
		if(grade > 90)
			return 4;
		else if(grade > 80)
			return 3;
		else if(grade > 70)
			return 2;
		else if(grade > 60)
			return 1;
		else
			return 0;
	}
}
