package org.erusu.jhtp.chapter14.exercises._1403;

import java.util.Scanner;

public class ComparingString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter first string: ");
        String str1 = input.nextLine();

        System.out.printf("Enter second string: ");
        String str2 = input.nextLine();

        if(str1.compareTo(str2) < 0)
            System.out.printf("\"%s\" is less than \"%s\"",
                str1, str2);
        else if(str1.compareTo(str2) > 0)
            System.out.printf("\"%s\" is greater than \"%s\"",
                str1, str2);
        else
            System.out.printf("\"%s\" is equal to \"%s\"",
                str1, str2);

        input.close();
    }
}