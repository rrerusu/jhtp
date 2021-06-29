package org.erusu.jhtp.chapter10.exercises._1013;

public class Square extends Quadrilateral{
	private double length;

	public Square(double len) {
		super();
		setSideLength(len);
	}

	@Override
	public double calcArea(double[] dimensions) {
		return Math.pow(dimensions[0], 2);
	}

	@Override
	public double calcPerimeter(double[] dimensions) {
		return dimensions[0] * 4;
	}

	public double getSideLength() {
		return length;
	}

	public void setSideLength(double len) {
		length = len;
		super.setArea(calcArea(new double[]{length}));
		super.setPerimeter(calcArea(new double[]{length}));
	}

	@Override
	public String toString() {
		return String.format("%s: %s\n%s\nSide Length: %.2f\nArea: %.2f\nPerimeter: %.2f",
			"Shape", "Square", super.toString(), getSideLength(), super.getArea(), super.getPerimeter());
	}
}
