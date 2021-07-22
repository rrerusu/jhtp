package org.erusu.jhtp.chapter14.exercises._1418;

import java.util.Scanner;

public class A_LetterOccurence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int occurences;

        String mySentence,
            alphabet = "abcdefghijklmnopqrstuvwxyz";

        System.out.printf("Enter a sentence: ");
        mySentence = input.nextLine();

        for(int index = 0; index < alphabet.length(); index++) {
            occurences = numOccurences(mySentence.toLowerCase(), alphabet.charAt(index));

            System.out.printf("%s occurs %d %s\n",
                alphabet.charAt(index),
                occurences,
                "time" + ((occurences == 1) ? "" : "s"));
        }

        input.close();
    }

    public static int numOccurences(String str, char ch) {
        int occurences = 0,
            index = -1;

        do {
            index = str.indexOf(ch, index + 1);

            if(index != -1)
                occurences++;
        } while(index != -1);

        return occurences;
    }
}