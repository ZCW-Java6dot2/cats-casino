package games.cardgames;


import interfaces.GamblingGame;
import interfaces.Game;
import player.Dealer;
import player.Player;
import gametables.BlackjackTable;

import java.util.ArrayList;

public class Blackjack extends CardGame implements Game, GamblingGame {

    //TODO:
    Dealer dealer = new Dealer();

    public void addPlayer(Player player) {
        BlackjackTable blackjackTable = new BlackjackTable();
    }

    public void removePlayer(Player player) {

    }

    public void startGame() {

    }

    public void endGame() {

    }

    public String results(ArrayList<Integer> scores) {
        return null;
    }

    public void startPlayersTurn() {

    }

    public void finishTurn() {

    }

    public Integer getPlayerBet() {
        return null;
    }

    public Integer payWinnings() {
        return null;
    }
}
