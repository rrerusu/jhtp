package org.erusu.jhtp.chapter8.exercises._816;

public class HugeInteger {
	static final int HUGE_INTEGER_LIMIT = 40;

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
        num = new int[HUGE_INTEGER_LIMIT];

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
        num = new int[HUGE_INTEGER_LIMIT];

        positive = positiveSign;

        for(int nextDigit = 1; nextDigit <= numArr.length; nextDigit++) {
            num[num.length - nextDigit] = numArr[numArr.length - nextDigit];
        }
    }

	/**
	 * Constructor: Set this number and sign to given value and sign
	 * @param newNum number to change this number to
	 */
	public HugeInteger(HugeInteger newNum) {
		num = newNum.getNum();
		positive = newNum.isPositive();
	}

	/**
	 * Constructor: Set this number and sign to given value and sign
	 * @param newNum number to change this number to
	 * @param newSign new sign to change number to
	 */
	public HugeInteger(HugeInteger newNum, boolean newSign) {
		num = newNum.getNum();
		positive = newSign;
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
	 * Modifier method for positive
	 * @param sign Positive or negative sign of number
	 */
	public void setSign(boolean sign) {
		positive = sign;
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

    	for(int indx = 0; indx < HUGE_INTEGER_LIMIT; indx++) {
    		if(num[indx] != anotherNum.getNum()[indx])
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
    	return !this.isEqualTo(anotherNum);
    }

    /**
     * Book Method: Test to see if this HugeInteger is less than another HugeInteger
     * @param anotherNum num to test against
     * @return If this num is less than anotherhNum
     */
    public boolean isLessThan(HugeInteger anotherNum) {
        if(positive ^ anotherNum.isPositive())
            return anotherNum.isPositive();

        for(int digit = 0; digit < HUGE_INTEGER_LIMIT; digit++) {
            if((positive && anotherNum.getNum()[digit] > num[digit]) ||
                (!positive && anotherNum.getNum()[digit] < num[digit]))
                    return true;
			if((positive && anotherNum.getNum()[digit] < num[digit]) ||
				(!positive && anotherNum.getNum()[digit] > num[digit]))
				return false;
        }

        return false;
    }

	/**
	 * Book Method: Test to see if this HugeInteger is less than or equal to another HugeInteger
	 * @param anotherNum num to test against
	 * @return Is this num less than or equal to anotherNum
	 */
	public boolean isLessThanOrEqualTo(HugeInteger anotherNum) {
		return !this.isGreaterThan(anotherNum);
	}

	/**
	 * Book Method: Test to see if this HugeInteger is greater than another HugeInteger
	 * @param anotherNum num to test against
	 * @return Is this num greater than anotherNum
	 */
	public boolean isGreaterThan(HugeInteger anotherNum) {
		if(positive ^ anotherNum.isPositive())
			return positive;

		for(int digit = 0; digit < HUGE_INTEGER_LIMIT; digit++) {
			if((positive && num[digit] < anotherNum.getNum()[digit]) ||
				(!positive && num[digit] > anotherNum.getNum()[digit]))
				return false;
			if((positive && num[digit] > anotherNum.getNum()[digit]) ||
				(!positive && num[digit] < anotherNum.getNum()[digit]))
				return true;
		}

		return false;
	}

	/**
	 * Book Method: Test to see if this HugeInteger is greater than or equal to another HugeInteger
	 * @param anotherNum num to test against
	 * @return Is this num greater than or equal to anotherNum
	 */
	public boolean isGreaterThanOrEqualTo(HugeInteger anotherNum) {
		return !this.isLessThan(anotherNum);
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

	/**
	 * Add 2 HugeIntegers
	 * @param num1 first HugeInteger
	 * @param num2 second HugeInteger
	 * @return sum of num1 and num2.  If sum is too big, print error message and return nothing
	 */
	public static HugeInteger add(HugeInteger num1, HugeInteger num2) {
		if(num1.isPositive() ^ num2.isPositive()) {
			return (num1.isPositive()) ? HugeInteger.subtract(num1, new HugeInteger(num2, true)) :
				HugeInteger.subtract(num2, new HugeInteger(num1, true));
		} else {
			int[] sum = new int[HUGE_INTEGER_LIMIT];
			try {
				int digitSum,
					memory = 0;
				for(int indx = 1; indx < HUGE_INTEGER_LIMIT; indx++) {
					digitSum = num1.getNum()[HUGE_INTEGER_LIMIT - indx] + num2.getNum()[HUGE_INTEGER_LIMIT - indx] + memory;
					sum[HUGE_INTEGER_LIMIT - indx] = digitSum % 10;
					memory = digitSum / 10;
				}
			} catch (ArrayIndexOutOfBoundsException sumTooBig) {
				System.out.printf("Error: %s%n%n", sumTooBig.toString());
				return null;
			}

			return new HugeInteger(sum, num1.isPositive());
		}
	}

	/**
	 * Subtract 2 HugeIntegers
	 * @param num1 first HugeInteger
	 * @param num2 second HugeInteger
	 * @return difference of num1 and num2
	 */
	public static HugeInteger subtract(HugeInteger num1, HugeInteger num2) {
		if(num1.isPositive() ^ num2.isPositive()) {
			return HugeInteger.add(num1, new HugeInteger(num2, !num2.isPositive()));
		} else {
			if(num1.isEqualTo(num2))
				return new HugeInteger();
			else {
				int[] difference = new int[HUGE_INTEGER_LIMIT];
				try {
					int num1Digit, num2Digit, nextDigit;
					boolean carry = false;
					for(int indx = 1; indx < HUGE_INTEGER_LIMIT; indx++) {
						nextDigit = HUGE_INTEGER_LIMIT - indx;
						num1Digit = num1.getNum()[nextDigit];
						num2Digit = num2.getNum()[nextDigit];
						difference[nextDigit] = (num1Digit + 10 - num2Digit) % 10 - ((carry) ? 1 : 0);
						carry = num1Digit < num2Digit;
					}
				} catch (ArrayIndexOutOfBoundsException differenceTooBig) {
					System.out.printf("Error: %s%n%n", differenceTooBig.toString());
					return null;
				}

				return new HugeInteger(difference, num1.isGreaterThan(num2));
			}
		}
	}

	// TODO: multiply()
	/**
	 * Multiply 2 HugeIntegers
	 * @param num1 first HugeInteger
	 * @param num2 second HugeInteger
	 * @return product of num1 and num2
	 */
//	public static HugeInteger multiply(HugeInteger num1, HugeInteger num2) {
//
//	}

	// TODO: divide()
	/**
	 * Divide 2 HugeIntegers
	 * @param num1 first HugeInteger
	 * @param num2 second HugeInteger
	 * @return quotient of num1 and num2
	 */
//	public static HugeInteger divide(HugeInteger num1, HugeInteger num2) {
//
//	}

	// TODO: remainder()
	/**
	 * Calculate module of 2 HugeIntegers
	 * @param num1 first HugeInteger
	 * @param num2 second HugeInteger
	 * @return remainder of num1 and num2
	 */
//	public static HugeInteger remainder(HugeInteger num1, HugeInteger num2) {
//
//	}

    /**
     * toString Override: Create 40-digit long number with sign
     * @return String representing this HugeInteger
     */
    @Override
    public String toString() {
        String str = "";
        for(int digit : num)
            str += digit;

        str = (positive ? "" : "-") + str.replaceAll("^([0]+)", "");

        return (str.equals("")) ? "0" : str;
    }
}
