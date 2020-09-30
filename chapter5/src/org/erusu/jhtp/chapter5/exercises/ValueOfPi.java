package org.erusu.jhtp.chapter5.exercises;

public class ValueOfPi {
	public static void main(String[] args) {
		double pi = 0;
		int firstTime = 0;
		
		System.out.printf("%-7s%s%n", "n", "nth term");
		
		for(int counter = 0; counter < 200000; counter++) {
			pi += (4.0 / (counter * 2 + 1) * ((counter % 2 == 0) ? 1 : -1));
			System.out.printf("%-7d%f%n", counter, pi);
			
			if(firstTime == 0 && String.format("%.5f", pi).equals("3.14159"))
				firstTime = counter;
		}
		System.out.println("\nFirst time pi = 3.14159: " + firstTime);
		
	}
}