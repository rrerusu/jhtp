package org.erusu.jhtp.chapter7.exercises.card_shuffling_and_dealing;

import java.util.Random;

// 7.10
public class DeckOfCards {
	private Card[] deck;
	private int currentCard;
	private static final int NUMBER_OF_CARDS = 52;
	
	private static final Random randomGen = new Random();
	
	public DeckOfCards() {
		String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven",
				"Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
		
		deck = new Card[NUMBER_OF_CARDS];
		currentCard = 0;
		
		for(int counter = 0; counter < deck.length; counter++) {
			deck[counter] = new Card(faces[counter % 13], suits[counter / 13]);
		}
	}
	
	public void shuffle() {
		currentCard = 0;
		
		for(int cardToSwitch = 0; cardToSwitch < deck.length; cardToSwitch++) {
			int cardBeingSwitched = randomGen.nextInt(NUMBER_OF_CARDS);
			
			Card temp = deck[cardToSwitch];
			deck[cardToSwitch] = deck[cardBeingSwitched];
			deck[cardBeingSwitched] = temp;
		}
	}
	
	public Card dealCard() {
		if(currentCard < deck.length)
			return deck[currentCard++];
		else
			return null;
	}
	
	public Card[] dealHand(int size) {
		// Deal hand of 5 cards
		Card[] myHand = new Card[size];
				
		for(int cardCount = 0; cardCount < size; cardCount++) {
			myHand[cardCount] = dealCard();
		}
		
		return myHand;
	}
	
}