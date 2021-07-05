package org.erusu.jhtp.chapter10.exercises._1013;

public abstract class ThreeDimensionalShape extends Shape {
	private double volume;
	private double surfaceArea;
	private int vertices;
	private int edges;

	public ThreeDimensionalShape(int faces, int edges, int vertices) {
		super(faces);
		setEdges(edges);
		setVertices(vertices);
	}

	public abstract double calcVolume(double[] dimensions);

	public abstract double calcSurfaceArea(double[] dimensions);

	public double getVolume() {
		return volume;
	}

	public void setVolume(double num) {
		volume = num;
	}

	@Override
	public double getArea() {
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

	public int getEdges(){
		return edges;
	}

	public void setEdges(int num) {
		edges = num;
	}

	@Override
	public String toString() {
		return String.format("%s\nDimensions: %d", super.toString(), 3);
	}
}
