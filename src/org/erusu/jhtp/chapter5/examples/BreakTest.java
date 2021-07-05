package org.erusu.jhtp.chapter5.examples;

public class BreakTest {
	public static void main(String[] args) {
		int count;
		
		for(count = 1; count <= 10; count++) {
			if(count == 5)
				continue;
			
			System.out.printf("%d ", count);
		}
		
		System.out.printf("\nUse continue to skip printing 5");
	}
}