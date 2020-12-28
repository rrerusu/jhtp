package org.erusu.jhtp.chapter7.exercises.eight_queens;

public class EightQueens {
	public static int[][] board;
	
	static final int TESTNUM = 29;
	static final int QUEENNUM = 30;
	
	public static void main(String[] args) {
		placeQueens();
		
		printBoard();
	}
	
	//
	public static void placeQueens() {
		createBoard();
		
		// Put first queen at 0, 0 (30 is queen, 29 is number affected by queen)
		putQueen(0, 0);
		
		// Place the next 6 queens: the 8th queen will fall in place
		// TODO: Build function to find smallest location and place a queen there
		int smallRow,
			smallCol,
			smallestVal;
		
		for(int row = 1; row < board.length - 1; row++) {
			
			smallRow = 0;
			smallCol = 0;
			smallestVal = 31;
			
			for(int col = 0; col < board[row].length; col++) {
				if(board[row][col] <= smallestVal) {
					smallRow = row;
					smallCol = col;
					smallestVal = board[row][col];
				}
			}
			
			putQueen(smallRow, smallCol);
		}
		
		// Place last queen at val = 1
		for(int col = 0; col < board[7].length; col++) {
			if(board[7][col] == 1)
				board[7][col] = 30;
		}
	}
	
	public static void createBoard() {
		board = new int[8][8];
		
		for(int row = 0; row < board.length; row++) {
			for(int col = 0; col < board[row].length; col++) {
				board[row][col] = 0;
			}
		}
	}
	
	public static void printBoard() {
		for(int[] row : board) {
			for(int col : row) {
				System.out.printf("%-3d", col);
			}
			System.out.println();
		}
		
		System.out.println("\n\n");
	}
	
	public static void putQueen(int row, int col) {
		// Set Queen at this location
		board[row][col] = 30;
		
		// update all squares to the right
		try {
			for(int testCol = col + 1; testCol < board[row].length; testCol++) {
				if(board[row][testCol] < QUEENNUM)
					board[row][testCol] = 29;
			}
		} catch(ArrayIndexOutOfBoundsException outOfBounds) {
			
		}
		
		// update all squares to the left
		try {
			for(int testCol = col - 1; testCol >= 0; testCol--) {
				if(board[row][testCol] < QUEENNUM)
					board[row][testCol] = 29;
			}
		} catch(ArrayIndexOutOfBoundsException outOfBounds) {
			
		}
		
		// update all squares above
		try {
			for(int testRow = row + 1; testRow < board.length; testRow++) {
				if(board[testRow][col] < QUEENNUM)
					board[testRow][col] = 29;
			}
		} catch(ArrayIndexOutOfBoundsException outOfBounds) {
			
		}
		
		
		// update all squares below
		try {
			for(int testRow = row - 1; testRow >= 0; testRow--) {
				if(board[testRow][col] < QUEENNUM)
					board[testRow][col] = 29;
			}
		} catch(ArrayIndexOutOfBoundsException outOfBounds) {
			
		}
		
		
		
		// update all squares north west
		int testRow = row - 1;
		int testCol = col - 1;
		
		try {
			while(testRow >= 0 && testCol >= 0) {
				if(board[testRow][testCol] < QUEENNUM)
					board[testRow][testCol] = 29;
				
				testRow--;
				testCol--;
			}
		} catch(ArrayIndexOutOfBoundsException outOfBounds) {
			
		}
		
		// update all squares north east
		testRow = row - 1;
		testCol = col + 1;
		
		try {
			while(testRow >= 0 && testCol < board[testRow].length) {
				if(board[testRow][testCol] < QUEENNUM)
					board[testRow][testCol] = 29;
				
				testRow--;
				testCol++;
			}
		} catch(ArrayIndexOutOfBoundsException outOfBounds) {
			
		}
		
		// update all squares south west
		testRow = row + 1;
		testCol = col - 1;
		
		try {
			while(testRow < board.length && testCol >= 0) {
				if(board[testRow][testCol] < QUEENNUM)
					board[testRow][testCol] = 29;
				
				testRow++;
				testCol--;
			}
		} catch(ArrayIndexOutOfBoundsException outOfBounds) {
			
		}
		
		// update all squares south east
		testRow = row + 1;
		testCol = col + 1;
		
		try {
			while(testRow < board.length && testCol < board[testRow].length) {
				if(board[testRow][testCol] < QUEENNUM)
					board[testRow][testCol] = 29;
				
				testRow++;
				testCol++;
			}
		} catch(ArrayIndexOutOfBoundsException outOfBounds) {
			
		}
		
		updateBoard();
	}
	
	public static void updateBoard() {
		for(int row = 0; row < board.length; row++) {
			for(int col = 0; col < board[row].length; col++) {
				
				if(board[row][col] < TESTNUM) {
					board[row][col] = 1;
					
					// test all squares to the right
					try {
						for(int testCol = col + 1; testCol < board[row].length; testCol++) {
							if(board[row][testCol] < TESTNUM)
								board[row][col]++;
						}
					} catch(ArrayIndexOutOfBoundsException outOfBounds) {
						
					}
					
					// test all squares to the left
					try {
						for(int testCol = col - 1; testCol >= 0; testCol--) {
							if(board[row][testCol] < TESTNUM)
								board[row][col]++;
						}
					} catch(ArrayIndexOutOfBoundsException outOfBounds) {
						
					}
					
					// test all squares above
					try {
						for(int testRow = row + 1; testRow < board.length; testRow++) {
							if(board[testRow][col] < TESTNUM)
								board[row][col]++;
						}
					} catch(ArrayIndexOutOfBoundsException outOfBounds) {
						
					}
					
					
					// test all squares below
					try {
						for(int testRow = row - 1; testRow >= 0; testRow--) {
							if(board[testRow][col] < TESTNUM)
								board[row][col]++;
						}
					} catch(ArrayIndexOutOfBoundsException outOfBounds) {
						
					}
					
					
					
					// test all squares north west
					int testRow = row - 1;
					int testCol = col - 1;
					
					try {
						while(testRow >= 0 && testCol >= 0) {
							if(board[testRow][testCol] < TESTNUM)
								board[row][col]++;
							
							testRow--;
							testCol--;
						}
					} catch(ArrayIndexOutOfBoundsException outOfBounds) {
						
					}
					
					// test all squares north east
					testRow = row - 1;
					testCol = col + 1;
					
					try {
						while(testRow >= 0 && testCol < board[testRow].length) {
							if(board[testRow][testCol] < TESTNUM)
								board[row][col]++;
							
							testRow--;
							testCol++;
						}
					} catch(ArrayIndexOutOfBoundsException outOfBounds) {
						
					}
					
					// test all squares south west
					testRow = row + 1;
					testCol = col - 1;
					
					try {
						while(testRow < board.length && testCol >= 0) {
							if(board[testRow][testCol] < TESTNUM)
								board[row][col]++;
							
							testRow++;
							testCol--;
						}
					} catch(ArrayIndexOutOfBoundsException outOfBounds) {
						
					}
					
					// test all squares south east
					testRow = row + 1;
					testCol = col + 1;
					
					try {
						while(testRow < board.length && testCol < board[testRow].length) {
							if(board[testRow][testCol] < TESTNUM)
								board[row][col]++;
							
							testRow++;
							testCol++;
						}
					} catch(ArrayIndexOutOfBoundsException outOfBounds) {
						
					}
				}
			}
		}
	}
}