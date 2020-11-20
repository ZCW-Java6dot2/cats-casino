package menus;

import io.zipcoder.casino.utilities.Console;

import player.Player;
import player.PlayerWarehouse;

public class LoginMenu {
    private Console console;
    MainMenu mainMenu;
    CasinoProfileMenu casinoProfileMenu;
    private boolean loginMenuPower = true;
    PlayerWarehouse playerWarehouse;

    public LoginMenu(Console console) {
        this.console = console;
        this.mainMenu = new MainMenu(console);
        this.casinoProfileMenu = new CasinoProfileMenu(console);
        this.playerWarehouse = new PlayerWarehouse(console);
    }



    public String runLoginMenu() {
        String output = null;
        //TODO: Add ASCII ART
        while (loginMenuPower) {
            console.print("\n" +
                    "Please choose from the following options:\n" +
                    "1 - Login to your Casino Profile\n" +
                    "2 - Create a New Casino Profile\n" +
                    "3 - Leave Casino\n" +
                    "---------------------------------\n");
            Integer selection = console.getIntegerInput("Enter choice here: -> ");
            output = loginMenuSwitch(selection);
            console.println(output);
        }
        return output;
    }

    public String loginMenuSwitch(Integer selection) {
        String output = null;
        Player currentPlayer = null;
        switch (selection) {
            case 1:
                currentPlayer = playerWarehouse.loginUser();
                output = mainMenu.runMainMenu(currentPlayer);
                break;
            case 2:
                currentPlayer = playerWarehouse.createNewUser();
                output = casinoProfileMenu.runCasinoProfileMenu(currentPlayer);
                break;
            case 3:
                loginMenuPower = false;
                output = "Closing casino!";
                //TODO tell em how much we took from them!
                break;
            default:
                output = "Please choose a correct option from the menu.";
                break;
        }
        return output;
    }
}

