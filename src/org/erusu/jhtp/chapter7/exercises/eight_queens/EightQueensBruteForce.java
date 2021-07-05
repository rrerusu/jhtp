package org.erusu.jhtp.chapter7.exercises.eight_queens;

import java.util.Random;

public class EightQueensBruteForce {

	private static int[][] board = new int[8][8];

	public static void main(String[] args) {
		placeQueensRandom();

		printBoard();
	}

	public static void printBoard() {
		for (int row[] : board) {
			for (int col : row) {
				System.out.printf("%-3s", col);
			}

			System.out.println();
		}

		System.out.println("\n\n\n\n");
	}

	public static void placeQueensRandom() {
		Random myRandGen = new Random();
		int[] queenCols = new int[8];

//		for(int row = 0; row < board.length; row++) {
//			int col = myRandGen.nextInt(board[row].length);
//			
//			board[row][col] = 30; // 30 represents queen
//			queenCols[row] = col; 
//		}

		
//		board[0][0] = 30;
//		board[1][7] = 30;
//		board[2][4] = 30;
//		board[3][1] = 30;
//		board[4][5] = 30;
//		board[5][2] = 30;
//		board[6][7] = 30;
//		board[7][4] = 30;
		

		System.out.printf("Won: %b%n%n", checkBoard(queenCols));
	}

	// Check to see if board is a solution to the Eight Queens problem
	public static boolean checkBoard(int[] queenCols) {
		for (int row = 0; row < queenCols.length - 1; row++) {
			int qRow = row;
			int qCol = queenCols[row];
			int qSum = row + queenCols[row];
			int qDiff = row - queenCols[row];

			for (int testRow = row; testRow < queenCols.length; testRow++) {

				// no need to check for if the rows match
				if (queenCols[testRow] == qCol || testRow + queenCols[testRow] == qSum
						|| testRow - queenCols[testRow] == qDiff)
					return false;
			}
		}

		return true;
	}
}