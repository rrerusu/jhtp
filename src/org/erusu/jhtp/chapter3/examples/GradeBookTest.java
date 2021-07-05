package org.erusu.jhtp.chapter3.examples;
// import java.util.Scanner;

public class GradeBookTest {

	public static void main(String[] args) {
		
		// Create GradeBook objects
		GradeBook gradeBook1 = new GradeBook("CS101 Introduction to Java Programming", "John");
		GradeBook gradeBook2 = new GradeBook("CS102 Data Structures in Java", "Paul");
		
		// display initial values
		System.out.printf("gradeBook1 course name is: %s%n", gradeBook1.getCourseName());
		System.out.printf("gradeBook2 course name is: %s%n", gradeBook2.getCourseName());
		
		/*
		// Instantiate objects
		GradeBook myGradeBook = new GradeBook();
		Scanner input = new Scanner(System.in);
		
		// Declare nameOfCourse variable
		String nameOfCourse;
		
		// Display initial course name
		System.out.printf("Initial course name is:  %s\n\n", myGradeBook.getCourseName());
		
		// get user input for course name
		System.out.println("Enter course name: ");
		nameOfCourse = input.nextLine();
		myGradeBook.setCourseName(nameOfCourse);
		System.out.println();
		
		// call myGradeBook's displayMessage() method
		myGradeBook.displayMessage();
		
		// close scanner
		input.close();
		*/

	}

}
