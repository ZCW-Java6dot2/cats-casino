package player;


import interfaces.Gambler;
import io.zipcoder.casino.utilities.Console;

public class CrapsPlayer extends Player implements Gambler {

    public CrapsPlayer(Console console, String username, String password, Account playersAccount) {
        super(console, username, password, playersAccount);
    }

    @Override
    public boolean bet() {
        return false;
    }

    @Override
    public Integer placeBet() {
        return null;
    }

    @Override
    public Integer getWinnings() {
        return null;
    }

    @Override
    public boolean addFunds() {
        return false;
    }
}
