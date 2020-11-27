package player;

import games.cardgames.Card;
import games.cardgames.Hand;
import interfaces.Gambler;
import io.zipcoder.casino.utilities.Console;

import java.util.ArrayList;

public class GoFishPlayer extends Player {
    private Hand hand = new Hand();
    private Integer playerScore = 0;
    private ArrayList<Card> tabledSetHolder = new ArrayList<Card>();

    public GoFishPlayer(Console console, String username, String password, Account playersAccount) {
        super(console, username, password, playersAccount);
    }

    public void draw(Card drawnCard) {
        hand.addCard(drawnCard);
    }
    public ArrayList<Card> getPlayerHand() {
        return hand.getHand();
    }
    public String printPlayerScore() {
        return "Score: " + playerScore;
    }
    public Integer getPlayerScore() {
        return playerScore;
    }
    public Integer playerScored() {
        return playerScore++;
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
                    playerScored();
                }
            }
        }
        removeSet();
    }

}
