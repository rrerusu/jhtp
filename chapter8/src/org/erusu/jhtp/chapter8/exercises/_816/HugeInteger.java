package org.erusu.jhtp.chapter8.exercises._816;

// import org.erusu.jhtp.chapter8.exercises._816.HugeInteger;

public class HugeInteger {
    private int[] num;

    // Constructors
    public HugeInteger() {
        num = new int[40];
    }

    public HugeInteger(int[] numArr) {
        num = new int[40];

        for(int nextDigit = 1; nextDigit <= numArr.length; nextDigit++) {
            num[num.length - nextDigit] = numArr[numArr.length - nextDigit];
        }
    }

    // Accessor and Modifier Methods
    public int[] getNum() {
        return num;
    }

    public void setNum(int[] newNum) {
        for(int indx = 0; indx < num.length; indx++)
            num[indx] = newNum[indx];
    }

    public void parse(String strNum) {
        for(int indx = 1; indx <= strNum.length(); indx++) {
            num[num.length - indx] = strNum.charAt(strNum.length() - indx) - 48;
        }
    }

    public String toString() {
        String str = "";
        for(int indx = 0; indx < num.length; indx++)
            str += num[indx];

        return str;
    }
}
