package org.erusu.jhtp.chapter14.exercises._1413;

import java.util.Scanner;

public class TokenizeAndCompareStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String words[];
        
        System.out.printf("Enter a sentence: ");
        words = input.nextLine().split("\\s+");

        for(String word : words) {
            if(word.toLowerCase().startsWith("b"))
                System.out.printf("%s\n", word);
        }

        input.close();
    }
}