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
			int col = myRandGen.nextInt(board[row].length);
			
			// updateBoard
			updateBoard(row, col);
		}
	}
	
	// Check to see if board is a solution to the Eight Queens problem
	public static boolean checkBoard() {
		for(int row = 0; row < board.length; row++) {
			for(int col = 0; col < board[row].length; col++) {
				if(board[row][col] < 29)
					return false;
			}
		}
		
		return true;
	}
	
	// Update any pieces around any of the queens placed
	public static void updateBoard(int qRow, int qCol) {
		board[qRow][qCol] = 30;
		
		int qSum = qRow + qCol;
		int qDiff = qRow - qCol;
		
		for(int row = 0; row < board.length; row++) {
			for(int col = 0; col < board[row].length; col++) {
				if((row == qRow ||
				   col == qCol ||
				   row + col == qSum ||
				   row - col == qDiff) &&
				   board[row][col] < 30)
					board[row][col] = 29;
			}
		}
	}
}