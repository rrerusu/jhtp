package org.erusu.jhtp.chapter8.exercises._804;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle();

        System.out.printf("Length: %.2f%nWidth: %.2f%nPerimeter: %.2f%nArea: %.2f%n",
        myRectangle.getLength(), myRectangle.getWidth(),
        myRectangle.getPerimeter(), myRectangle.getArea());

        myRectangle.setWidth(200);
    }
}
