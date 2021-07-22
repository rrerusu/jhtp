package org.erusu.jhtp.chapter14.exercises._1418;

import java.util.Scanner;

public class B_WordLengthOccurence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int occurences[],
            longestWordLength = 1;
        String[] sentenceWords;

        System.out.printf("Enter sentence: ");
        sentenceWords = input.nextLine().split("\\s+");

        // Find array length
        for(int index = 0; index < sentenceWords.length; index++) {
            if(sentenceWords[index].length() > longestWordLength)
                longestWordLength = sentenceWords[index].length();
        }

        occurences = new int[longestWordLength + 1];

        /* Length of words correspond to index of array.
         * eg. increase index '2' if word is 2 letters long
         */
        for(int index = 0; index < sentenceWords.length; index++) {
            occurences[sentenceWords[index].length()]++;
        }

        // Print array (skip 0th index, no 0 letter words)
        System.out.printf("%-15s%s\n", "Word length", "Occurences");
        for(int index = 1; index < occurences.length; index++) {
            System.out.printf("%-15d%d\n", index, occurences[index]);
        }

        input.close();
    }

    public static int numOccurences(String[] words, int wordLen) {
        int occurences = 0;

        for(int index = 0; index < words.length; index++) {
            if(words[index].length() == wordLen)
                occurences++;
        }

        return occurences;
    }
}