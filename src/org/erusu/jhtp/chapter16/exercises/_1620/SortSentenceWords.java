package org.erusu.jhtp.chapter16.exercises._1620;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SortSentenceWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Set<String> words;

        System.out.printf("Enter sentence: ");
        words = new TreeSet<>(Arrays.asList(input.nextLine().toLowerCase().split("\\W")));

        words.remove("");

        System.out.printf("Words in alphabetical order: %s", words);

        input.close();
    }
}