package org.erusu.jhtp.chapter14.examples;

import java.util.Arrays;

public class RegexSubstitution {
    public static void main(String[] args) {
        String firstString = "This sentence ends in 5 stars *****";
        String secondString = "1, 2, 3, 4, 5, 6, 7, 8";

        // Modify firstString
        System.out.printf("Original String 1: %s\n", firstString);

        firstString = firstString.replaceAll("\\*", "^");

        System.out.printf("^ substituted for *: %s\n", firstString);

        firstString = firstString.replaceAll("stars", "carets");

        System.out.printf("\"carets\" substituted for \"stars\": %s\n", firstString);

        System.out.printf("Every word replaced by \"word\": %s\n\n",
            firstString.replaceAll("\\w+", "word"));
        


        // Modify secondString
        System.out.printf("Original String 2: %s\n", secondString);

        for(int i = 0; i < 3; i++) {
            secondString = secondString.replaceFirst("\\d", "digit");
        }

        System.out.printf("First 3 digits replaced by \"digit\": %s\n", secondString);

        System.out.printf("String split at commas: ");
        String[] results = secondString.split(",\\s*");
        System.out.printf(Arrays.toString(results));
    }
}