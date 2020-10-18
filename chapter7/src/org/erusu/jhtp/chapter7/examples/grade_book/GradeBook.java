package org.erusu.jhtp.chapter7.examples.grade_book;

public class GradeBook {
	
	private String courseName;
	private int[][] grades;
	
	// Constructor that accepts course name
	public GradeBook(String name, int[][] gradesArray) {
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
		
		System.out.printf("%n%s %d%n%s %d%n%n", "Lowest grade in the grade book is", getMinimum(),
				"Highest grade in the grade book is", getMaximum());
		
		outputBarChart();
	}
	
	public int getMinimum() {
		int lowestGrade = grades[0][0];
		
		for(int[] studentGrades : grades) {
			for(int grade : studentGrades) {
				if(grade < lowestGrade)
					lowestGrade = grade;
			}
		}
		
		return lowestGrade;
	}
	
	public int getMaximum() {
		int highestGrade = grades[0][0];
		
		for(int[] studentGrades : grades) {
			for(int grade : studentGrades) {
				if(grade > highestGrade)
					highestGrade = grade;
			}
		}
		
		return highestGrade;
	}
	
	public double getAverage(int[] setOfGrades) {
		int total = 0;
		
		for(int grade : setOfGrades)
			total += grade;
		
		return (double) total / setOfGrades.length;
	}
	
	public void outputBarChart() {
		System.out.println("Grade distribution:");
		
		int[] frequency = new int[11];
		
		for(int[] studentGrades : grades) {
			for(int grade : studentGrades)
				++frequency[grade / 10];
			
		}
		
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
		System.out.println("The grades are:\n");
		System.out.println("		");
		
		for(int test = 0; test < grades[0].length; test++)
			System.out.printf("Test %-5d", test + 1);
		
		System.out.println("Average");
		
		for(int student = 0; student < grades.length; student++) {
			System.out.printf("Student %2d", student + 1);
			
			for(int test : grades[student])
				System.out.printf("%8d", test);
			
			double average = getAverage(grades[student]);
			System.out.printf("%9.2f%n", average);
		}
	}
}