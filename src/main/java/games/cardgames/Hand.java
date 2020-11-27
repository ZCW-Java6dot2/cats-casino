package games.cardgames;

import java.util.ArrayList;

public class Hand {
    ArrayList<Card> hand;

    public Hand() {
        this.hand = new ArrayList<Card>();
    }

    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void addCard(Card card){
        hand.add(card);
    }

    public void removeCard(Card card){
        hand.remove(card);
    }


    public boolean contains(Card card){
        return hand.contains(card);
    }

    public int getHandSize(){
        return hand.size();
    }

    public void clearHand(){
        hand.clear();
    }
}
