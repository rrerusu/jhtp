package org.erusu.jhtp.chapter8.exercises._811;

public class Complex {
    private double real;
    private double imaginary;

    // Constructor
    public Complex(double r, double i) {
        real = r;
        imaginary = i;
    }

    // accessor & modifier methods
    public double getReal() {
        return real;
    }

    public void setReal(double num) {
        real = num;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double num) {
        imaginary = num;
    }

    // Sum 2 complex Numbers
    public static Complex sum(Complex num1, Complex num2) {
        return new Complex((num1.getReal() + num2.getReal()), (num1.getImaginary() + num2.getImaginary()));
    }

    // toString
    @Override
    public String toString() {
        return String.format("%.2f %s %.2fi", getReal(), (Math.abs(getImaginary()) == getImaginary() ? "+" : "-"), Math.abs(getImaginary()));
    }
}