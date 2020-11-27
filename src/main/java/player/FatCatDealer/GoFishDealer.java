package player.FatCatDealer;

import games.cardgames.Card;
import games.cardgames.Hand;
import io.zipcoder.casino.utilities.Console;
import player.Account;

import java.util.ArrayList;

public class GoFishDealer {
    private Hand hand = new Hand();
    private Integer fatCatScore = 0;
    private ArrayList<Card> tabledSetHolder = new ArrayList<Card>();


    public void draw(Card drawnCard) {
        hand.addCard(drawnCard);
    }
    public ArrayList<Card> getFatCatHand() {
        return hand.getHand();
    }
    public String printFatCatScore() {
        return "Fat Cat Score: " + fatCatScore;
    }
    public Integer getFatCatScore() {
        return fatCatScore;
    }
    public Integer fatCatScored() {
        return fatCatScore++;
    }
    public void removeSet() {
        hand.getHand().removeAll(tabledSetHolder);
    }
    public void addScore() {
        Integer setCounter = 0;
        Integer tempValue = hand.getHand().get(0).getValue();
        for(int i = 1; i < hand.getHandSize(); i++) {
            if(!tempValue.equals(hand.getHand().get(i).getValue())) {
                tempValue = hand.getHand().get(i).getValue();
                setCounter =0;
            }
            else if(tempValue.equals(hand.getHand().get(i).getValue())) {
                setCounter += 1;
                if(setCounter == 3) {
                    tabledSetHolder.add(hand.getHand().get(i));
                    tabledSetHolder.add(hand.getHand().get(i - 1));
                    tabledSetHolder.add(hand.getHand().get(i - 2));
                    tabledSetHolder.add(hand.getHand().get(i - 3));
                    setCounter = 0;
                    fatCatScored();
                }
            }
        }
        removeSet();
    }

}


