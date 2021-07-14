package org.erusu.jhtp.chapter14.exercises._1403;

import java.util.Scanner;

public class ComparingPortionsOfStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter first string: ");
        String str1 = input.nextLine();

        System.out.printf("Enter second string: ");
        String str2 = input.nextLine();

        System.out.printf("Enter number of characters to compare: ");
        int numChars = input.nextInt();

        System.out.printf("Enter starting index of first string: ");
        int index1 = input.nextInt();

        System.out.printf("Enter starting index of other string: ");
        int index2 = input.nextInt();

        if(str1.regionMatches(index1, str2, index2, numChars))
            System.out.printf("\"%s\" is equal to \"%s\"",
                str1.substring(index1, index1 + numChars),
                str2.substring(index2, index2 + numChars));
        else
            System.out.printf("\"%s\" isn't equal to \"%s\"",
                str1.substring(index1, index1 + numChars),
                str2.substring(index2, index2 + numChars));

        input.close();
    }
}