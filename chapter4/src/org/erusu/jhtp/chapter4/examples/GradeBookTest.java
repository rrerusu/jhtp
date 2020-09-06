package org.erusu.jhtp.chapter4.examples;
// import java.util.Scanner;

public class GradeBookTest {

	public static void main(String[] args) {
		// Instantiate GradeBook class
		GradeBook myGradeBook = new GradeBook("CS101 Introduction to Java Programming");
		
		// Print display message
		myGradeBook.displayMessage();
		
		// Determine class average
		myGradeBook.determineClassAverage();

	}

}