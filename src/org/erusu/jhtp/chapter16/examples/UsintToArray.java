package org.erusu.jhtp.chapter16.examples;

import java.util.Arrays;
import java.util.LinkedList;

public class UsintToArray {
    public static void main(String[] args) {
        String[] colors = {"black", "blue", "yellow"};
        LinkedList<String> links = new LinkedList<>(Arrays.asList(colors));

        links.addLast("red");
        links.add("pink");
        links.add(3, "green");
        links.addFirst("cyan");

        colors = links.toArray(new String[links.size()]);

        System.out.printf("colors:\n");

        for(String color : colors)
            System.out.printf("%s\n", color);
    }
}