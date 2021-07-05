package org.erusu.jhtp.chapter7.exercises;

import java.util.Scanner;

public class AirlinesReservationSystem {
	
	private static boolean[] seats = new boolean[10];
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int choice = 0;
		
		String switchClassChoice = "";
		
		while(!(seats[4] && seats[9]) && !switchClassChoice.toLowerCase().equals("n")) {
			
			// Get class input
			while(!(choice == 1 || choice == 2)) {
				System.out.print("Please type 1 for First or 2 for Economy: ");
				choice = input.nextInt();
			}

			// Ask if flyer wants to switch class
			if((detNextSeat(choice) + 1) % 5 == 0) {
				System.out.print(((choice == 1) ? "First" : "Economy") + 
						"class filled, would to like to be seated in " +
						(!(choice == 1) ? "First" : "Economy") + 
						" class? (y for yes, n for no): ");
				switchClassChoice = input.next();
				
				// switch class
				if(!switchClassChoice.toLowerCase().equals("n"))
					choice = (choice == 1) ? 2 : 1;
			}
			
			// Print ticket
			if(!switchClassChoice.toLowerCase().equals("n")) {
				updateSeat(choice);
				printTicket(choice, detNextSeat(choice) - 1);
			}
			
			choice = 0;
		}
		
		System.out.println("Next flight leaves in 3 hours.");
		
		input.close();
	}
	
	public static void printTicket(int seatClass, int seatIndex) {
		System.out.printf("%nClass: %s	Seat: %d%n%n", 
				(seatClass == 1) ? "First" : "Economy", seatIndex + 1);
	}
	
	// determine the next seat available, if there is one
	public static int detNextSeat(int seatClass) {
		int counter = 0;
		try {
			for(;counter < 5; counter++) {
				if(!seats[(counter + 1) + 5 * (seatClass - 1)])
					return counter;
				
			}
		} catch(ArrayIndexOutOfBoundsException outboundIndex) {
			
		}
		
		return counter;
		
	}
	
	// u[date current seat
	public static void updateSeat(int seatClass) {
		int seatIndex = 0;
		
		while(seatIndex < 5 && seats[seatIndex + 5 * (seatClass - 1)]) {
			seatIndex++;
		}
		
		seats[seatIndex + 5 * (seatClass - 1)] = true;
	}
}