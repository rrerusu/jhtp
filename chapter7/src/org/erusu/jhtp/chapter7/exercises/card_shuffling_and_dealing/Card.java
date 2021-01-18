package org.erusu.jhtp.chapter7.exercises.card_shuffling_and_dealing;

// 7.9

public class Card {
	private String face;
	private String suit;
	
	public Card(String cardFace, String cardSuit) {
		face = cardFace;
		suit = cardSuit;
	}
	
	public String toString() {
		return face + " of " + suit;
	}
}