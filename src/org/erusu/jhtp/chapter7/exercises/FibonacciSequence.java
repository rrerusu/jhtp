package org.erusu.jhtp.chapter7.exercises;

public class FibonacciSequence {
	public static void main(String[] args) {
		int term = 1;
		
		while(term < 1479) {
			System.out.printf("%d: %.0f%n", term, fibonacci(term));
			term++;
		}
	}
	
	// calculate the nth term of the fibonacci sequence
	public static double fibonacci(int n) {
		double[] seq = new double[n];
		
		if(n == 1)
			return 0;
		else if(n == 2)
			return 1;
		else {
			seq[0] = 0;
			seq[1] = 1;
			
			for(int indx = 2; indx < seq.length; indx++) {
				seq[indx] = seq[indx - 1] + seq[indx - 2];
			}
			
			return seq[n - 1];
		}
	}
}