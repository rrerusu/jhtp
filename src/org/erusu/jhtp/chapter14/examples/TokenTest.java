package org.erusu.jhtp.chapter14.examples;

import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a sentence and press Enter");
        String sentence = input.nextLine();

        String[] tokens = sentence.split(" ");
        System.out.printf("\n\nNumber of elements: %d\nThe tokens are:\n", tokens.length);

        for(String token : tokens) {
            System.out.println(token);
        }

        input.close();
    }
}