package org.erusu.jhtp.chapter5.exercises;

public class TwelveDaysOfChristmas {
	public static void main(String[] args) {
		String pronoun = "", lyrics = "";
		for(int day = 0; day < 12; day++) {
			switch(day + 1) {
				case 12:
					pronoun = "twelfth";
					lyrics = "Twelve drummers drumming,\n" + lyrics;
					break;
				case 11:
					pronoun = "eleventh";
					lyrics = "Eleven pipers piping,\n" + lyrics;
					break;
				case 10:
					pronoun = "tenth";
					lyrics = "Ten lords a leaping,\n" + lyrics;
					break;
				case 9:
					pronoun = "ninth";
					lyrics = "Nine ladies dancing,\n" + lyrics;
					break;
				case 8:
					pronoun = "eight";
					lyrics = "Eight maids a milking,\n" + lyrics;
					break;
				case 7:
					pronoun = "seventh";
					lyrics = "Seven swans a swimming,\n" + lyrics;
					break;
				case 6:
					pronoun = "sixth";
					lyrics = "Six geese a laying,\n" + lyrics;
					break;
				case 5:
					pronoun = "fifth";
					lyrics = "Five gold rings,\n" + lyrics;
					break;
				case 4:
					pronoun = "fourth";
					lyrics = "Four calling birds,\n" + lyrics;
					break;
				case 3:
					pronoun = "third";
					lyrics = "Three French hens,\n" + lyrics;
					break;
				case 2:
					pronoun = "second";
					lyrics = "Two turtle doves and\n" + lyrics;
					break;
				case 1:
					pronoun = "first";
					lyrics = "A partridge in a pear tree." + lyrics;
					break;
			}
			
			System.out.printf("On the %s day of Christmas my true love gave to me:%n%s%n%n", pronoun, lyrics);
		}
	}
}
