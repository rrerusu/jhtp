package org.erusu.jhtp.chapter7.exercises.turtle_graphics;

public class TurtleGrid {
	private Coordinate[][] turtleGrid;
	private Turtle turtle;
	
	
	// Default constructor
	public TurtleGrid(int size) {
		turtleGrid = new Coordinate[size][size];
		turtle = new Turtle();
		
		for(int yCoord = 0; yCoord < size; yCoord++) {
			for(int xCoord = 0; xCoord < size; xCoord++) {
				turtleGrid[yCoord][xCoord] = new Coordinate(xCoord, 19 - yCoord);
			}
		}
	}
	
	// Mark current Coordinate
	public void tryMark() {
		if(turtle.isDrawing())
			turtleGrid[19 - turtle.getPos()[1]][turtle.getPos()[0]].mark();
	}
	
	public void handleCode(String[] code) {
		for(String line : code) {
			tryMark();
			
			switch(line.charAt(0)) {
				case '1':
					turtle.penUp();
					break;
				case '2':
					turtle.penDown();
					break;
				case '3':
					turtle.turnRight();
					break;
				case '4':
					turtle.turnLeft();
					break;
				case '5':
					for(int steps = 0; steps < Integer.parseInt(line.substring(2)); steps++) {
						turtle.move();
						tryMark();
						if(turtle.getPos()[0] > 19)
							turtle.setPos(19, turtle.getPos()[1]);
						if(turtle.getPos()[1] > 19)
							turtle.setPos(turtle.getPos()[0], 19);
					}
					break;
				case '6':
					dispGrid();
					break;
			}
		}
	}
	
	// Debugging with turtle
	public Turtle getTurtle() {
		System.out.println(turtle.toString());
		return turtle;
	}
	
	// Display grid
	public void dispGrid() {
		for(int yCoord = 0; yCoord < turtleGrid.length; yCoord++) {
			for(int xCoord = 0; xCoord < turtleGrid[yCoord].length; xCoord++) {
				System.out.print(turtleGrid[yCoord][xCoord].displayCoord() + " ");
//				System.out.print(turtleGrid[yCoord][xCoord].toString() + " ");
			}
			System.out.println();
		}
	}
}