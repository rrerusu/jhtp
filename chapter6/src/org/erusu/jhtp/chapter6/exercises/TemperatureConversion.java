package org.erusu.jhtp.chapter6.exercises;

import java.util.Scanner;

public class TemperatureConversion {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String choice = "";
		
		do {
			System.out.print("Enter type of temp (f for fahrenheit, c for celcius): ");
			choice = input.next().toLowerCase();
		} while(!(choice.equals("f") || choice.equals("c")));
		
		System.out.print("Enter temperature: ");
		double temp = input.nextDouble();
		
		if(choice.equals("f"))
			System.out.printf("%f Deg F = %f Deg C", temp, getCelcius(temp));
		else
			System.out.printf("%f Deg C = %f Deg F", temp, getFahrenheit(temp));
		
		input.close();
	}
	
	public static double getFahrenheit(double celcius) {
		return 9.0 / 5.0 * celcius + 32;
	}
	
	public static double getCelcius(double fahrenheit) {
		return 5.0 / 9.0 * (fahrenheit - 32);
	}
}
