package org.erusu.jhtp.chapter10.exercises._1013;

public abstract class TwoDimensionalShape extends Shape {
	private double area;
	private double perimeter;

	public TwoDimensionalShape(int numSides) {
		super(numSides);
		area = 0;
		perimeter = 0;
	}

	public abstract double calcArea(double[] dimensions);

	@Override
	public double getArea() {
		return area;
	}

	public void setArea(double num) {
		area = num;
	}

	public abstract double calcPerimeter(double[] dimensions);

	public double getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(double num) {
		perimeter = num;
	}

	@Override
	public int getSides() {
		return super.getSides();
	}

	@Override
	public void setSides(int num) {
		super.setSides(num);
	}

	@Override
	public String toString() {
		return String.format("%s\nDimensions: %d", super.toString(), 2);
	}
}
