package org.erusu.jhtp.chapter8.exercises._816;

// import org.erusu.jhtp.chapter8.exercises._816.HugeInteger;

public class HugeIntegerTest {
    public static void main(String[] args) {
        HugeInteger test1num1 = new HugeInteger(), test1num2 = new HugeInteger(),
			test2num1 = new HugeInteger(), test2num2 = new HugeInteger(),
			test3num1 = new HugeInteger(), test3num2 = new HugeInteger(),
			test3num3 = new HugeInteger(), test3num4 = new HugeInteger(),
			zeroTestNum = new HugeInteger();

		String[][] conditionalResults = new String[8][8];

        // create test cases
        test1num1.parse("10");
		test1num2.parse("5");
		test2num1.parse("-5");
		test2num2.parse("-10");
		test3num1.parse("2");
		test3num2.parse("-2");
		test3num3.parse("-3");
		test3num4.parse("-3");
		zeroTestNum.parse("0");

		// set values
		conditionalResults[0] = runConditionalTests(test1num1, test1num2);
		conditionalResults[1] = runConditionalTests(test1num2, test1num1);
		conditionalResults[2] = runConditionalTests(test2num1, test2num2);
		conditionalResults[3] = runConditionalTests(test2num2, test2num1);

		conditionalResults[4] = runConditionalTests(test3num1, test3num2);
		conditionalResults[5] = runConditionalTests(test3num2, test3num1);
		conditionalResults[6] = runConditionalTests(test3num3, test3num3);
		conditionalResults[7] = runConditionalTests(test3num4, test3num4);

		System.out.printf("Conditional Method Tests:%n| %40s | %40s | %10s | %10s | %10s | %10s | %10s | %10s |%n",
			"num 1", "num 2", "==", "!=", "<", "<=", ">", ">=");
		System.out.printf("%s%s%n",
			"-------------------------------------------------------------------------------------",
			"--------------------------------------------------------------------------------");

		for (String[] conditionalResult : conditionalResults) {
			System.out.printf("| %40s | %40s | %10s | %10s | %10s | %10s | %10s | %10s |%n",
				conditionalResult[0], conditionalResult[1], conditionalResult[2],
				conditionalResult[3], conditionalResult[4], conditionalResult[5],
				conditionalResult[6], conditionalResult[7]);
		}

		System.out.printf("%n0 test:%n0 == 0? -> %s%n5 == 0? -> %s%n%n%n",
			zeroTestNum.isZero(), test1num2.isZero());

		HugeInteger test = HugeInteger.add(test1num1, test1num2);

		// System.out.printf("%s + %s = %s%n%s - %s = %s%n%s * %s = %s%n%s / %s = %s%n%s mod %s = %s",
		// 	test1num1.toString(), test1num2.toString(), HugeInteger.add(test1num1, test1num2).toString(),
		// 	test1num1.toString(), test1num2.toString(), HugeInteger.subtract(test1num1, test1num2).toString(),
		// 	test1num1.toString(), test1num2.toString(), HugeInteger.multiply(test1num1, test1num2).toString(),
		// 	test1num1.toString(), test1num2.toString(), HugeInteger.divide(test1num1, test1num2).toString(),
		// 	test1num1.toString(), test1num2.toString(), HugeInteger.remainder(test1num1, test1num2).toString());
    }

    public static String[] runConditionalTests(HugeInteger num1, HugeInteger num2) {
		return new String[]{num1.toString(), num2.toString(), "" + num1.isEqualTo(num2), "" + num1.isNotEqualTo(num2),
			"" + num1.isLessThan(num2), "" + num1.isLessThanOrEqualTo(num2),
			"" + num1.isGreaterThan(num2), "" + num1.isGreaterThanOrEqualTo(num2)};
	}
}
