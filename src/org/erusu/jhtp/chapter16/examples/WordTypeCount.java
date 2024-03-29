package org.erusu.jhtp.chapter16.examples;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class WordTypeCount {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<>();

        createMap(myMap);
        displayMap(myMap);
    }

    private static void createMap(Map<String, Integer> map) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a string:\n");
        String userInput = input.nextLine();

        String[] tokens = userInput.split(" ");

        for(String token : tokens) {
            String word = token.toLowerCase();

            if(map.containsKey(word)) {
                int count = map.get(word);
                map.put(word, count + 1);
            } else {
                map.put(word, 1);
            }
        }

        input.close();
    }

    private static void displayMap(Map<String, Integer> map) {
        Set<String> keys = map.keySet();
        TreeSet<String> sortedKeys = new TreeSet<>(keys);

        System.out.printf("\nMap contains:\nKey\t\tValue\n");

        for(String key : sortedKeys)
            System.out.printf("%-10s%10s\n", key, map.get(key));
        
        System.out.printf("\nsize: %d\nisEmpty: %b\n", map.size(), map.isEmpty());
    }
}