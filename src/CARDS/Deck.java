package CARDS;

import java.util.List;

public class Deck {

    private List<Card> cards;

    public void initializeDeck() {
        // Add 0-9, two of each number except 0, plus special cards
    }

    public Card drawCard() {
        return cards.remove(0);
    }

}
