package org.erusu.jhtp.chapter7.exercises.knights_tour;

import java.util.Random;

public class KnightsTourBruteForce {
	
	static int[][] board = new int[8][8];
	static int[] horizontal = new int[]{2, 1, -1, -2, -2, -1, 1, 2};
	static int[] vertical = new int[]{-1, -2, -2, -1, 1, 2, 2, 1};
	static final Random myRandGen = new Random();
	
	public static void main(String[] args) {
		runTour(0, 0);
	}
	
	public static void runTour(int currRow, int currColumn) {
		int currentRow = currRow,
			currentColumn = currColumn,
			stepCounter = 0,
			optimalPath = 7;
		
		boolean won = true;
		
		// Turn board into heat map
		for(int rowCounter = 0; rowCounter < board.length; rowCounter++) {
			for(int colCounter = 0; colCounter < board[rowCounter].length; colCounter++) {
				for(int heatCounter = 0; heatCounter < 8; heatCounter++) {
					if(isMoveValid(rowCounter, colCounter, heatCounter))
						board[rowCounter][colCounter]++;
				}
			}
		}
		
		// Run simulation
		do {
			
			// update numbers around this one
			for(int moveNumber = 0; moveNumber < 8; moveNumber++) {
				if(isMoveValid(currentRow, currentColumn, moveNumber) &&
						board[currentRow + vertical[moveNumber]][currentColumn + horizontal[moveNumber]] < 9) {
					board[currentRow + vertical[moveNumber]][currentColumn + horizontal[moveNumber]]--;
				}
			}
			
			board[currentRow][currentColumn] = 9;
			
//			// Take optimal path
//			optimalPath = determineOptimalPath(currentRow, currentColumn);
			
			int[] movesTested = new int[8];
			
			// Take random path
			while(! isMoveValid(currentRow, currentColumn, optimalPath) || runTest(movesTested)) {
				optimalPath = myRandGen.nextInt(8);
				movesTested[optimalPath] = 1;
			}
			
			// exit because we lost
			if(runTest(movesTested))
				stepCounter = 64;
			
			
			if(optimalPath < 8) {
				currentRow += vertical[optimalPath];
				currentColumn += horizontal[optimalPath];
				stepCounter++;
				
//				printBoard();
			}
		} while(stepCounter < 64);
		
		// Test to see if we won
		for(int rowCounter = 0; rowCounter < board.length; rowCounter++) {
			for(int colCounter = 0; colCounter < board[rowCounter].length; colCounter++) {
				if(board[rowCounter][colCounter] == 0) {
					won = false;
				}
			}
		}
		
		System.out.println(won);
		printBoard();
		
	}
	
	public static void printBoard() {
		// display each value
		for(int row[] : board) {
			for(int col : row) {
				System.out.print(col + " ");
			}
			
			System.out.println();
		}
		
		System.out.println("\n\n");
	}
	
	// is move within the chessboard boundaries
	public static boolean isMoveValid(int currentRow, int currentCol, int possibleMove) {
		return ! (currentRow + vertical[possibleMove] < 0 || currentRow + vertical[possibleMove] > 7 ||
				   currentCol + horizontal[possibleMove] < 0 || currentCol + horizontal[possibleMove] > 7);
	}
	
	public static int determineOptimalPath(int currentRow, int currentCol) {
		int optimal = 8;
		
		for(int possibleMove = 0; possibleMove < 8; possibleMove++) {
			
			if(isMoveValid(currentRow, currentCol, possibleMove)) {
				if(optimal == 8) {
					optimal = possibleMove;
				} else if(board[currentRow + vertical[possibleMove]][currentCol + horizontal[possibleMove]] < board[currentRow + vertical[optimal]][currentCol + horizontal[optimal]]) {
						optimal = possibleMove;
				}
			}
		}
		
		return optimal;
	}
	
	public static boolean runTest(int[] arr) {
		for(int num : arr) {
			if(num == 0)
				return false;
		}
		
		return true;
	}
}