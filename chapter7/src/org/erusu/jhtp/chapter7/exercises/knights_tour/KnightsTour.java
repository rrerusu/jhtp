package org.erusu.jhtp.chapter7.exercises.knights_tour;

public class KnightsTour {
	
	static int[][] board = new int[8][8];
	static int[] horizontal = new int[]{2, 1, -1, -2, -2, -1, 1, 2};
	static int[] vertical = new int[]{-1, -2, -2, -1, 1, 2, 2, 1};
	
	public static void main(String[] args) {
//		for(int row = 0; row < board.length; row++) {
//			for(int col = 0; col < board[row].length; col++) {
//				runTour(row, col);
//			}
//		}
		
		runTour(0, 0);
	}
	
	public static void runTour(int currRow, int currColumn) {
		int currentRow = currRow,
			currentColumn = currColumn,
//			moveNumber = 0,
			stepCounter = 0,
//			counter = 1,
			optimalPath = 8;
		
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
			
			// Take optimal path
			optimalPath = determineOptimalPath(currentRow, currentColumn);
			
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
		
		// Move Knight until it cannot move anymore
//		while(stepCounter <= 64 && moveNumber < 8) {
//			board[currentRow][currentColumn] = stepCounter;
//			
//			// Move when the conditions are satisfied
//			while(moveNumber < 8 && (currentRow + vertical[moveNumber] < 0 || currentRow + vertical[moveNumber] >= 8 ||
//					currentColumn + horizontal[moveNumber] < 0 || currentColumn + horizontal[moveNumber] >= 8 ||
//					board[currentRow + vertical[moveNumber]][currentColumn + horizontal[moveNumber]] != 0)) {
//				moveNumber++;
//				
//			}
//			if(moveNumber < 8) {
//				currentRow += vertical[moveNumber];
//				currentColumn += horizontal[moveNumber];
//				stepCounter++;
//				moveNumber = 0;
//			}
//		}
//		
//		if(moveNumber > 7)
//			System.out.println("Fail");
//		else
//			System.out.println("Success");
		
		System.out.println(won);
		System.out.println(stepCounter);
		
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
		int optimal = 8,
			choice1,
			choice2;
		
		for(int possibleMove = 0; possibleMove < 8; possibleMove++) {
			
			if(isMoveValid(currentRow, currentCol, possibleMove)) {
				if(optimal == 8) {
					optimal = possibleMove;
				} else if(board[currentRow + vertical[possibleMove]][currentCol + horizontal[possibleMove]] < board[currentRow + vertical[optimal]][currentCol + horizontal[optimal]]) {
						optimal = possibleMove;
//				} else if(board[currentRow + vertical[possibleMove]][currentCol + horizontal[possibleMove]] == board[currentRow + vertical[optimal]][currentCol + horizontal[optimal]]) {
//					printBoard();
//					choice1 = determineOptimalPath(currentRow + vertical[possibleMove], currentCol + horizontal[possibleMove]);
//					choice2 = determineOptimalPath(currentRow + vertical[optimal], currentCol + horizontal[optimal]);
//					optimal = (choice1 < choice2) ? possibleMove : optimal;
				}
			}
		}
		
		return optimal;
	}
}