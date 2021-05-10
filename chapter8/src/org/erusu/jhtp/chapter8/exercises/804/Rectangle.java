package org.erusu.jhtp.chapter8.exercises._804;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        length = 1;
        width = 2;
    }

    public double getPerimeter() {
        return (length * 2) + (width * 2);
    }

    public double getArea() {
        return length * width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double l) {
        if(l > 0.0 && l < 20.0)
            length = l;
        else
            throw new IllegalArgumentException("Length must be between 0.0 and 20.0");
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double w) {
        if(w > 0.0 && w < 20.0)
            width = w;
        else
            throw new IllegalArgumentException("Width must be between 0.0 and 20.0");
    }
}