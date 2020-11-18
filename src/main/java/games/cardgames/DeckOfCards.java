package games.cardgames;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class DeckOfCards {
//    Stack<Card> deck;


    private ArrayList<Card> cards;

    public DeckOfCards() {
        this.cards = new ArrayList<Card>();
    }
    public void createFullDeck() {
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
        //array list copy may be unnessecary, shuffle method should do this
        // ArrayList<Card> deckToBeShuffled = new ArrayList<Card>();
        Collections.shuffle(cards);
    }


    public void removeCard(int i){
        this.cards.remove(i);
    }

    public Card getCard(int i){
        return this.cards.get(i);
    }

    public void addCard(Card addCard){
        this.cards.add(addCard);
    }


    public void dealCard(DeckOfCards comingFrom) {
        this.cards.add(comingFrom.getCard(0));
        comingFrom.removeCard(0);
    }

    public void restart() {

    }



}
