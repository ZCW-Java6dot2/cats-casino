package games.dicegames;

import interfaces.Game;
import io.zipcoder.casino.utilities.Console;
import player.Player;
import player.SnakeEyesPlayers;

import java.util.ArrayList;

public class SnakeEyes extends DiceGame implements Game {
   private Console console;
    private DiceGame diceGame;
    private Die die;
    private ArrayList<SnakeEyesPlayers> snakeEyesPlayers;

    public SnakeEyes(ArrayList<Die> dice, ArrayList<Player> players) {
        super(dice, players);
    }


    public void addPlayer(Player player) {
        SnakeEyesPlayers snakeEyesPlayer1 = new SnakeEyesPlayers(players.get(0));
        SnakeEyesPlayers snakeEyesPlayer2 = new SnakeEyesPlayers(players.get(1));
        snakeEyesPlayers.add(snakeEyesPlayer1);
        snakeEyesPlayers.add(snakeEyesPlayer2);

    }



    public void startGame() {
        console.println("*** Welcome to the good old Snake Eye Universe!***\n" +
                "** Add fire to your ice, the only snake eyes you ever rolled with that dice **");



    }

    public void endGame() {

    }

    public String results(ArrayList<Integer> scores) {
        return null;
    }


    public void startPlayersTurn() {

    }

    public void action() {

    }

    public void finishTurn() {

    }
}
