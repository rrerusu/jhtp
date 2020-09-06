package org.erusu.jhtp.chapter4.exercisies;

public class TabularOutput {
	public static void main(String[] args) {
		
		System.out.println("N       10*N     100*N    1000*N\n");
		
		for(int counter = 0; counter < 5; counter++) {
			System.out.printf("%-8d%-9d%-9d%d%n", counter + 1, 
					(counter + 1) * 10, (counter + 1) * 100, (counter + 1) * 1000);
		}
	}
}