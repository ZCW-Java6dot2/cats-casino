package player.gameplayers;

import interfaces.Gambler;
import player.Player;

public class CrapsPlayer extends Player implements Gambler {
    public boolean bet() {
        return false;
    }

    public Integer placeBet() {
        return null;
    }

    public Integer getWinnings() {
        return null;
    }

}
