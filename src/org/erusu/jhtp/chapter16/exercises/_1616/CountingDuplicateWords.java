package org.erusu.jhtp.chapter16.exercises._1616;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CountingDuplicateWords {
    public static void main(String[] args) {
        Map<String, Integer> wordCounts = new HashMap<>();
        Set<String> words;
        Scanner input = new Scanner(System.in);

        String[] tokens;

        System.out.printf("Enter a sentence: ");
        tokens = input.nextLine().toLowerCase().split("\\W");

        for(String token : tokens) {
            if(wordCounts.containsKey(token))
                wordCounts.put(token, wordCounts.get(token) + 1);
            else
                wordCounts.put(token, 1);
        }

        wordCounts.remove("");

        words = new TreeSet<>(wordCounts.keySet());

        System.out.printf("%-15s%-15s\n", "Repeated Word", "Occurences");
        for(String word : words) {
            if(wordCounts.get(word) > 1)
                System.out.printf("%-15s%-15s\n", word, wordCounts.get(word));
        }

        input.close();
    }
}