package org.erusu.jhtp.chapter9.exercises._906;

public class Shape {
	private int numSides;

	public Shape() {
		setSides(0);
	}

	public int getSides() {
		return numSides;
	}

	public void setSides(int sides) {
		numSides = sides;
	}

	@Override
	public String toString() {
		return String.format("# Sides: %d", getSides());
	}
}
