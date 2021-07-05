package org.erusu.jhtp.chapter5.exercises;

public class DeMorgansLaws {
	public static void main(String[] args) {
		int x, y;
		System.out.println("x   y   !(x < 5) && !(y >= 7)   !((x < 5) || (y >= 7))");
		
		x = 3; y = 7;
		System.out.printf("%-4d%-4d%-24s%-22s%n", x, y, !(x < 5) && !(y >= 7), !((x < 5) || (y >= 7)));
		
		x = 3; y = 6;
		System.out.printf("%-4d%-4d%-24s%-22s%n", x, y, !(x < 5) && !(y >= 7), !((x < 5) || (y >= 7)));
		
		x = 6; y = 7;
		System.out.printf("%-4d%-4d%-24s%-22s%n", x, y, !(x < 5) && !(y >= 7), !((x < 5) || (y >= 7)));

		x = 6; y = 6;
		System.out.printf("%-4d%-4d%-24s%-22s%n%n", x, y, !(x < 5) && !(y >= 7), !((x < 5) || (y >= 7)));
		
		
		
		int a, b, g;
		System.out.println("a   b   g   !(a == b) || !(g != 5)   !((a == b) && (g != 5))");
		
		a = 5; b = 5; g = 4;
		System.out.printf("%-4d%-4d%-4d%-25s%-23s%n", a, b, g, !(a == b) || !(g != 5), !((a == b) && (g != 5)));
		
		a = 5; b = 5; g = 5;
		System.out.printf("%-4d%-4d%-4d%-25s%-23s%n", a, b, g, !(a == b) || !(g != 5), !((a == b) && (g != 5)));
		
		a = 5; b = 4; g = 4;
		System.out.printf("%-4d%-4d%-4d%-25s%-23s%n", a, b, g, !(a == b) || !(g != 5), !((a == b) && (g != 5)));
		
		a = 5; b = 4; g = 5;
		System.out.printf("%-4d%-4d%-4d%-25s%-23s%n%n", a, b, g, !(a == b) || !(g != 5), !((a == b) && (g != 5)));
		
		
		
		int x2, y2;
		System.out.println("x   y   !((x <= 8) && (y > 4))   !(x <= 8) || !(y > 4)");
		
		x2 = 8; y2 = 5;
		System.out.printf("%-4d%-4d%-25s%-22s%n", x2, y2, !((x2 <= 8) && (y2 > 4)), !(x2 <= 8) || !(y2 > 4));
		
		x2 = 8; y2 = 4;
		System.out.printf("%-4d%-4d%-25s%-22s%n", x2, y2, !((x2 <= 8) && (y2 > 4)), !(x2 <= 8) || !(y2 > 4));
		
		x2 = 9; y2 = 5;
		System.out.printf("%-4d%-4d%-25s%-22s%n", x2, y2, !((x2 <= 8) && (y2 > 4)), !(x2 <= 8) || !(y2 > 4));
		
		x2 = 9; y2 = 4;
		System.out.printf("%-4d%-4d%-25s%-22s%n%n", x2, y2, !((x2 <= 8) && (y2 > 4)), !(x2 <= 8) || !(y2 > 4));
		
		
		
		int i, j;
		System.out.println("i   j   !((i > 4) || (j <= 6))   !(i > 4) && !(j <= 6)");
		
		i = 5; j = 6;
		System.out.printf("%-4d%-4d%-25s%-22s%n", i, j, !((i > 4) || (j <= 6)), !(i > 4) && !(j <= 6));
		
		i = 5; j = 7;
		System.out.printf("%-4d%-4d%-25s%-22s%n", i, j, !((i > 4) || (j <= 6)), !(i > 4) && !(j <= 6));
		
		i = 4; j = 6;
		System.out.printf("%-4d%-4d%-25s%-22s%n", i, j, !((i > 4) || (j <= 6)), !(i > 4) && !(j <= 6));
		
		i = 4; j = 7;
		System.out.printf("%-4d%-4d%-25s%-22s", i, j, !((i > 4) || (j <= 6)), !(i > 4) && !(j <= 6));
	}
}
