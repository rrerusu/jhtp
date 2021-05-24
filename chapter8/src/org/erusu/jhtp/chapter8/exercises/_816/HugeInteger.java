package org.erusu.jhtp.chapter8.exercises._816;

public class HugeInteger {
    private final int[] num;
    private boolean positive;

    // Constructors
    /**
     * Book method: Default constructor for Huge Integer
     */
    public HugeInteger() {
        num = new int[40];
        positive = true;
    }

    /**
     * Constructor: Without sign
     * @param numArr Array to pass into num value
     */
    public HugeInteger(int[] numArr) {
        num = new int[40];

        for(int nextDigit = 1; nextDigit <= numArr.length; nextDigit++) {
            num[num.length - nextDigit] = numArr[numArr.length - nextDigit];
        }

        positive = true;
    }

    /**
     * Constructor: With sign variable for negative number
     * @param numArr Array to pass into num value
     * @param positiveSign Sign value of number: positive or negative
     */
    public HugeInteger(int[] numArr, boolean positiveSign) {
        num = new int[40];

        positive = positiveSign;

        for(int nextDigit = 1; nextDigit <= numArr.length; nextDigit++) {
            num[num.length - nextDigit] = numArr[numArr.length - nextDigit];
        }

        positive = true;
    }

    // Accessor and Modifier Methods
    /**
     * Accessor method for num
     * @return num
     */
    public int[] getNum() {
        return num;
    }

    /**
     * Modifier Method for num
     * @param newNum new number to set this number to
     */
    public void setNum(int[] newNum) {
        for(int indx = 0; indx < num.length; indx++)
            num[indx] = newNum[indx];
    }

    /**
     * Accessor method for positive
     * @return sign of number
     */
    public boolean isPositive() {
        return positive;
    }

    /**
     * Book Method: Parse String and create HugeInteger from it
     * @param strNum string to convert into num array
     */
    public void parse(String strNum) {
    	if(strNum.charAt(0) == '-')
    		positive = false;

        for(int indx = 1; indx <= strNum.length() - (strNum.charAt(0) == '-' ? 1 : 0); indx++) {
            num[num.length - indx] = strNum.charAt(strNum.length() - indx) - 48;
        }
    }

	/*
	 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
	 *                                    Comparison Operations                                    *
	 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
	 */

    /**
     * Book Method: Test to see if this HugeInteger is equal to another HugeInteger
     * @param anotherNum num to test against
     * @return If this num is equivalent to anotherNum
     */
    public boolean isEqualTo(HugeInteger anotherNum) {
        if(positive != anotherNum.isPositive())
            return false;

        for(int digit = 0; digit < num.length - 1; digit++) {
            if(num[digit] != anotherNum.getNum()[digit])
                return false;
        }

        return true;
    }

    /**
     * Book Method: Test to see if this HugeInteger is not equal to another HugeInteger
     * @param anotherNum num to test against
     * @return If this num is not equivalent to anotherNum
     */
    public boolean isNotEqualTo(HugeInteger anotherNum) {
        if(positive == anotherNum.isPositive())
            return false;

        for(int digit = 0; digit < num.length - 1; digit++) {
            if(num[digit] == anotherNum.getNum()[digit])
                return false;
        }

        return true;
    }

    /**
     * Book Method: Test to see if this HugeInteger is less than another HugeInteger
     * @param anotherNum num to test against
     * @return If this num is less than anotherhNum
     */
    public boolean isLessThan(HugeInteger anotherNum) {
        if(positive ^ anotherNum.isPositive())
            return anotherNum.isPositive();

        for(int digit = 0; digit < num.length - 1; digit++) {
            if((positive && num[digit] > anotherNum.getNum()[digit]) ||
                (!positive && num[digit] < anotherNum.getNum()[digit]))
                    return false;
        }

        return true;
    }

    // TODO: isLessThanOrEqualTo()
	/**
	 * Book Method: Test to see if this HugeInteger is less than or equal to another HugeInteger
	 * @param anotherNum num to test against
	 * @return Is this num less than or equal to anotherNum
	 */
	public boolean isLessThanOrEqualTo(HugeInteger anotherNum) {

	}

	// TODO: isGreaterThan()
	/**
	 * Book Method: Test to see if this HugeInteger is greater than another HugeInteger
	 * @param anotherNum num to test against
	 * @return Is this num greater than anotherNum
	 */
	public boolean isGreaterThan(HugeInteger anotherNum) {

	}

	// TODO: isGreaterThanOrEqualTo()
	/**
	 * Book Method: Test to see if this HugeInteger is greater than or equal to another HugeInteger
	 * @param anotherNum num to test against
	 * @return Is this num greater than or equal to anotherNum
	 */
	public boolean isGreaterThanOrEqualTo(HugeInteger anotherNum) {

	}

	/**
	 * Book Method: Test to see if this HugeInteger is equivalent to 0
	 * @return Is this number equivalent to zero
	 */
	public boolean isZero() {
		return this.isEqualTo(new HugeInteger());
	}

	/*
	 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
	 *                                    Arithmetic Operations                                    *
	 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
	 */

	// TODO: add()
	/**
	 * Add 2 HugeIntegers
	 * @param num1 first HugeInteger
	 * @param num2 second HugeInteger
	 * @return sum of num1 and num2
	 */
	public static HugeInteger add(HugeInteger num1, HugeInteger num2) {

	}

	// TODO: subtract()
	/**
	 * Subtract 2 HugeIntegers
	 * @param num1 first HugeInteger
	 * @param num2 second HugeInteger
	 * @return difference of num1 and num2
	 */
	public static HugeInteger subtract(HugeInteger num1, HugeInteger num2) {

	}

	// TODO: multiply()
	/**
	 * Multiply 2 HugeIntegers
	 * @param num1 first HugeInteger
	 * @param num2 second HugeInteger
	 * @return product of num1 and num2
	 */
	public static HugeInteger multiply(HugeInteger num1, HugeInteger num2) {

	}

	// TODO: divide()
	/**
	 * Divide 2 HugeIntegers
	 * @param num1 first HugeInteger
	 * @param num2 second HugeInteger
	 * @return quotient of num1 and num2
	 */
	public static HugeInteger divide(HugeInteger num1, HugeInteger num2) {

	}

	// TODO: remainder()
	/**
	 * Calculate module of 2 HugeIntegers
	 * @param num1 first HugeInteger
	 * @param num2 second HugeInteger
	 * @return remainder of num1 and num2
	 */
	public static HugeInteger remainder(HugeInteger num1, HugeInteger num2) {

	}

    /**
     * toString Override: Create 40-digit long number with sign
     * @return String representing this HugeInteger
     */
    @Override
    public String toString() {
        String str = positive ? "" : "-";
        for(int digit : num)
            str += digit;

        return str;
    }
}
