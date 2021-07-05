package org.erusu.jhtp.chapter10.exercises._1013;

public class Sphere extends ThreeDimensionalShape implements ZeroSides{
	private double radius;

	public Sphere(double rad) {
		super(0, 0, 0);
		setRadius(rad);
	}

	@Override
	public double calcVolume(double[] dimensions) {
		return (4.0 / 3) * Math.PI * Math.pow(dimensions[0], 3);
	}

	@Override
	public double calcSurfaceArea(double[] dimensions) {
		return 4.0 * Math.PI * Math.pow(dimensions[0], 2);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double rad) {
		radius = rad;
		super.setVolume(calcVolume(new double[]{radius}));
		super.setSurfaceArea(calcSurfaceArea(new double[]{radius}));
	}

	@Override
	public String toString() {
		return String.format("%s: %s\n%s\nRadius: %.2f\nSurface area: %.2f\nVolume: %.2f",
			"Shape", "Sphere", super.toString(), getRadius(), super.getArea(), super.getVolume());
	}
}
