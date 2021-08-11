package org.erusu.jhtp.chapter16.exercises._1614;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class WordTypeCount {
    public static void main(String[] args) {
        Map<Character, Integer> myMap = new HashMap<>();

        createMap(myMap);
        displayMap(myMap);
    }

    private static void createMap(Map<Character, Integer> map) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a string:\n");
        String userInput = input.nextLine();

        char[] tokens = userInput.toCharArray();

        for(char token : tokens) {
            char word = Character.toLowerCase(token);

            if(map.containsKey(word)) {
                int count = map.get(word);
                map.put(word, count + 1);
            } else {
                map.put(word, 1);
            }
        }

        map.remove(' ');

        input.close();
    }

    private static void displayMap(Map<Character, Integer> map) {
        Set<Character> keys = map.keySet();
        TreeSet<Character> sortedKeys = new TreeSet<>(keys);

        System.out.printf("\nMap contains:\nKey\t\tValue\n");

        for(char key : sortedKeys)
            System.out.printf("%-10s%10s\n", key, map.get(key));
        
        System.out.printf("\nsize: %d\nisEmpty: %b\n", map.size(), map.isEmpty());
    }
}