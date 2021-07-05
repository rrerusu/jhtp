package org.erusu.jhtp.chapter7.exercises;

import java.util.Random;

public class Craps {
	
	private static final Random randomNumbers = new Random();
	
	private enum Status {CONTINUE, WON, LOST};
	
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;
	
	private static int[] winAttempts = new int[21];
	private static int[] looseAttempts = new int[21];
	private static int totalWins = 0;
	
	public static int playCraps() {
		int myPoint = 0,
			rolls = 0;
		
		int sumOfDice = rollDice();
		Status gameStatus;
		
		// handle rolls
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
				// System.out.printf("Point is %d\n", myPoint);
				break;
		}
		
		rolls++;
		
		// continue game
		while(gameStatus == Status.CONTINUE) {
			sumOfDice = rollDice();
			rolls++;
			
			if(sumOfDice == myPoint)
				gameStatus = Status.WON;
			else
				if(sumOfDice == SEVEN)
					gameStatus = Status.LOST;
		}
		
		// determine whether player wins or looses
		if(gameStatus == Status.WON) {
			// System.out.println("Player wins");
			
			totalWins++;
			
			if(rolls > 20)
				winAttempts[20]++;
			else
				winAttempts[rolls - 1]++;
			
			return rolls;
		}
			
		else {
			// System.out.println("Player looses");
			
			if(rolls > 20)
				looseAttempts[20]++;
			else
				looseAttempts[rolls - 1]++;
			
			return rolls;
		}
	}
	
	public static int rollDice() {
		int die1 = 1 + randomNumbers.nextInt(6);
		int die2 = 1 + randomNumbers.nextInt(6);
		
		int sum = die1 + die2;
		
		// System.out.printf("Player rolled %d + %d = %d\n",
		//		die1, die2, sum);
		
		return sum;
	}
	
	// FINISH
	public static void main(String[] args) {
		double totalAttempts = 0;
		
		for(int gamesCounter = 0; gamesCounter < 1000000; gamesCounter++) {
			totalAttempts += playCraps();
		}
		
		System.out.println("Attempts Won:");
		dispStatusArr(winAttempts);
		
		System.out.println("\n\nAttempts Lost:");
		dispStatusArr(looseAttempts);
		
		System.out.println("\nChances of winning: " + (totalWins / 1000000.0));
		
		System.out.println("Attempts per game: " + (totalAttempts / 1000000));
		
		
	}
	
	// FINISH
	public static void dispStatusArr(int[] arr) {
		for(int rolls = 1; rolls < 21; rolls++)
			System.out.printf("Rolls: %d	Frequency: %d%n", rolls, arr[rolls]);
	}
}
