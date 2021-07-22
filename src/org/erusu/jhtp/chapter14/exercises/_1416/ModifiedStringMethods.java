package org.erusu.jhtp.chapter14.exercises._1416;

public class ModifiedStringMethods {
    public static void main(String[] args) {
        System.out.printf("Index of s in distances: %d\n", myIndexOf("distances", 's'));
        System.out.printf("Index of s in forgot: %d\n\n", myIndexOf("forgot", 's'));
        System.out.printf("Last index of s in distances: %d\n", myLastIndexOf("distances", 's'));
        System.out.printf("Last index of s in forgot: %d\n", myLastIndexOf("forgot", 's'));
    }

    public static int myIndexOf(String str, char ch) {
        char[] inputStr = str.toCharArray();

        for(int index = 0; index < inputStr.length; index++) {
            if(inputStr[index] == ch)
                return index;
        }

        return -1;
    }

    public static int myLastIndexOf(String str, char ch) {
        char[] inputStr = str.toCharArray();

        int lastFoundIndex = -1;

        for(int index = 0; index < inputStr.length; index++) {
            if(inputStr[index] == ch)
                lastFoundIndex = index;
        }

        return lastFoundIndex;
    }
}