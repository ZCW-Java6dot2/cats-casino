package player;

import games.cardgames.Card;
import games.cardgames.Hand;
import interfaces.Gambler;

import java.util.ArrayList;

public class BlackjackPlayer implements Gambler {
    Player player;
    Hand splitHand;
    private Card card;
    private Hand hand = new Hand();


    private boolean hasStood;

    public BlackjackPlayer(Player player) {
        this.player = player;
    }


    public boolean bet() {
        return false;
    }

    public Integer placeBet() {
        return null;
    }

    public Integer getWinnings() {
        return null;
    }

    public boolean addFunds() {
        return false;
    }

    public void hit(Card card) {
        hand.addCard(card);
    }

    public ArrayList<Card> getHand() {
        return hand.getHand();
    }

    public int getScore() {
        int aceCounter = 0;
        int score = 0;

        for (int i = 0; i < hand.getHandSize(); i++) {
            boolean isCardAce = getHand().get(i).getValue() == 1;
            if (isCardAce == true) {
                aceCounter += 1;
                int valueOfCurrentCard = getHand().get(i).getValue();
                score += valueOfCurrentCard;
            }
            if (aceCounter > 0 && score < 10) {
                score += 10;
            }
        }
        return score;
    }

    public boolean checkBlackjack() {
        if (getScore() == 21 && hand.getHandSize() == 2) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString(){
        String dealersCards = "Fat Cat's cards are:  ";
        for (Card card: hand.getHand()) {
            dealersCards += card.toString() + " ";
        }
        dealersCards += "\nFat Cat's score is:  " + getScore();
        return dealersCards;
    }
}
