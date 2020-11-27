package games.dicegames;

import interfaces.Game;

import java.util.ArrayList;
import java.util.Random;

public class Dice {
    private ArrayList<Die> dice = new ArrayList<>();

    public Dice(int numDice) {
        for(int i = 0; i < numDice; i++) {
            dice.add(new Die());
        }
    }

    public void rollDice() {
        for(Die die : dice) {
            die.rollDie();
        }
    }

    public String printDice() {
        StringBuilder stringBuilder = new StringBuilder();
        for(Die die : dice) {
            stringBuilder.append(die.printDie());
        }
        return stringBuilder.toString();
    }

    public ArrayList<Die> getDice() {
        return dice;
    }
}

