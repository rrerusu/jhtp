package org.erusu.jhtp.chapter8.exercises._815;

public class RationalDriver {
    public static void main(String[] args) {
        Rational num1 = new Rational(15, 33);
        Rational num2 = new Rational(1, 2);

        Rational sum = Rational.add(num1, num2);
        Rational difference = Rational.subtract(num1, num2);
        Rational product = Rational.multiply(num1, num2);
        Rational quotient = Rational.divide(num1, num2);

        System.out.printf("num1: %s%nnum2: %s", num1.toStringFraction(), num2.toStringFraction());
        System.out.printf("%nnum1: %s%nnum2: %s", num1.toStringDecimal(), num2.toStringDecimal());

        System.out.printf("%n%nsum: %s%ndifference: %s%nproduct: %s%nquotient: %s%n",
            sum.toStringFraction(), difference.toStringFraction(), product.toStringFraction(), quotient.toStringFraction());
    }
}