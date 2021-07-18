package org.erusu.jhtp.chapter14.exercises._1414;

import java.util.Scanner;

public class TokenizeAndCompareStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String words[];
        
        System.out.printf("Enter a sentence: ");
        words = input.nextLine().split("\\s+");

        for(String word : words) {
            if(word.toLowerCase()
                .substring(word.length() - 2, word.length())
                .equals("ed"))
                System.out.printf("%s\n", word);
        }

        input.close();
    }
}