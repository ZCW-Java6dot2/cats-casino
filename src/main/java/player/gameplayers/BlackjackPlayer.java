package player.gameplayers;

import games.cardgames.Hand;
import interfaces.Gambler;
import player.Player;

import javax.smartcardio.Card;

public class BlackjackPlayer extends Player implements Gambler {
    Hand blackjackPlayerHand;
    Hand splitHand;

    public boolean bet() {
        return false;
    }

    public Integer placeBet() {
        return null;
    }

    public Integer getWinnings() {
        return null;
    }
    // taking a new card from the stakc into player's array of cards
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
