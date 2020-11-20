package games.dicegames;

import interfaces.Game;
import io.zipcoder.casino.utilities.Console;
import player.Player;
import player.SnakeEyesPlayers;

import java.util.ArrayList;
import java.util.Arrays;

public class SnakeEyes implements Game {
    private Console console;
    private Integer counter = 0;
    Player player;

    public SnakeEyes(Console console) {
        this.console = console;
    }

    public void startGame() {

        console.println("*** Welcome to the good old Snake Eye Universe!***\n" +
                "** Add fire to your ice, the only snake eyes you ever rolled with that dice **\n" +
                "\n");
        console.getIntegerInput("Guess how many times you will get a Snake Eye if you toss it 10,000 times?  " +
                "Please enter your guess here -> ");

        int dice1;
        int dice2;
        final int SIZE = 100000;

        int[] result = new int[SIZE];

        for (int i = 0; i < SIZE; i++) {

            int rolls = 0;
            do {

                rolls++;
                dice1 = (int) (Math.random() * 6) + 1;
                dice2 = (int) (Math.random() * 6) + 1;

            } while (dice1 != 1 || dice2 != 1);

            result[i] = rolls;
        }

        Integer avg = Arrays.stream(result).sum() /  SIZE;
        console.println("\n");
        console.println(String.valueOf(avg));
        console.println("\n");
        endGame();
    }



    public void endGame() {

        console.println("Nice try!  :D Good Day, Dicey Out!");

    }

}
