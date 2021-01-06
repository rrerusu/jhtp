package org.erusu.jhtp.chapter7.exercises.eight_queens;

import java.util.Random;

public class EightQueensBruteForce {
	
	private static int[][] board = new int[8][8];
	
	public static void main(String[] args) {
		printBoard();
		
		placeQueensRandom();
		
		printBoard();
	}
	
	public static void printBoard() {
		for(int row[] : board) {
			for(int col : row) {
				System.out.printf("%-3s", col);
			}
			
			System.out.println();
		}
		
		System.out.println("\n\n\n\n");
	}
	
	public static void placeQueensRandom() {
		Random myRandGen = new Random();
		
		for(int row = 0; row < board.length; row++) {
			board[row][myRandGen.nextInt(board[row].length)] = 30;
		}
	}
	
	public static void checkBoard() {
			
	}
}