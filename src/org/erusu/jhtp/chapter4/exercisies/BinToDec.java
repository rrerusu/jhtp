package org.erusu.jhtp.chapter4.exercisies;

import java.util.Scanner;
import java.lang.Math;

public class BinToDec {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int binNum = 0, currentNum, decNum = 0, twoBitDigitCntr = 0;
		
		System.out.print("Enter binary number: ");
		binNum = input.nextInt();
		currentNum = binNum;
		
		while(currentNum != 0) {
			decNum += (currentNum % 10) * Math.pow(2, twoBitDigitCntr++);
			currentNum /= 10;
		}
		
		System.out.println(binNum + " as decimal is " + decNum + ".");
		
		input.close();
	}
}