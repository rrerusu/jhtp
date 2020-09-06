package org.erusu.jhtp.chapter4.exercisies;

import java.util.Scanner;

public class SalaryCalculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int hoursWorked;
		double hourlyPay, salary;
		
		System.out.print("Enter hours worked: ");
		hoursWorked = input.nextInt();
		System.out.print("Enter hourly pay: ");
		hourlyPay = input.nextDouble();
		
		salary = (hoursWorked <= 40)? hoursWorked * hourlyPay : 
			40 * hourlyPay + ((hoursWorked - 40) * (hourlyPay * 0.5));
		
		
		System.out.println("Salary: " + salary);
		
		input.close();
	}
}