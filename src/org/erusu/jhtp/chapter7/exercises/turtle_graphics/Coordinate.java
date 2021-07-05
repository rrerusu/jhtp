package org.erusu.jhtp.chapter7.exercises.turtle_graphics;

public class Coordinate {
	private int[] coords;
	private boolean marked;
	
	// Constructor for location
	public Coordinate(int x, int y) {
		coords = new int[2];
		coords[0] = x;
		coords[1] = y;
		marked = false;
	}
	
	// Accessor for location
	public int[] getLocation() {
		return coords;
	}
	
	// Modifier for location
	public void setLocation(int x, int y) {
		coords[0] = x;
		coords[1] = y;
	}
	
	// Mark this coordinate as drawn
	public void mark() {
		marked = true;
	}
	
	// For future use: is coordinate marked?
	public boolean isMarked() {
		return marked;
	}
	
	// Display coordinate for debug purposes
	public int displayCoord() {
		return (isMarked()) ? 1 : 0;
	}
	
	// toString override
	@Override
	public String toString() {
		return ("(" + coords[0] + ", " + coords[1] + ")");
	}
}