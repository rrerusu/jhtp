package org.erusu.jhtp.chapter5.exercises;

import java.lang.Math;

public class PythagoreanTriples {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		int hyp,
			maxVal = 100000;
		
		for(int leg1Counter = 1; leg1Counter < maxVal; leg1Counter++) {
			for(int leg2Counter = leg1Counter; leg2Counter < maxVal - leg1Counter; leg2Counter++) {
				hyp = (int)Math.sqrt(Math.pow(leg1Counter, 2) + Math.pow(leg2Counter, 2));
				if(hyp == Math.sqrt(Math.pow(leg1Counter, 2) + Math.pow(leg2Counter, 2)))
					System.out.println(leg1Counter + ", " + leg2Counter + ", " + hyp);
			}
		}
		
		System.out.println("Elapsed Time: " + (System.currentTimeMillis() - start));
	}
}
