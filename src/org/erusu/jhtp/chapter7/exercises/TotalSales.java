package org.erusu.jhtp.chapter7.exercises;

import java.util.Scanner;

public class TotalSales {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double[][] sales = new double[5][4];
		
		int person = 0,
			product = 0,
			salesCounter = 0;
		
		double cost = 0;
		
		String choice = "";
		
		while(salesCounter < 20 && !choice.toLowerCase().equals("n")) {
			
			System.out.print("Enter salesperson number: ");
			person = input.nextInt();
			System.out.print("Enter product number: ");
			product = input.nextInt();
			System.out.print("Enter cost of product sold: ");
			cost = input.nextDouble();
			
			if(!choice.toLowerCase().equals("n")) {
				if(sales[product - 1][person - 1] != cost)
					salesCounter++;
				sales[product - 1][person - 1] = cost; 
			}
			
			do {
				System.out.print("\nEnter more info? (y or n): ");
				choice = input.next();
			} while(!(choice.toLowerCase().equals("y") || choice.toLowerCase().equals("n")));
			System.out.println();
		}
		
		dispInfo(sales);
		
		input.close();
	}
	
	public static void dispInfo(double[][] salesArr) {
		System.out.printf("%-9s|%-8s|%-8s|%-8s|%-8s|%-8s%n",
				"Product", "Person 1", "Person 2", "Person 3", "Person 4", "Total");
		System.out.printf("%54s%n", "------------------------------------------------------");
		
		for(int product = 0; product < salesArr.length; product++) {
			double productTotal = 0;
			System.out.printf("%-9s", ("Product " + (product + 1)));
			
			for(int price = 0; price < salesArr[product].length; price++) {
				System.out.printf("|%8.2f", salesArr[product][price]);
				productTotal += salesArr[product][price];
			}
			
			System.out.printf("|%8.2f%n", productTotal);
		}
		
		double personTotal = 0;
		
		System.out.printf("%-9s", ("Total"));
		for(int price = 0; price < salesArr[0].length; price++) {
			for(int product = 0; product < salesArr.length; product++) {
				personTotal += salesArr[product][price];
			}
			System.out.printf("|%8.2f", personTotal);
			personTotal = 0;
		}
		System.out.print("|");
	}
}