package org.erusu.jhtp.chapter10.exercises._1013;

public class Tetrahedron extends ThreeDimensionalShape implements PerfectPolySided {
	private double sideLength;

	public Tetrahedron(double len) {
		super(4, 6, 4);
		setSideLength(len);
	}

	@Override
	public double calcVolume(double[] lens) {
		return Math.pow(lens[0], 3) / (6 * Math.sqrt(2));
	}

	@Override
	public double calcSurfaceArea(double[] lens) {
		return Math.pow(lens[0], 2) * Math.sqrt(3);
	}

	public double getSideLength() {
		return sideLength;
	}

	public void setSideLength(double len) {
		sideLength = len;
		super.setVolume(calcVolume(new double[]{len}));
		super.setSurfaceArea(calcSurfaceArea(new double[]{len}));
	}

	@Override
	public String toString() {
		return String.format("%s: %s\n%s\nSide Length: %.2f\nSurface Area: %.2f\nVolume: %.2f",
			"Shape", "Tetrahedron", super.toString(), getSideLength(), getArea(), getVolume());
	}
}
