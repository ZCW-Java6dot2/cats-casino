package games.dicegames;

import interfaces.Game;
import io.zipcoder.casino.utilities.Console;
import player.Player;
import player.SnakeEyesPlayers;

import java.util.ArrayList;

public class SnakeEye extends DiceGame implements Game {
    private Console console;
    Die die1;
    Die die2;
    Integer counter =0;

    public SnakeEye(){
        SnakeEyesPlayers player1 = new SnakeEyesPlayers();
        SnakeEyesPlayers player2 = new SnakeEyesPlayers();
        Die die1 = new Die(console.getIntegerInput("Please enter the number of sides you want for your first die"));
        Die die2 = new Die(console.getIntegerInput("Please enter the number of sides you want for your second die"));
    }

    public void addPlayer(Player player) {

    }

    public void removePlayer(Player player) {

    }

    public void startGame() {
        console.println("*** Welcome to the good old Snake Eye Universe!***\n" +
                "** Add fire to your ice, the only snake eyes you ever rolled with that dice **");

        die1.rollDice();
        die2.rollDice();

    }

    public void endGame() {

    }

    public String results(ArrayList<Integer> scores) {



        return null;
    }


    public void startPlayersTurn() {
        while (!(die1.getFaceValue()==1 && die2.getFaceValue()==1)){
            counter++;
            die1.rollDice();
            die2.rollDice();
        }
        console.println("\nIt took %d attempts to get snake eyes.\n", counter);
    }

    public void action() {

    }

    public void finishTurn() {

    }
}
