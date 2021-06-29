package org.erusu.jhtp.chapter10.exercises._1013;

public abstract class Shape {
	private int numSides;

	public Shape(int numSides) {
		setSides(numSides);
	}

	public int getSides() {
		return numSides;
	}

	public void setSides(int sides) {
		numSides = sides;
	}

	public abstract double getArea();

	@Override
	public String toString() {
		return String.format("# Sides: %d", getSides());
	}
}
