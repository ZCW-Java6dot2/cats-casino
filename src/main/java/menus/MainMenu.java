package menus;
import io.zipcoder.casino.utilities.Console;
import player.Account;
import player.Player;
public class MainMenu {
    private Console console;
    private CasinoProfileMenu casinoProfileMenu;
    private CardGameMenu cardGameMenu;
    private boolean mainMenuPower = true;
    public MainMenu(Console console) {
        this.console = console;
        this.casinoProfileMenu = new CasinoProfileMenu(console);
//        this.cardGameMenu = new CardGameMenu(console, cardGameMenu.player);
    }
    public String runMainMenu(Player currentPlayer) {
        String output = null;
        //TODO: Add ASCII ART
        while (mainMenuPower) {
            System.out.println("\n" +
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
                output = cardGameMenu.runCardGameMenu();
                break;
            case 2:
                //Take to dice game menu
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
        return output;
    }
}