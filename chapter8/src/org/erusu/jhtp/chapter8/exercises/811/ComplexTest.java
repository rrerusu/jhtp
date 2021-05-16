package org.erusu.jhtp.chapter8.exercises._811;

import org.erusu.jhtp.chapter8.exercises._811.Complex;

public class ComplexTest {
    public static void main(String[] args) {
        Complex num1 = new Complex(1, -3);
        Complex num2 = new Complex(2, 5);

        System.out.printf("num1: %s%nnum2 %s%n", num1.toString(), num2.toString());

        System.out.printf("(%s) + (%s) = (%s)", num1.toString(), num2.toString(), Complex.sum(num1, num2).toString());
    }
}