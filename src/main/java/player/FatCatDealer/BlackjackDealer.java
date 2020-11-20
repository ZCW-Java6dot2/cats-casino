package player.FatCatDealer;

import games.cardgames.Card;
import games.cardgames.Hand;
import java.util.ArrayList;

public class BlackjackDealer {

    private Hand hand = new Hand();
    private Card card;

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
            int valueOfCurrentCard = getHand().get(i).getValue();
            score += valueOfCurrentCard;
            boolean isCardAce = getHand().get(i).getValue() == 1;
            if (isCardAce == true) {
                aceCounter += 1;

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

    public String fatCatFaceUpCard(){
        String fatCatCard = "Fat Cat is showing:  ";
        fatCatCard += hand.getHand().get(1);
        return fatCatCard;
    }
}
