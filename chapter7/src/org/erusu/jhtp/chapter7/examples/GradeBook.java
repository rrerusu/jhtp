package org.erusu.jhtp.chapter7.examples;

public class GradeBook {
	
	private String courseName;
	
	// 5.6 addition
	private int[] grades;
	
	// Constructor that accepts course name
	public GradeBook(String name, int[] gradesArray) {
		courseName = name;
		grades = gradesArray;
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
	
	public void processGrades() {
		outputGrades();
		
		System.out.printf("%nClass average is %.2f%n", getAverage());
		
		System.out.printf("Lowest grade is %d%nHighest grade is %d%n%n", getMinimum(), getMaximum());
		
		outputBarChart();
	}
	
	public int getMinimum() {
		int lowestGrade = grades[0];
		
		for(int grade : grades) {
			if(grade < lowestGrade)
				lowestGrade = grade;
		}
		
		return lowestGrade;
	}
	
	public int getMaximum() {
		int highestGrade = grades[0];
		
		for(int grade : grades) {
			if(grade > highestGrade)
				highestGrade = grade;
		}
		
		return highestGrade;
	}
	
	public double getAverage() {
		int total = 0;
		
		for(int grade : grades)
			total += grade;
		
		return (double) total / grades.length;
	}
	
	public void outputBarChart() {
		System.out.println("Grade distribution:");
		
		int[] frequency = new int[11];
		
		for(int grade : grades)
			++frequency[grade / 10];
		
		for(int counter = 0; counter < frequency.length; counter++) {
			if(counter == 10)
				System.out.printf("%5d: ", 100);
			else
				System.out.printf("%02d-%02d: ", counter * 10, counter * 10 + 9);
			
			for(int stars = 0; stars < frequency[counter]; stars++)
				System.out.print("*");
			
			System.out.println();
		}
	}
	
	public void outputGrades() {
		for(int student = 0; student < grades.length; student++)
			System.out.printf("Student %2d: %3d%n", student + 1, grades[student]);
	}
}