package org.erusu.jhtp.chapter3.exercises;

public class Employee {
	
	// declare private variables
	private String fName, lName;
	private double salary;		// salary is monthly
	
	// constructor to define all variables
	public Employee(String firstName, String lastName, double monthlySalary) {
		fName = firstName;
		lName = lastName;
		if(monthlySalary > 0) {
			salary = monthlySalary;
		}
	}
	
	// get method for fName
	public String getFirstName() {
		return fName;
	}
	
	// set method for fName
	public void setFirstName(String firstName) {
		fName = firstName;
	}
	
	// get method for lName
	public String getLastName() {
		return lName;
	}
	
	// set method for lName
	public void setLastName(String lastName) {
		lName = lastName;
	}
	
	// get method for salary
	public double getSalary() {
		return salary;
	}
	
	// set method for salary
	public void setSalary(double monthlySalary) {
		salary = monthlySalary;
	}
	
	

}