package org.erusu.jhtp.chapter8.exercises._811;

import org.erusu.jhtp.chapter8.exercises._811.Complex;

public class ComplexTest {
    public static void main(String[] args) {
        Complex num1 = new Complex(5, -3);
        Complex num2 = new Complex(2, 4);

        System.out.printf("num1: %s%nnum2 %s%n", num1.toString(), num2.toString());

        System.out.printf("(%s) + (%s) = (%s)", num1.toString(), num2.toString(), Complex.add(num1, num2).toString());
        System.out.printf("%n(%s) + (%s) = (%s)", num1.toString(), num2.toString(), Complex.subtract(num1, num2).toString());
        System.out.printf("%n(%s) x (%s) = (%s)", num1.toString(), num2.toString(), Complex.multiply(num1, num2).toString());
    }
}