package com.nannalin;

import java.util.List;

public interface Hand {
	/**
	 * Adds a card to the hand.
	 * @param card The card to add to the hand.
	 */
	void addCard(Card card);

	/**
	 * Removes the specified card in the hand.
	 * @param card The card to remove from the hand.
	 * @throws IllegalStateException If the card doesn't exist.
	 */
	void removeCard(Card card);

	/**
	 * Retrieves the number of cards in the hand.
	 * @return the number of cards left in the hand.	 
	 */
	int getSize();

    /**
     * Specifies if the hand is empty or not   
     * @return true if the hand is empty, otherwise false.
     */
	boolean isEmpty();

	/**
	 * Retrieves all cards in the hand.
	 * @return the list of all cards in the hand.
	 */
	List<Card> getAllCards();

	/**
	 * Retrieves all cards that match the specified suit.
	 * @param suit The suit of the card. 
	 * @return the list of all cards that match the specified suit in the hand.
	 */
	List<Card> getCards(Card.Suit suit);

	/**
	 * Sorts the cards in ascending or descending order.
	 * @param inAscendingOrder The order to use, true for ascending, false for descending.
	 */
	void sortCards(boolean inAscendingOrder);

	/**
	 * Empties the hand by removing all cards from the hand.
	 */
	void reset();
}
