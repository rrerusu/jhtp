package org.erusu.jhtp.chapter6.exercises;

import java.util.Random;
import java.util.Scanner;

public class CrapsWithWager {
	
	private static final Random randomNumbers = new Random();
	
	private enum Status {CONTINUE, WON, LOST};
	
	private static double bankBalance = 1000;
	
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double wager = 0;
		
		while(bankBalance > 0) {
			
			// 6.33 addition: random chatter
			switch(randomNumbers.nextInt(3)) {
				case 0:
					System.out.println("Oh, you're going for broke, huh?");
					break;
				case 1:
					System.out.println("Aw c'mon, take a chance!");
					break;
				case 2:
					System.out.println("You're up big. Now's the time to cash in your chips!");
					break;
			}
			
			System.out.println("Bank Balance: " + bankBalance);
			do {
				System.out.print("Enter wager: ");
				wager = input.nextDouble();
			} while (wager > bankBalance || wager < 0);
			
			playCraps(wager);
		}
		
		System.out.println("Sorry. You busted!");
		
		input.close();
	}
	
	public static int rollDice() {
		int die1 = 1 + randomNumbers.nextInt(6);
		int die2 = 1 + randomNumbers.nextInt(6);
		
		int sum = die1 + die2;
		
		System.out.printf("Player rolled %d + %d = %d\n",
				die1, die2, sum);
		
		return sum;
	}
	
	public static void playCraps(double wager) {
		int myPoint = 0;
		
		int sumOfDice = rollDice();
		Status gameStatus;
		
		switch(sumOfDice) {
			case SEVEN:
			case YO_LEVEN:
				gameStatus = Status.WON;
				break;
			case SNAKE_EYES:
			case TREY:
			case BOX_CARS:
				gameStatus = Status.LOST;
				break;
			default:
				gameStatus = Status.CONTINUE;
				myPoint = sumOfDice;
				System.out.printf("Point is %d\n", myPoint);
				break;
		}
		
		while(gameStatus == Status.CONTINUE) {
			sumOfDice = rollDice();
			
			if(sumOfDice == myPoint)
				gameStatus = Status.WON;
			
			else
				if(sumOfDice == SEVEN)
					gameStatus = Status.LOST;
		}
		
		if(gameStatus == Status.WON) {
			System.out.println("Player wins");
			bankBalance += wager;
		}
		else {
			System.out.println("Player looses");
			bankBalance -= wager;
		}
	}
}
