package org.erusu.jhtp.chapter14.exercises._1418;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C_WordOccurence {
    public static void main(String[] args) {
        List<String> uniqueWords = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        int[] occurences;
        String[] sentenceWords;

        System.out.printf("Enter sentence: ");
        sentenceWords = input.nextLine().toLowerCase().split("\\s+");

        // Create List of only the unique words to find occurences
        for(int index = 0; index < sentenceWords.length; index++) {
            if(!uniqueWords.contains(sentenceWords[index]))
                uniqueWords.add(sentenceWords[index]);
        }

        // Create array of occurences that match up to respective words in unique words list
        occurences = new int[uniqueWords.size()];

        for(int index = 0; index < uniqueWords.size(); index++) {
            occurences[index] = numOccurences(sentenceWords, uniqueWords.get(index));
        }

        // Print array
        System.out.printf("%-15s%s\n", "Word length", "Occurences");
        for(int index = 0; index < occurences.length; index++) {
            System.out.printf("%-15s%d\n", uniqueWords.get(index), occurences[index]);
        }

        input.close();
    }

    public static int numOccurences(String[] words, String word) {
        int occurences = 0;
        for(int index = 0; index < words.length; index++) {
            if(words[index].equals(word))
                occurences++;
        }

        return occurences;
    }
}