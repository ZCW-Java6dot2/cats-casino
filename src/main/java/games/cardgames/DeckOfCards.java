package games.cardgames;

import java.util.Collections;
import java.util.Stack;

public class DeckOfCards {
    Stack<Card> deck;


    public DeckOfCards() {
        this.deck = new Stack<Card>();
    }

    public void createDeck() {
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 13; j++) {
                if (i == 0) {
                    Card card = new Card("♥", j);  //hearts
                    deck.push(card);
                } else if (i == 1) {
                    Card card = new Card("♠", j);  //spades
                    deck.push(card);
                } else if (i == 2) {
                    Card card = new Card("♦", j);  //diamonds
                    deck.push(card);
                } else if (i == 3) {
                    Card card = new Card("♣", j);  //clubs
                    deck.push(card);
                }
            }
        }
    }

    public Stack<Card> getStack() {
        return deck;
    }

    public void shuffleDeck() {
        Collections.shuffle(deck);
    }

    public void removeCard(int i) {
        this.deck.remove(i);
    }

    public Card getCard() {
        return deck.pop();
    }

    public boolean isEmpty(){
        return deck.isEmpty();
    }

    public Card peekStack(){
        return deck.peek();
    }

    public int deckSize() {
        return this.deck.size();
    }

}
