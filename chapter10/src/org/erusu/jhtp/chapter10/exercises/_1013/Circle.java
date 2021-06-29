package org.erusu.jhtp.chapter10.exercises._1013;

public class Circle extends TwoDimensionalShape implements ZeroSides{
	private double radius;

	public Circle(double rad) {
		super(0);
		setRadius(rad);
	}

	@Override
	public double calcArea(double[] dimensions) {
		return Math.pow(dimensions[0], 2) * Math.PI;
	}

	@Override
	public double calcPerimeter(double[] dimensions) {
		return dimensions[0] * 2 * Math.PI;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double rad) {
		radius = rad;
		super.setArea(calcArea(new double[]{radius}));
		super.setPerimeter(calcPerimeter(new double[]{radius}));
	}

	@Override
	public String toString() {
		return String.format("%s: %s\n%s\nRadius: %.2f\nArea: %.2f\nCircumference: %.2f",
			"Shape", "Circle", super.toString(), getRadius(), super.getArea(), super.getPerimeter());
	}
}
