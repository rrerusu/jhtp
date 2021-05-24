package org.erusu.jhtp.chapter8.exercises._815;

public class Rational {
    private int numerator;
    private int denominator;

    // default constructor
    public Rational() {
        numerator = 1;
        denominator = 1;
        Rational.reduce(this);
    }

    public Rational(int num, int denom) {
        numerator = num;
        denominator = denom;
        Rational.reduce(this);
    }

    // reduce "fraction" to lowerst terms
    public static void reduce(Rational frac) {
        int least = Math.min(frac.getNumerator(), frac.getDenominator()),
            gcf = 1;

        // calculate GCF
        for(int num = 2; num <= least; num++) {
            if(frac.getNumerator() % num == 0 && frac.getDenominator() % num == 0)
                gcf = num;
        }

        // reduce fraction
        frac.setNumerator(frac.getNumerator() / gcf);
        frac.setDenominator(frac.getDenominator() / gcf);
    }

    // accessor and modifier methods
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int num) {
        numerator = num;
    }

    public void setDenominator(int den) {
        denominator = den;
    }

    // Operations
    public static Rational add(Rational num1, Rational num2) {
        return new Rational((num1.getNumerator() * num2.getDenominator() + num1.getDenominator() * num2.getNumerator()), num1.getDenominator() * num2.getDenominator());
    }

    public static Rational subtract(Rational num1, Rational num2) {
        return new Rational((num1.getNumerator() * num2.getDenominator() - num1.getDenominator() * num2.getNumerator()), num1.getDenominator() * num2.getDenominator());
    }

    public static Rational multiply(Rational num1, Rational num2) {
        return new Rational(num1.getNumerator() * num2.getNumerator(), num1.getDenominator() * num2.getDenominator());
    }

    public static Rational divide(Rational num1, Rational num2) {
        return new Rational(num1.getNumerator() * num2.getDenominator(), num1.getDenominator() * num2.getNumerator());
    }

    // toStrings
    public String toStringFraction() {
        return String.format("%d/%d", numerator, denominator);
    }

    public String toStringDecimal() {
        return String.format("%f", numerator * 1.0 / denominator);
    }
}
