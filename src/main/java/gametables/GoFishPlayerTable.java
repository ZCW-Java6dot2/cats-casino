package gametables;

import games.cardgames.Hand;
import player.Player;

import javax.smartcardio.Card;

public class GoFishPlayerTable {

    //player draws card from stack
    public Card goFish() {
        return null;
    }
    //Checks if guessed card is in other players hand
    public Boolean ask(Card guessCard) {
        return null;
    }
    //player gives card to player who guessed correct
    public Card giveCard(Card guessCard){
       return null;
    }
    //Checks hand for any pairs
    public Boolean pairs() {
        return null;
    }
    //places pairs out of hand
    public Card placePair(Card pairedCard) {
        return null;
    }
}
