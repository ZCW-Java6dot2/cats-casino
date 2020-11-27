package games.dicegames;

import java.util.Random;

public class Die {
    Integer value;

    public Die() {
        rollDie();
    }

    public void rollDie() {
        Random rand = new Random();
        value = rand.nextInt(6) + 1;
    }

    public Integer getValue() {
        return value;
    }

    public String printDie() {
        switch (value) {
            case 1:
                return "\u2680";
            case 2:
                return "\u2681";
            case 3:
                return "\u2682";
            case 4:
                return "\u2683";
            case 5:
                return "\u2684";
            case 6:
                return "\u2685";
        }
        return null;
    }
}
