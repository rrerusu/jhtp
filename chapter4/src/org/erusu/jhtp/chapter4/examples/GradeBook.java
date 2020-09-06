package org.erusu.jhtp.chapter4.examples;

import java.util.Scanner;

public class GradeBook {
	
	private String courseName;
	
	// Constructor that accepts course name
	public GradeBook(String name) {
		courseName = name;
	}
	
	// Set method for courseName
	public void setCourseName(String name) {
		courseName = name;
	}
	
	// Get method for courseName
	public String getCourseName() {
		return courseName;
	}

	// Display welcome message
	// 3.11 addition: Include message that says who the course is taught by
	public void displayMessage() {
		System.out.printf("Welcome to the grade book for \n%s!\n", getCourseName());

	}
	
	// 4.6 addition: Calculate class average
	// 4.9 addition: If user doesn't want to enter grades, he/she can enter -1 to exit   
	public void determineClassAverage() {
		// create scanner
		Scanner input = new Scanner(System.in);
		
		// declare variables
		int total, gradeCounter, grade;
		double average;
		
		// initialization phase
		total = 0;
		gradeCounter = 0;
		grade = 0;
		
		System.out.print("Enter grade or -1 to quit: ");
		grade = input.nextInt();
		
		// get inputs for the grades
		while(grade != -1) {
			total += grade;
			gradeCounter++;
			
			System.out.print("Enter grade or -1 to quit: ");
			grade = input.nextInt();
		}
		
		// if user uses at least one phase
		if(gradeCounter != 0) {
			
			// calculate average
			average = total / 10;
			
			// display information
			System.out.printf("%nTotal of all 10 grades is %d%n", total);
			System.out.printf("Class average is %d%n", average);
		} else {
			System.out.println("No grades were entered.");
		}
		
		// close scanner
		input.close();
	}
	

}
