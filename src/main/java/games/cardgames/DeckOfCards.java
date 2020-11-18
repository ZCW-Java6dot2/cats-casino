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

    public int handValue() {
        int totalValue = 0;
        int aceCount = 0;
        for (Card card : this.deck) {
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

    public int deckSize(){
        return this.deck.size();
    }


}
