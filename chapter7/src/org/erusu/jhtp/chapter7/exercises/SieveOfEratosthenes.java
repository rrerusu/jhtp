package org.erusu.jhtp.chapter7.exercises;

public class SieveOfEratosthenes {
	public static void main(String[] args) {
		boolean[] arr = new boolean[1000];
		
		// set all values to 2
		for(int indx = 0; indx < arr.length; indx++)
			arr[indx] = true;
		
		// loop through and find all values that are true
		// multiply that index by 1-# as long as it is less than 1000 and set those numbers to false
		for(int indx = 2; indx < arr.length; indx++) {
			if(arr[indx]) {
				int multiple = 2;
				while (multiple * indx < 1000) {
					arr[multiple * indx] = false;
					multiple++;
				}
			}
		}
		
		for(int indx = 0; indx < arr.length; indx++) {
			if(arr[indx])
				System.out.println(indx);
		}
	}
}