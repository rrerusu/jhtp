package org.erusu.jhtp.chapter7.exercises;

public class KnightsTour {
	public static void main(String[] args) {
		int[][] board = new int[8][8];
		int[] horizontal = new int[]{2, 1, -1, -2, -2, -1, 1, 2};
		int[] vertical = new int[]{-1, -2, -2, -1, 1, 2, 2, 1};
		int currentRow = 0,
			currentColumn = 0,
			moveNumber = 0,
			stepCounter = 1;
		
		// Move Knight
		while(stepCounter <= 64 && moveNumber < 8) {
			board[currentRow][currentColumn] = stepCounter;
			
			// create random numbers until the value is preferred
			while(moveNumber < 8 && (currentRow + vertical[moveNumber] < 0 || currentRow + vertical[moveNumber] >= 8 ||
					currentColumn + horizontal[moveNumber] < 0 || currentColumn + horizontal[moveNumber] >= 8 ||
					board[currentRow + vertical[moveNumber]][currentColumn + horizontal[moveNumber]] != 0)) {
				moveNumber++;
			}
			if(moveNumber < 8) {
				currentRow += vertical[moveNumber];
				currentColumn += horizontal[moveNumber];
				stepCounter++;
				moveNumber = 0;
			}
		}
		
		if(moveNumber > 7)
			System.out.println("Fail");
		else
			System.out.println("Success");
	}
}