package org.erusu.jhtp.chapter14.exercises._1409;

import java.util.Scanner;

public class ReversedWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder myBuilder;

        String[] sentenceWords;

        System.out.printf("Enter sentence: ");
        sentenceWords = input.nextLine().split("\\s");

        for(int index = 0; index < sentenceWords.length; index++) {
            myBuilder = new StringBuilder(sentenceWords[index]);
            sentenceWords[index] = myBuilder.reverse().toString();
            System.out.printf("%s ", sentenceWords[index]);
        }

        input.close();
    }
}