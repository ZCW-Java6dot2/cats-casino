package interfaces;

import player.Player;

import java.util.ArrayList;

public interface Game {

    public void addPlayer(Player player);
    public void removePlayer(Player player);
    public void startGame();
    public void endGame();
    public String results(ArrayList<Integer> scores);
    public void startPlayersTurn();
    public void finishTurn();
}
