package org.erusu.jhtp.chapter7.exercises.turtle_graphics;

public class Turtle {
	private boolean drawing;
	private Coordinate location;
	private enum direction {NORTH, EAST, SOUTH, WEST};
	private direction facing;
	
	// Default Constructor
	public Turtle() {
		drawing = false;
		location = new Coordinate(0, 0);
		facing = direction.NORTH;
	}
	
	// Start Drawing
	public void penDown() {
		drawing = true;
	}
	
	// Stop Drawing
	public void penUp() {
		drawing = false;
	}
	
	// Is it drawing?
	public boolean isDrawing() {
		return drawing;
	}
	
	// Debugging only: get turtle Pos
	public int[] getPos() {
		return location.getLocation();
	}
	
	// Accessor for Direction
	public direction getDirection() {
		return facing;
	}
	
	// Determine Direction
	public void setDirection(int num) {
		int numericDirection = (facing == direction.NORTH) ? 0 :
							   (facing == direction.EAST) ? 1 :
							   (facing == direction.SOUTH) ? 2 : 3;
		
		numericDirection = (numericDirection + num) % 4;
		
		facing = (numericDirection == 0) ? direction.NORTH :
				 (numericDirection == 1) ? direction.EAST :
				 (numericDirection == 2) ? direction.SOUTH : direction.WEST;
	}
	
	// Turn left
	public void turnLeft() {
		setDirection(-1);
	}
	
	// Turn right
	public void turnRight() {
		setDirection(1);
	}
	
	// Set position incase it get too far to the edge
	public void setPos(int x, int y) {
		location.setLocation(x, y);
	}
	
	// Move Turtle
	public void move() {
		switch(facing) {
			case NORTH:
				location.setLocation(location.getLocation()[0], location.getLocation()[1] + 1);
				break;
			case EAST:
				location.setLocation(location.getLocation()[0] + 1, location.getLocation()[1]);
				break;
			case SOUTH:
				location.setLocation(location.getLocation()[0], location.getLocation()[1] - 1);
				break;
			case WEST:
				location.setLocation(location.getLocation()[0] - 1, location.getLocation()[1]);
				break;
		}
	}
	
	// toString override for turtle values
	@Override
	public String toString() {
		return ("Location: " + location.toString() + 
				"\nDrawing = " + isDrawing() + 
				"\nFacing = " + getDirection().toString());
	}
}