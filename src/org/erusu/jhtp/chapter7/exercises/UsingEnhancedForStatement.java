package org.erusu.jhtp.chapter7.exercises;

public class UsingEnhancedForStatement {
	public static void main(String[] args) {
		double sum = 0;
		for(String num : args)
			sum += Double.parseDouble(num);
		
		System.out.println(sum);
	}
}