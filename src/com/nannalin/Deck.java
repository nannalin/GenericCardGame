package com.nannalin;

public interface Deck {
	/**
	 * Retrieves the number of cards in the deck.
	 * @return the number of cards left in the deck after dealing.
	 */
    int getSize();

    /**
     * Specifies if the deck is empty or not
     * @return true if the deck is empty, otherwise false.
     */
    boolean isEmpty();

	/** 
	 * Deals a card from the top of the deck.
	 * @return card that is on the top of the deck.
	 * @throws IllegaStateException If there is no card left in the deck.
	 */
	Card drawFromTop();

	/**
	 * Randomizes the cards in the deck.
	 */
    void shuffle();

    /**
     * Reset the deck in a complete and unshuffled state.
     */
    void reset();
}
