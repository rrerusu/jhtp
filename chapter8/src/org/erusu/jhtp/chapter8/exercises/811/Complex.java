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

    // Add 2 complex Numbers
    public static Complex add(Complex num1, Complex num2) {
        return new Complex((num1.getReal() + num2.getReal()), (num1.getImaginary() + num2.getImaginary()));
    }

    // Subtract 2 complex numbers
    public static Complex subtract(Complex num1, Complex num2) {
        return new Complex((num1.getReal() - num2.getReal()), (num1.getImaginary() - num2.getImaginary()));
    }

    // Multiply 2 complex Numbers
    public static Complex multiply(Complex num1, Complex num2) {
        return new Complex((num1.getReal() * num2.getReal() - num1.getImaginary() * num2.getImaginary()), (num1.getReal() * num2.getImaginary() + num1.getImaginary() * num2.getReal()));
    }

    // toString
    @Override
    public String toString() {
        return String.format("%.2f %s %.2fi", getReal(), (Math.abs(getImaginary()) == getImaginary() ? "+" : "-"), Math.abs(getImaginary()));
    }
}