package org.erusu.jhtp.chapter5.exercises;

import java.util.Scanner;

public class BarChartPrinter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String barChart = "";
		int barSize;
		
		for(int counter = 0; counter < 5; counter++) {
			System.out.print("Enter #" + (counter + 1) + "(between 1 and 30): ");
			barSize = input.nextInt();
			for(int barCounter = 0; barCounter < barSize; barCounter++)
				barChart += "*";
			
			barChart += "\n";
		}
		
		System.out.println("\n" + barChart);
		
		input.close();
	}
}