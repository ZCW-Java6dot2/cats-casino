package games.cardgames;

import java.util.ArrayList;
import java.util.Collections;

public class DeckOfCards {
//    Stack<Card> deck;


    private ArrayList<Card> deck;

    public DeckOfCards() {
        this.deck = new ArrayList<Card>();
    }

    public void createFullDeck() {
        for(CardSuits cardSuits: CardSuits.values()) {
            for(CardValues cardValues: CardValues.values()) {
                this.deck.add(new Card(cardSuits, cardValues));
            }
        }
    }
    public String toString() {
        String deckOfCardsOutput = "";
        int i = 0;
        for(Card card: this.deck) {
            deckOfCardsOutput += "\n" + i + "-" + card.toString();
            i++;
        }
        return deckOfCardsOutput;
    }

    public void shuffleDeck() {
        //array list copy may be unnessecary, shuffle method should do this
        // ArrayList<Card> deckToBeShuffled = new ArrayList<Card>();
        Collections.shuffle(deck);
    }


    public void removeCard(int i){
        this.deck.remove(i);
    }

    public Card getCard(int i){
        return this.deck.get(i);
    }

    public void addCard(Card addCard){
        this.deck.add(addCard);
    }


    public void dealCard(DeckOfCards comingFrom) {
        this.deck.add(comingFrom.getCard(0));
        comingFrom.removeCard(0);
    }

    public void restart() {

    }


}
