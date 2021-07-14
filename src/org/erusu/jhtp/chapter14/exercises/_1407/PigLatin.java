package org.erusu.jhtp.chapter14.exercises._1407;

import java.util.Scanner;


public class PigLatin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder mySentenceBuilder = new StringBuilder();

        String[] sentenceWords;

        System.out.printf("Enter a sentence you want to translate: ");
        sentenceWords = input.nextLine().split(" ");
        
        for(int index = 0; index < sentenceWords.length; index++) {
            mySentenceBuilder.append(String.format("%s%s", (index == 0 ? "" : " "),
                createLatinWord(sentenceWords[index])));
        }

        System.out.printf("Your sentence translated to Pig Latin:\n%s",
            mySentenceBuilder.toString());

        input.close();
    }

    public static String createLatinWord(String str) {
        if(str.length() < 2) {
            return str + "ay";
        } else {
            return str.substring(1, str.length()) + str.charAt(0) + "ay";
        }
    }
}