package org.erusu.jhtp.chapter3.examples;

import javax.swing.JOptionPane;

public class Dialog1 {

	public static void main(String[] args) {
		// Declare String variables name and message
		String name, message;
		
		// Get user input using JOptionPane for name
		name = JOptionPane.showInputDialog("What is your name?");
		
		// create message
		message = String.format("Welcome, %s, to Java Programming!", name);
		
		// display message
		JOptionPane.showMessageDialog(null, message);

	}

}
