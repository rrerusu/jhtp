package org.erusu.jhtp.chapter10.exercises._1013;

public class Cube extends ThreeDimensionalShape implements PerfectPolySided {
	private double sideLength;

	public Cube(double side) {
		super(6, 12, 8);
		setSideLength(side);
	}

	@Override
	public double calcVolume(double[] dimensions) {
		return Math.pow(dimensions[0], 3);
	}

	@Override
	public double calcSurfaceArea(double[] dimensions) {
		return 6 * Math.pow(dimensions[0], 2);
	}

	public double getSideLength() {
		return sideLength;
	}

	public void setSideLength(double len) {
		sideLength = len;
		super.setVolume(calcVolume(new double[]{sideLength}));
		super.setSurfaceArea(calcSurfaceArea(new double[]{sideLength}));
	}

	@Override
	public String toString() {
		return String.format("%s: %s\n%s\nSide Length: %.2f\nSurface area: %.2f\nVolume: %.2f",
			"Shape", "Cube", super.toString(), getSideLength(), super.getArea(), super.getVolume());
	}
}
