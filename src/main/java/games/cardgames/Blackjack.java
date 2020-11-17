package games.cardgames;


import interfaces.GamblingGame;
import interfaces.Game;
import player.Dealer;
import player.Player;
import player.gameplayers.BlackjackPlayer;

public class Blackjack extends CardGame implements Game, GamblingGame {

    //TODO:
    Dealer dealer = new Dealer();

    public void addPlayer(Player player) {
        BlackjackPlayer blackjackPlayer = new BlackjackPlayer();
    }

    public void removePlayer(Player player) {

    }

    public void startGame() {

    }

    public void endGame() {

    }

    public void results() {

    }

    public Integer getPlayerBet() {
        return null;
    }

    public Integer payWinnings() {
        return null;
    }
}
