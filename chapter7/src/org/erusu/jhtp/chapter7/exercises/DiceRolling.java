package org.erusu.jhtp.chapter7.exercises;

import java.util.Random;

public class DiceRolling {
	public static void main(String[] args) {
		Random randGen = new Random();
		int sums[] = new int[11],
			num1,
			num2;
		
		for(int counter = 0; counter < 36000000; counter++) {
			num1 = randGen.nextInt(6) + 1;
			num2 = randGen.nextInt(6) + 1;
			sums[num1 + num2 - 2]++;
		}
		
		for(int counter = 0; counter < sums.length; counter++)
			System.out.printf("%d: %d%n",
				counter + 2, sums[counter]);
	}
}