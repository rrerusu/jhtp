package org.erusu.jhtp.chapter3.examples;

public class GradeBook {
	
	private String courseName;
	private String instructorName;		// 3.11 addition
	
	// Constructor that accepts course name
	// 3.11 modification: include instructorName in constructor
	public GradeBook(String name, String teacherName) {
		courseName = name;
		instructorName = teacherName;
	}
	
	// 3.11 addition: set method for instructor Name
	public void setInstructorName(String name) {
		instructorName = name;
	}
	
	// 3.11 addition: get method for instructor Name
	public String getInstructorName() {
		return instructorName;
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
		System.out.printf("This course is  presented by: %s%n", instructorName);

	}

}
