package org.erusu.jhtp.chapter8.exercises._816;

// import org.erusu.jhtp.chapter8.exercises._816.HugeInteger;

public class HugeIntegerTest {
    public static void main(String[] args) {
        HugeInteger myInt = new HugeInteger();

        myInt.parse("4404");
        System.out.printf("%s", myInt.toString());
    }
}