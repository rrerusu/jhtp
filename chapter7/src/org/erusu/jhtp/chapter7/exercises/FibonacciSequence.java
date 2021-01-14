package org.erusu.jhtp.chapter7.exercises;

public class FibonacciSequence {
	public static void main(String[] args) {
		int term = 2;
		
		while(term < 49) {
			System.out.printf("%d: %d%n", term - 1, fibonacci(term));
			term++;
		}
	}
	
	// calculate the nth term of the fibonacci sequence
	public static int fibonacci(int n) {
		int[] seq = new int[n];
		
		seq[0] = 0;
		seq[1] = 1;
		
		for(int indx = 2; indx < seq.length; indx++) {
			seq[indx] = seq[indx - 1] + seq[indx - 2];
		}
		
		return seq[n - 1];
	}
}