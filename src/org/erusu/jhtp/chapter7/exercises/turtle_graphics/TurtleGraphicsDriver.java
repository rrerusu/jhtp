package org.erusu.jhtp.chapter7.exercises.turtle_graphics;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class TurtleGraphicsDriver {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		List<String> code = new ArrayList<>();
		
		String command = "";
		
		TurtleGrid myGrid = new TurtleGrid(20);
		
		// get user inputs
		do {
			System.out.print("Enter turtle command: ");
			command = input.nextLine();
			
			if(! command.equals("9"))
				code.add(command);
			
		} while(! command.equals("9"));
		
		myGrid.handleCode(code.toArray(new String[0]));
		
		input.close();
	}
}