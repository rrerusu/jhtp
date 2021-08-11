package org.erusu.jhtp.chapter16.exercises._1613;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateElimination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<String> firstNames;

        String firstName;

        System.out.printf("Enter first names: ");
        firstNames = new HashSet<>(
            Arrays.asList(input.nextLine().split(" "))
        );

        System.out.printf("First names: ");
        for(String name : firstNames)
            System.out.printf("%s ", name);

        System.out.printf("\n\nEnter first name to see if it exists: ");
        firstName = input.next();

        System.out.printf("%s does %sexist.",
            firstName,
            (firstNames.contains(firstName)) ? "" : "not ");

        input.close();
    }
}
