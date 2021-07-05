package org.erusu.jhtp.chapter4.exercisies;

import java.util.Scanner;

public class GasMileage {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int totalMiles = 0, totalGallons = 0,
			miles, gallons, 
			journeyCount = 1;
		
		while(true) {
			System.out.print("Enter miles driven in journey " + journeyCount + "(-1 to exit): ");
			miles = input.nextInt();
			if(miles == -1)
				break;
			
			System.out.print("Enter gallons used in journey " + journeyCount + "(-1 to exit): ");
			gallons = input.nextInt();
			if(gallons == -1)
				break;
			
			totalMiles += miles;
			totalGallons += gallons;
			
			System.out.println("mpg for journey " + journeyCount + " = " + (miles * 1.0) /gallons +
							   "\ntotal mpg: " + (totalMiles * 1.0) / gallons);
		}
		
		System.out.println("Total mpg: " + (totalMiles * 1.0) / totalGallons);
		input.close();
		
	}

}