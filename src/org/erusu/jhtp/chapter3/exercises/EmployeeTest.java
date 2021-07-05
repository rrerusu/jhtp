package org.erusu.jhtp.chapter3.exercises;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		// Instantiate objects
		Scanner input = new Scanner(System.in);
		Employee employee1 = new Employee("John", "Doe", 4000.00);
		Employee employee2 = new Employee("Jane", "Doe", 5000.00);
		
		// Declare vars
		double salary;
		
		// Display monthly salary for each employee
		System.out.printf("%s %s's salary: $%.2f%n", 
						   employee1.getFirstName(), employee1.getLastName(), employee1.getSalary());
		System.out.printf("%s %s's salary: $%.2f%n%n",
						   employee2.getFirstName(), employee2.getLastName(), employee2.getSalary());
		
		// get user input for employee's salaries
		System.out.printf("Enter new salary for %s %s: ",
						   employee1.getFirstName(), employee1.getLastName());
		salary = Double.parseDouble(input.nextLine());
		employee1.setSalary(salary);
		
		System.out.printf("Enter new salary for %s %s: ",
						  employee2.getFirstName(), employee2.getLastName());
		salary = Double.parseDouble(input.nextLine());
		employee2.setSalary(salary);
		
		System.out.println();
		
		// Display monthly salary for each employee
				System.out.printf("%s %s's salary: $%.2f%n", 
								   employee1.getFirstName(), employee1.getLastName(), employee1.getSalary());
				System.out.printf("%s %s's salary: $%.2f%n%n",
								   employee2.getFirstName(), employee2.getLastName(), employee2.getSalary());
		
		// close scanner
		input.close();

	}

}
