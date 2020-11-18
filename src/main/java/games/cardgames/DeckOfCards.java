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

    public int handValue() {
        int totalValue = 0;
        int aceCount = 0;
        for (Card card : this.cards) {
            switch (card.getCardValue()) {
                case TWO:
                    totalValue += 2;
                    break;
                case THREE:
                    totalValue += 3;
                    break;
                case FOUR:
                    totalValue += 4;
                    break;
                case FIVE:
                    totalValue += 5;
                    break;
                case SIX:
                    totalValue += 6;
                    break;
                case SEVEN:
                    totalValue += 7;
                    break;
                case EIGHT:
                    totalValue += 8;
                    break;
                case NINE:
                    totalValue += 9;
                    break;
                case TEN:
                    totalValue += 10;
                    break;
                case JACK:
                    totalValue += 10;
                    break;
                case QUEEN:
                    totalValue += 10;
                    break;
                case KING:
                    totalValue += 10;
                    break;
                case ACE:
                    aceCount++;
                    break;
            }
        }
        for (int i = 0; i < aceCount; i++) {
            if (totalValue > 10) {
                totalValue += 1;
            } else {
                totalValue += 11;
            }

        }
        return totalValue;
    }
}
