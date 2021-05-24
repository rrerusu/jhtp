package org.erusu.jhtp.chapter8.exercises._813;

public class IntegerSetTest {
    public static void main(String[] args) {
        IntegerSet oddSet = new IntegerSet();
        IntegerSet evenSet = new IntegerSet();
        IntegerSet seventhSet = new IntegerSet();

        // Fill each set
        for(int indx = 0; indx < 101; indx++) {
            if(indx % 7 == 0)
                seventhSet.insertElement(indx);

            if(indx % 2 == 1)
                oddSet.insertElement(indx);
            else
                evenSet.insertElement(indx);
        }

        System.out.printf("%n%noddSet: %s%nevenSet: %s", oddSet.toString(), evenSet.toString());

        System.out.printf("%n%nunion set: %s%nintersection set: %s", IntegerSet.union(oddSet, evenSet), IntegerSet.intersection(oddSet, evenSet));

        System.out.printf("%n%n6th set:%nEven union: %s%nEven intersection: %s", IntegerSet.union(seventhSet, evenSet), IntegerSet.intersection(seventhSet, evenSet));
        System.out.printf("%nOdd union: %s%nodd intersection: %s", IntegerSet.union(seventhSet, oddSet), IntegerSet.intersection(seventhSet, oddSet));
    }
}
