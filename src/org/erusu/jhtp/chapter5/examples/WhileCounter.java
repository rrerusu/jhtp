package org.erusu.jhtp.chapter5.examples;

import java.util.Scanner;

public class WhileCounter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int counter = 1;
		while(counter <= 10) {
			System.out.printf("%d   ", counter++);
		}
		
		System.out.println();
		input.close();
	}
}