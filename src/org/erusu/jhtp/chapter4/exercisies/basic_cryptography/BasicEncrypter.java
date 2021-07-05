/*
 * 	Encrypt a 4 digit number.
 * 	Step 1: add 7 to each digit: 5790 --> 12 14 16 7
 * 	Step 2: use remainder of each digit / 10: 12 14 16 7 --> 2467
 * 	Step 3: swap first and third digits: 2467 --> 6427
 * 	Step 4: swap second and fourth digits: 6427 --> 6724
 */


package org.erusu.jhtp.chapter4.exercisies.basic_cryptography;

import java.util.Scanner;
import java.lang.Math;

public class BasicEncrypter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numToEncrypt,
			digitHolder,
			encryptedNum = 0;
		
		System.out.print("Enter 4 digit number: ");
		numToEncrypt = input.nextInt();
		
		// combine step 1 and 2 to keep number at 4 digits
		for(int digitCounter = 0; digitCounter < 4; digitCounter++) {
			encryptedNum += (((numToEncrypt / (int) (Math.pow(10, 3 - digitCounter)) + 7) % 10)
					* (int) Math.pow(10, 3 - digitCounter));
			numToEncrypt %= Math.pow(10, 3 - digitCounter);
		}
		
		// step 3: swap first and third digits
		digitHolder = encryptedNum / 1000;
		encryptedNum = encryptedNum - (digitHolder * 1000) +
				(((encryptedNum % 100) / 10) * 1000);
		encryptedNum = encryptedNum - (((encryptedNum % 100) / 10) * 10) + digitHolder * 10;
		
		// step 4: swap second and fourth digits
		digitHolder = (encryptedNum % 1000) / 100;
		encryptedNum = encryptedNum - (digitHolder * 100) + ((encryptedNum % 10) * 100);
		encryptedNum = encryptedNum - (encryptedNum % 10) + digitHolder;
		
		System.out.println("Encrypted number: " + encryptedNum);
		
		input.close();
	}
}