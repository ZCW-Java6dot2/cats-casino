package menus;

import io.zipcoder.casino.utilities.Console;
import player.Account;
import player.Accounts;

public class LoginMenu {
    private Console console;
    MainMenu mainMenu;
    CasinoProfileMenu casinoProfileMenu;
    Accounts accounts;
    private boolean loginMenuPower = true;

    public LoginMenu(Console console) {
        this.console = console;
        this.mainMenu = new MainMenu(console);
        this.casinoProfileMenu = new CasinoProfileMenu(console);
        this.accounts = new Accounts(console);
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

        }
        return output;
    }

    public String loginMenuSwitch(Integer selection) {
        String output = null;
        Account currentAccount = null;
        switch (selection) {
            case 1:
                currentAccount = accounts.loginUser();
                output = mainMenu.runMainMenu(currentAccount);
                break;
            case 2:
                currentAccount = accounts.createNewUser();
                output = casinoProfileMenu.runCasinoProfileMenu(currentAccount);
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

