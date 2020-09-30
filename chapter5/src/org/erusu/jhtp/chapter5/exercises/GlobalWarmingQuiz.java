package org.erusu.jhtp.chapter5.exercises;

import java.util.Scanner;

public class GlobalWarmingQuiz {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String answer;
		
		int points = 0;
		
		System.out.println("Question 1: What is Global Warming?\n");
		
		System.out.println("A. The increase of Earth's average surface " + 
				"temperature due to greenhouse gases that collect in the " +
				"atmosphere like a thickening blanket, trapping the sun's " +
				"heat and causing the planet to warm up");
		System.out.println("B. The increase of Earth's temperature due to " +
				"the earth getting closer to the sun");
		System.out.println("C. The increase of Earth's temperature so fast " +
				"that we are all going to die and nothing can be done to " + 
				"stop it");
		System.out.println("D. Fake: we are not doing anything wrong");
		
		System.out.print("\nAnswer: ");
		answer = input.next();
		
		if(answer.toLowerCase().equals("a"))
			points++;
		
		System.out.println("Question 2: How high has the sea level risen since 1870 " +
				"due to global warming?\n");
		
		System.out.println("A. 17 feet");
		System.out.println("B. 2 inches");
		System.out.println("C. -15 feet");
		System.out.println("D. 0 inches");
		
		System.out.print("\nAnswer: ");
		answer = input.next();
		
		if(answer.toLowerCase().equals("b"))
			points++;
		
		System.out.println("Question 3: How high has the temperature risen since 1870 " +
				"due to global warming?\n");
		
		System.out.println("A. 15 Degrees Celcius");
		System.out.println("B. 200 Degrees Kelvin");
		System.out.println("C. -4 Degrees Celcius");
		System.out.println("D. 2 Degrees Celcius");
		
		System.out.print("\nAnswer: ");
		answer = input.next();
		
		if(answer.toLowerCase().equals("d"))
			points++;
		
		System.out.println("Question 4: What act gives the EPA(Environmental Protection Agency) " +
				"the right to reduce pollution from power plants?\n");
		
		System.out.println("A. Global Warming Solutions Act of 2006");
		System.out.println("B. 2003 Climate Stewardship Act");
		System.out.println("C. 2007 Climate Stewardship Act and Innovation Act");
		System.out.println("D. Clean Air Act of 1963");
		
		System.out.print("\nAnswer: ");
		answer = input.next();
		
		if(answer.toLowerCase().equals("d"))
			points++;
		
		System.out.println("Question 5: What fuels are causing global warming?\n");
		
		System.out.println("A. Natural Oil, Gasoline, Coal");
		System.out.println("B. Electricity, Natural Oil, Gasoline");
		System.out.println("C. Wind, Coal, Water");
		System.out.println("D. Wind, Solar Rays, Natural Oil");
		
		System.out.print("\nAnswer: ");
		answer = input.next();
		
		if(answer.toLowerCase().equals("a"))
			points++;
		
		// return score
		System.out.println("\nAnswers correct: " + points + "/5");
		
		if(points == 5)
			System.out.println("Excellent!");
		else if(points == 4)
			System.out.println("Very good!");
		else
			System.out.println("Time to brush up on your knowledge of global warming\n" +
					"A site you can use: https://www.dosomething.org/us/facts/11-facts-about-global-warming");
		
		input.close();
	}
}
