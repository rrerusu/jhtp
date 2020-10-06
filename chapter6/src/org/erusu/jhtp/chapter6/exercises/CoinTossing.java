package org.erusu.jhtp.chapter6.exercises;

import java.util.Random;
import java.util.Scanner;

public class CoinTossing {
	
	private static final Random randGen = new Random();
	private enum coin {HEADS, TAILS};
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int headCount = 0,
			tailsCount = 0;
		char choice;
		
		do {
			System.out.print("Flip coin? (y to continue, n to exit): ");
			choice = input.next().charAt(0);
			
			if(flip() == coin.HEADS) {
				System.out.println("Heads");
				headCount++;
			}
			else {
				System.out.println("Tails");
				tailsCount++;
			}
		} while(choice == 'y');
		
		System.out.println("Heads: " + headCount + "\nTails: " + tailsCount);
		
		input.close();
	}
	
	public static CoinTossing.coin flip() {
		if(randGen.nextInt(2) == 1)
			return coin.HEADS;
		else
			return coin.TAILS;
	}
}
