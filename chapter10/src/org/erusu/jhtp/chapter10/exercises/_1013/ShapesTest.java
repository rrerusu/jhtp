package org.erusu.jhtp.chapter10.exercises._1013;

public class ShapesTest {
	public static void main(String[] args) {
		Shape[] myShapes = new Shape[6];

		myShapes[0] = new Circle(2);
		myShapes[1] = new Square(2);
		myShapes[2] = new Triangle(new double[]{3, 3, 3});
		myShapes[3] = new Cube(3);
		myShapes[4] = new Sphere(3);
		myShapes[5] = new Tetrahedron(4);

		for(Shape sh : myShapes) {
			System.out.printf("Class: %s\n%s\n\n", sh.getClass().getName(), sh);
		}

		System.out.println("\n\n\n2-D vs 3-D test");

		for(Shape sh : myShapes) {

			if(sh instanceof TwoDimensionalShape)
				System.out.printf("Area: %.2f\n", sh.getArea());
			else {
				System.out.printf("Volume: %.2f\nSurface Area: %.2f\n",
					sh.getArea(), ((ThreeDimensionalShape) sh).getVolume());
			}
		}
	}
}