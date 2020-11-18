package gametables;

import interfaces.Gambling;
import player.BlackjackPlayer;


import javax.smartcardio.Card;

public class BlackjackTable implements Gambling {
    BlackjackPlayer blackjackPlayer;

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

    // taking a new card from the stake into player's array of cards
    public Card hit(){
      return null;
    }
    // taking a new card from the stack into the player's array of cards & doubling player's current bet & only hitting 1x
    public Card doubleDown(Integer bet) {
        return null;
    }
    // taking no more cards into player's array of cards continue game until winner is found
    public Boolean stand() {
        return null;
    }

    public Card split() {
        return null;
    }

}
