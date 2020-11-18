package games.cardgames;


import menus.CardGameMenu;

import java.util.ArrayList;
import java.util.Collections;

public class CardGame {
    private ArrayList<Card> cards;

    public CardGame() {
        this.cards = new ArrayList<Card>();
    }
    public void createDeck() {
        for(CardSuits cardSuits: CardSuits.values()) {
            for(CardValues cardValues: CardValues.values()) {
                this.cards.add(new Card(cardSuits, cardValues));
            }
        }
    }
    public String toString() {
        String deckOfCardsOutput = "";
        int i = 0;
        for(Card card: this.cards) {
            deckOfCardsOutput += "\n" + i + "-" + card.toString();
            i++;
        }
        return deckOfCardsOutput;
    }

    public void shuffleDeck() {
        ArrayList<Card> deckToBeShuffled = new ArrayList<Card>();
        Collections.shuffle(deckToBeShuffled);
    }

    public void dealCards() {
    }

    public void restart() {

    }

    //TODO
    CardGameMenu cardGameMenu = new CardGameMenu();

}
