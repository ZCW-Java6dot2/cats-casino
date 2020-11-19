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
}
