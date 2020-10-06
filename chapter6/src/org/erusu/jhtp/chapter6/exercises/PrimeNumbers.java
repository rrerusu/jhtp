package org.erusu.jhtp.chapter6.exercises;

public class PrimeNumbers {
	public static void main(String[] args) {
		for(int counter = 1; counter < 10000; counter++) {
			if(isPrime(counter))
				System.out.println(counter);
		}
	}
	
	public static boolean isPrime(int num) {
		if(num < 4)
			return num > 1;
			
		
		for(int counter = 2; counter <= Math.sqrt(num); counter++) {
			if(isPrime(counter)) {
				if(num % counter == 0)
					return false;
			}
		}
		
		return true;
	}
}
