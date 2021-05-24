package org.erusu.jhtp.chapter8.exercises._816;

// import org.erusu.jhtp.chapter8.exercises._816.HugeInteger;

public class HugeIntegerTest {
    public static void main(String[] args) {
        HugeInteger num1 = new HugeInteger(),
            num2 = new HugeInteger();

        num1.parse("-2");
        num2.parse("-2");
        System.out.printf("num1: %s%nnum2: %s%n", num1.toString(), num2.toString());

        // TODO: implement other test cases
		System.out.printf("num1 = num2: %b%nnum1 != num2: %b%n", num1.isEqualTo(num2), num1.isNotEqualTo(num2));
        System.out.printf("num1 < num2: %b%nnum1 <= num2: %b%n", num1.isLessThan(num2), num1.isLessThanOrEqualTo(num2));
		System.out.printf("num1 > num2: %b%nnum1 >= num2: %b%n", num1.isGreaterThan(num2), num1.isGreaterThanOrEqualTo(num2));
    }
}
