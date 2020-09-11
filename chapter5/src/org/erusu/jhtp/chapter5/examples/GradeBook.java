package org.erusu.jhtp.chapter5.examples;

import java.util.Scanner;

public class GradeBook {
	
	private String courseName;
	
	// 5.6 addition
	private int aCount,
		bCount,
		cCount,
		dCount,
		fCount;
	
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
	
	// 5.6 addition
	private void incrementLetterGradeCounter(int grade) {
		switch(grade / 10) {
		case 9:
		case 10:
			++aCount;
			break;
		
		case 8:
			++bCount;
			break;
		
		case 7:
			++cCount;
			break;
		
		case 6:
			++dCount;
			break;
		
		default:
			++fCount;
			break;
		}
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
		
		System.out.print("Enter grade or EOF (ctrl + z & enter) to quit: ");
		
		// get inputs for the grades
		while(input.hasNextInt()) {
			grade = input.nextInt();
			total += grade;
			++gradeCounter;
			
			// 5.6 addition
			incrementLetterGradeCounter(grade);
		}
		
		// if user uses at least one phase
		if(gradeCounter != 0) {
			
			// calculate average
			average = total / 10;
			
			// display information
			// 5.6 addition: display grades and counts
			System.out.printf("%nTotal of all 10 grades is %d%n", total);
			System.out.printf("Class average is %.2f%n", average);
			System.out.printf("%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n",
					"Number of students who received each grade:",
					"A: ", aCount,
					"B: ", bCount,
					"C: ", cCount,
					"D: ", dCount,
					"F: ", fCount);
		} else {
			System.out.println("No grades were entered.");
		}
		
		// close scanner
		input.close();
	}
}