package player;

import games.cardgames.Hand;
import interfaces.Gambler;

public class BlackjackPlayer implements Gambler {
    Player player;
    Hand hand;
    Hand splitHand;

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
}
