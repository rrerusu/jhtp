package org.erusu.jhtp.chapter5.exercises;

public class Interest {
	public static void main(String[] args) {
		int amount,
			principal = 100000,
			rate = 5;
		
		System.out.printf("%s%20s%20s%20s%20s%20s%20s\n", "Year", "5% Interest",
				"6% interest", "7% interest", "8% interest", "9% interest",
				"10% interest");
		
		for(int year = 1; year <= 10; year++) {
			
			System.out.printf("%4d", year);
			
			for(int interestCounter = 0; interestCounter < 6; interestCounter++) {
				amount = (int) (principal * Math.pow(1 + ((double)rate / 100) + ((double)interestCounter / 100), year));
				
				System.out.printf("%,18d.%2d", (amount / 100), amount % 100);
			}
			System.out.println();
		}
	}
}