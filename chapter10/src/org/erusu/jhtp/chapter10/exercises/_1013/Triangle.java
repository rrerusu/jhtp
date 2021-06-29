package org.erusu.jhtp.chapter10.exercises._1013;

public class Triangle extends TwoDimensionalShape{
	private double[] sideLengths;

	public Triangle(double[] dimensions) {
		super(3);
		setSideLengths(dimensions);
	}

	@Override
	public double calcArea(double[] dimensions) {
		double semiPerimeter = (dimensions[0] + dimensions[1] + dimensions[2]) / 2;
		return Math.sqrt(semiPerimeter *
			(semiPerimeter - dimensions[0]) *
			(semiPerimeter - dimensions[1]) *
			(semiPerimeter - dimensions[2]));
	}

	@Override
	public double calcPerimeter(double[] lens) {
		return lens[0] + lens[1] + lens[2];
	}

	public double[] getSideLengths() {
		return sideLengths;
	}

	public String doubleArrToString(double[] arr) {
		String str = "{";
		for(double num : arr) {
			str += num + ", ";
		}
		return str.substring(0, str.length() - 2) + "}";
	}

	public void setSideLengths(double[] lengths) {
		sideLengths = new double[lengths.length];
		System.arraycopy(lengths, 0, sideLengths, 0, 3);
		super.setArea(calcArea(sideLengths));
		super.setPerimeter(calcPerimeter(sideLengths));
	}

	@Override
	public String toString() {
		return String.format("%s: %s\n%s\nSide lengths: %s\nArea: %.2f\nPerimeter: %.2f",
			"Shape", "Triangle", super.toString(), doubleArrToString(getSideLengths()),
			super.getArea(), super.getPerimeter());
	}
}
