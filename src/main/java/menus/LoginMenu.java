package menus;

import io.zipcoder.casino.utilities.Console;
import player.Player;

public class LoginMenu {
    Console console = new Console(System.in, System.out);
    Player currentPlayer;


    public String runLoginMenu() {
        boolean loginMenuPower = true;
        //TODO: Add ASCII ART
        Integer selection = 0;
        while (loginMenuPower) {
            console.print("\n" +
                    "Please choose from the following options:\n" +
                    "1 - Login to your Casino Profile\n" +
                    "2 - Create a New Casino Profile\n" +
                    "3 - Logout of Casino Profile\n" +
                    "4 - Leave Casino\n" +
                    "---------------------------------\n");
                   selection = console.getIntegerInput("Enter choice here: -> ");
                   loginMenuSwitch(selection);
        }
        return String.valueOf(selection);
    }

    public void loginMenuSwitch(Integer selection) {
        boolean powerOn = true;
        switch (selection) {
            case 1:
                //Create login method for Casino Profile
                break;
            case 2:
                //Create profile method for Casino Profile
                break;
            case 3:
                currentPlayer = null;
                break;
            case 4:
                powerOn = false;
                break;
            default:
                break;
        }

    }

    public String runMainMenu() {
        return null;
    }

    public String runCardGamesMenu() {
        return null;
    }

    public String runDiceGamesMenus() {
        return null;
    }

    public String runPlayerMenu() {
        return null;
    }
}

