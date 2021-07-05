package org.erusu.jhtp.chapter9.exercises._906;

public class TwoDimensionalShape extends Shape{
	private double area;
	private double perimeter;

	public TwoDimensionalShape() {
		super();
		area = 0;
		perimeter = 0;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double num) {
		area = num;
	}

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
}
