package org.erusu.jhtp.chapter10.exercises._1013;

public abstract class Quadrilateral extends TwoDimensionalShape implements PerfectPolySided {
	public Quadrilateral() {
		super(4);
	}

	@Override
	public String toString() {
		return String.format("%s\nSides: %d", super.toString(), super.getSides());
	}
}
