package org.erusu.jhtp.chapter7.exercises;

public class CommandLineArguments {
	public static void main(String[] args) {
		int[] array = new int[Integer.parseInt(args[0])];
		
		for(int counter = 0; counter < array.length; counter++) {
			array[counter] = 2 + 2 * counter;
		}
		
		System.out.printf("%s%8s%n", "Index", "Value");
		
		for(int counter = 0; counter < array.length; counter++) {
			System.out.printf("%5d%8d%n", counter, array[counter]);
		}
	}
}