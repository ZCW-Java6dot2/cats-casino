package menus;

import io.zipcoder.casino.utilities.Console;
import player.Player;

public class DiceGameMenu {
    Console console;

    public DiceGameMenu(Console console) {
        this.console = console;
    }

    public String runDiceGameMenu(Player currentPlayer) {
    boolean diceGameMenuPower = true;
    //TODO: Add ASCII ART
        Integer selection = 0;
        while (diceGameMenuPower) {
        System.out.println("\n" +
                "Please choose from the following options:\n" +
                "1 - Play Craps\n" +
                "2 - Play Snake Eyes\n" +
                "3 - Return to Main Menu\n" +
                "---------------------------------\n" +
                "Enter choice here: -> ");
            selection = console.getIntegerInput("Enter choice here: -> ");
            diceGameMenuSwitch(selection);
    }
        return String.valueOf(selection);
}

    public void diceGameMenuSwitch(Integer selection) {
        boolean powerOn = true;
        switch (selection) {
            case 1:
                //Play craps
                break;
            case 2:
                //Play snake
                break;
            case 4:
                powerOn = false;
                break;
            default:
                break;
        }

    }

    public String runCraps() {
        return null;
    }

    public String runSnake() {
        return null;
    }

}
