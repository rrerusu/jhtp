package org.erusu.jhtp.chapter4.exercisies.basic_cryptography;

import java.util.Scanner;
import java.lang.Math;

public class BasicDecrypter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numToDecrypt,
			digitHolder,
			decryptedNum = 0;
		
		System.out.print("Enter number to decrypt: ");
		numToDecrypt = input.nextInt();
		
		// step 1: swap first and third digits
		digitHolder = numToDecrypt / 1000;
		numToDecrypt = numToDecrypt - (digitHolder * 1000) +
				(((numToDecrypt % 100) / 10) * 1000);
		numToDecrypt = numToDecrypt - (((numToDecrypt % 100) / 10) * 10) + digitHolder * 10;
					
		// step 2: swap second and fourth digits
		digitHolder = (numToDecrypt % 1000) / 100;
		numToDecrypt = numToDecrypt - (digitHolder * 100) + ((numToDecrypt % 10) * 100);
		numToDecrypt = numToDecrypt - (numToDecrypt % 10) + digitHolder;
		
		// step 3: combine the reverse of step 1 and 2 of the encryption
		for(int digitCounter = 0; digitCounter < 4; digitCounter++) {
			decryptedNum += (((numToDecrypt / (int) (Math.pow(10, 3 - digitCounter)) + 3) % 10)
					* (int) Math.pow(10, 3 - digitCounter));
			numToDecrypt %= Math.pow(10, 3 - digitCounter);
		}
		
		System.out.println("Decrypted number: " + decryptedNum);
		
		input.close();
	}
}