package menus;

import io.zipcoder.casino.utilities.Console;
import player.Player;

public class MainMenu {
    private Console console;
    private CasinoProfileMenu casinoProfileMenu;
    private CardGameMenu cardGameMenu;
    private DiceGameMenu diceGameMenu;
    private boolean mainMenuPower = true;

    public MainMenu(Console console) {
        this.console = console;
        this.casinoProfileMenu = new CasinoProfileMenu(console);
        this.cardGameMenu = new CardGameMenu(console);
        this.diceGameMenu = new DiceGameMenu(console);
    }

    public String runMainMenu(Player currentPlayer) {
        String output = null;
        //TODO: Add ASCII ART
        while (mainMenuPower) {
            console.println("\n" +
                    "Please choose from the following options:\n" +
                    "1 - Play Card Games\n" +
                    "2 - Play Dice Games\n" +
                    "3 - Modify Casino Profile\n" +
                    "4 - Return to Login Menu\n" +
                    "---------------------------------\n");
            Integer newSelection = console.getIntegerInput("Enter choice here: -> ");
            output = runMainMenuSwitch(newSelection, currentPlayer);
        }
        return output;
    }

    public String runMainMenuSwitch(Integer newSelection, Player currentPlayer) {
        String output = null;
        boolean powerOn = true;
        switch (newSelection) {
            case 1:
                output = cardGameMenu.runCardGameMenu(currentPlayer);
                break;
            case 2:
                output = diceGameMenu.runDiceGameMenu(currentPlayer);
                break;
            case 3:
                output = casinoProfileMenu.runCasinoProfileMenu(currentPlayer);
                break;
            case 4:
                mainMenuPower = false;
                break;
            default:
                output = "Please choose a correct option from the menu.";
                break;
        }
        return output = "Leaving Main Menu.";
    }
}