package org.erusu.jhtp.chapter7.exercises.card_shuffling_and_dealing;

// 7.11
public class DeckOfCardsTest {
	public static void main(String[] args) {
		DeckOfCards myDeck = new DeckOfCards();
		myDeck.shuffle();
		
//		// Display shuffled cards
//		
//		for(int i = 1; i <= 52; i++) {
//			System.out.printf("%-19s", myDeck.dealCard());
//			
//			if(i % 4 == 0)
//				System.out.println();
//		}
		
		// Deal hand of 5 cards
		Card[] pokerHand = myDeck.dealHand(5);
	}
}
