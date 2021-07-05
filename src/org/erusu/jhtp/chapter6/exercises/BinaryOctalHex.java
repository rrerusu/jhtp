package org.erusu.jhtp.chapter6.exercises;

public class BinaryOctalHex {
	public static void main(String[] args) {
		System.out.printf("%3s%10s%4s%4s%n",
				"Dec", "Bin", "Oct", "Hex");
		
		for(int counter = 1; counter <= 256; counter++) {
			System.out.printf("%3d%10d%4d%4s%n", 
					counter,
					toBin(counter),
					toOct(counter),
					toHex(counter));
		}
	}
	
	public static int toBin(int num)  {
		int digit = 0,
			largest2Pow = 1;
		
		while(num >= largest2Pow * 2) {
			largest2Pow *= 2;
			digit++;
		}
		
		return (num <= 1) ? num :
			(int) Math.pow(10, digit) + toBin(num - largest2Pow);
	}
	
	public static int toOct(int num)  {
		int digit = 0,
			largest8Pow = 1;
		
		while(num >= largest8Pow * 8) {
			largest8Pow *= 8;
			digit++;
		}
		
		return (num <= 7) ? num :
			(int) Math.pow(10, digit) + toOct(num - largest8Pow);
	}
	
	public static String toHex(int num)  {
		String hex = "";
		
		int currVal;
		
		for(int counter = 0; counter <= 2; counter++) {
			currVal = num / (int) Math.pow(16, 2 - counter);
			hex += (currVal < 10) ? currVal : (char) (63 + currVal - 8) + "";
			num -= currVal * (int) Math.pow(16, 2 - counter);
		}
		
		return hex.replaceAll("^[0]+", "");
	}
}