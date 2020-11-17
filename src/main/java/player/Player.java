package player;


public abstract class Player {
    Account playersAccount;

    public Player(Account playersAccount) {
        this.playersAccount = playersAccount;
    }

    public Player() {
    }

}
