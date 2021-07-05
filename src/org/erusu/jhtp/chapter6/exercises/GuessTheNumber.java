package org.erusu.jhtp.chapter6.exercises;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
	
	private static final Random randGen = new Random();
	private static final Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		char playAgain = 'n';
		
		System.out.print("Play guess the number? (y for yes, n for no): ");
		playAgain = input.next().toLowerCase().charAt(0);
		
		while(playAgain == 'y') {
			if(playAgain == 'y') {
				playGame();
			}
			
			System.out.print("\nPlay again? (y for yes, n for no): ");
			playAgain = input.next().toLowerCase().charAt(0);
		}
		
		input.close();
	}
	
	public static void playGame() {
		
		int num = randGen.nextInt(1000) + 1,
			guess = -1,
			numGuesses = 0;
		
		String output;
		
		while(guess != num) {
			System.out.print("Guess num: ");
			guess = input.nextInt();
			numGuesses++;
			
			if(guess > num)
				output = "Too high. Try again";
			else if(guess < num)
				output = "Too low. Try again";
			else {
				output = "Congratulations! You guessed the number!";
				
				if(numGuesses < 10)
					output += "\nEither you know the secret or you got lucky!";
				else if(numGuesses == 10)
					output += "\nAha! You know the secret !";
				else
					output += "\nYou should be able to do better!";
			}
				
			
			System.out.println(output);
		}
	}
}
