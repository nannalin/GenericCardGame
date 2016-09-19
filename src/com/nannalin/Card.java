package com.nannalin;

public class Card {
	/**
	 * There are 4 suits.
	 */
	public static enum Suit {
	    HEARTS, DIAMONDS, CLUBS, SPADES
	}
   
   	// Face cards in addition to the numeric cards (2 through 10).
   	public static final int ACE = 1;    
   	public static final int JACK = 11;    
   	public static final int QUEEN = 12;   
   	public static final int KING = 13;

   	/** 
   	 * The constants card's suit that cannot be changed 
   	 * after the card is constructed.
   	 */
   	private final Suit suit;

   	/**
   	 * Normal cards 1 through 13.
   	 * The value cannot be changed after the card is constructed.
   	 */
   	private final int value;

   	/**
     * @param value can be 1 through 13
     * @param suit can be SPADES, HEARTS, DIAMONDS, or CLUBS
   	 * @throws IllegalArgumentException If the card's value in't in the
     * permissible range of 1 through 13 or the card's suit isn't one of  
     * HEARTS, DIAMONDS, CLUBS, SPADES
     */
   	public Card(int value, Suit suit) {
   	   this.value = value;
   	   this.suit = suit;
   	}

   	/**
   	 * Retrieves the card's suit.
   	 * @return the suit of the card.
   	 */
   	public Suit getSuit() {
   	    return suit;
   	}

   	/** 
   	 * Retrieves the card'value.
   	 * @return the value of the card
   	 */
   	public int getValue() {
   	    return value;
   	}

   	/**
   	 * Create the string of the value and suit of the card.
   	 * ex. "4 of Clubs", "Ace of Diamonds"  	 
   	 * @return suit and value of the card in the string format
   	 */
   	public String toString() {
   		// TODO
   		return super.toString();
   	}
}
