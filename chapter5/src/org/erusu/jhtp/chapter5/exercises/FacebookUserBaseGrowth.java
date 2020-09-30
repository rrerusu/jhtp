package org.erusu.jhtp.chapter5.exercises;

public class FacebookUserBaseGrowth {
	public static void main(String[] args) {
		int userBase = 500000000,
				months = 0;
		
		while(userBase < 1000000000) {
			userBase *= 1.05;
			months++;
		}
		
		System.out.println("Months from July 2010 that Facebook will have 1 Billion Users: " + months);
		
		while(userBase < 2000000000) {
			userBase *= 1.05;
			months++;
		}
		
		System.out.println("Months from July 2010 that Facebook will have 2 Billion Users: " + months);
	}
}
