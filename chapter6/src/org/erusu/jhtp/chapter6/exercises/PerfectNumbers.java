package org.erusu.jhtp.chapter6.exercises;

public class PerfectNumbers {
	public static void main(String[] args) {
		for(int counter = 0; counter < 1000; counter++) {
			if(isPerfect(counter))
				System.out.println(counter);
		}
	}
	
	public static boolean isPerfect(int num) {
		int counter = 1;
		
		while(num > 0) {
			num -= counter++;
		}
		
		return num == 0;
	}
}
