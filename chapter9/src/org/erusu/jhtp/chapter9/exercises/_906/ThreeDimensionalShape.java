package org.erusu.jhtp.chapter9.exercises._906;

public class ThreeDimensionalShape extends Shape{
	private double volume;
	private double surfaceArea;
	private int vertices;
	private int faces;

	public ThreeDimensionalShape() {
		super();
		volume = 0;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double num) {
		volume = num;
	}

	public double getSurfaceArea() {
		return surfaceArea;
	}

	public void setSurfaceArea(double num) {
		surfaceArea = num;
	}

	@Override
	public int getSides() {
		return super.getSides();
	}

	@Override
	public void setSides(int num) {
		super.setSides(num);
	}

	public int getVertices() {
		return vertices;
	}

	public void setVertices(int num) {
		vertices = num;
	}

	public int getFaces() {
		return faces;
	}

	public void setFaces(int num) {
		faces = num;
	}
}
