package interfaces;

import player.Player;

public interface Game {

    public void addPlayer(Player player);
    public void removePlayer(Player player);
    public void startGame();
    public void endGame();
    public void results();
}
