package org.erusu.jhtp.chapter7.exercises.knights_tour;

import java.util.Random;

public class KnightsTourBruteForce {
	
	static int[][] board = new int[8][8];
	static int[] horizontal = new int[]{2, 1, -1, -2, -2, -1, 1, 2};
	static int[] vertical = new int[]{-1, -2, -2, -1, 1, 2, 2, 1};
	static final Random myRandGen = new Random();
	
	public static void main(String[] args) {
		runTour(2, 6);
	}
	
	// TODO: Make knight move randomly: do first choice that suffices random possibility and let game play as far as it an
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
				if(isMoveValid(currentRow, currentColumn, moveNumber)) {
					board[currentRow + vertical[moveNumber]][currentColumn + horizontal[moveNumber]]--;
				}
			}
			
			board[currentRow][currentColumn] = 9;
			
//			// Take optimal path
//			optimalPath = determineOptimalPath(currentRow, currentColumn);
			
			optimalPath = determineRandomPath(currentRow, currentColumn);
			
			if(isMoveValid(currentRow, currentColumn, optimalPath)) {
				currentRow += vertical[optimalPath];
				currentColumn += horizontal[optimalPath];
				stepCounter++;
				
				printBoard();
			} else {
				break;
			}
		} while(stepCounter < 64);
		
		// Test to see if we won
		for(int rowCounter = 0; rowCounter < board.length; rowCounter++) {
			for(int colCounter = 0; colCounter < board[rowCounter].length; colCounter++) {
				if(board[rowCounter][colCounter] != 9) {
					won = false;
				}
			}
		}
		
		System.out.println(won);
		printBoard();
		
	}
	
	public static void printBoard() {
		for(int row[] : board) {
			for(int col : row) {
				System.out.print(col + " ");
			}
			
			System.out.println();
		}
		
		System.out.println("\n\n");
	}
	
	// Is move within the chessboard boundaries?
	public static boolean isMoveValid(int currentRow, int currentCol, int possibleMove) {
		return possibleMove < 8 && (currentRow + vertical[possibleMove] >= 0 && currentRow + vertical[possibleMove] < 8) &&
				   (currentCol + horizontal[possibleMove] >= 0 && currentCol + horizontal[possibleMove] < 8) &&
				   board[currentRow + vertical[possibleMove]][currentCol + horizontal[possibleMove]] < 9;
	}
	
	public static int determineRandomPath(int currentRow, int currentCol) {
		int optimal = 8;
		int[] movesTested = new int[8];
		
		while(! isMoveValid(currentRow, currentCol, optimal)) {
			optimal = myRandGen.nextInt(8);
			movesTested[optimal] = 1;
			if(runTest(movesTested))
				return 8;
		}
		
		return optimal;
	}
	
//	public static int determineOptimalPath(int currentRow, int currentCol) {
//		int optimal = 8;
//		
//		for(int possibleMove = 0; possibleMove < 8; possibleMove++) {
//			
//			if(isMoveValid(currentRow, currentCol, possibleMove)) {
//				if(optimal == 8) {
//					optimal = possibleMove;
//				} else if(board[currentRow + vertical[possibleMove]][currentCol + horizontal[possibleMove]] < board[currentRow + vertical[optimal]][currentCol + horizontal[optimal]]) {
//						optimal = possibleMove;
//				}
//			}
//		}
//		return optimal;
//	}
	
	public static boolean runTest(int[] arr) {
		for(int num : arr) {
			if(num == 0 || num == 8)
				return false;
		}
		return true;
	}
	
	public static int bestMove(int[] arr) {
		int lowestNum = 9,
			indx = 0;
		
		for(int testIndx = 0; testIndx < arr.length; testIndx++) {
			if (arr[testIndx] < lowestNum)
				indx = testIndx;
		}
		
		return indx;
	}
}