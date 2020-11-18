package menus;

import io.zipcoder.casino.utilities.Console;
import player.Account;


import java.util.ArrayList;

public class LoginMenu {
    Console console;
    MainMenu mainMenu;
    CasinoProfileMenu casinoProfileMenu;
    ArrayList<Account> bank;
    private boolean loginMenuPower = true;


    public LoginMenu(Console console) {
        this.console = console;
        this.mainMenu = new MainMenu(console);
        this.casinoProfileMenu = new CasinoProfileMenu(console);
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
        boolean powerOn = true;
        switch (selection) {
            case 1:
                //Create login method for Casino Profile
//                selection = console.getIntegerInput("Enter choice here: -> ");
                output = mainMenu.runMainMenu(selection);
                break;
            case 2:
                //Create profile method for Casino Profile
                //Instantiate Account
                casinoProfileMenu.runCasinoProfileMenu();
                break;
            case 3:
                loginMenuPower = false;
                output = "Closing casino!";
                break;
            default:
                break;
        }
        return output;
    }

    public Account createNewUser(String input) {
        console.println("\nPlease provide a username you would like to use:");
        String username = console.getStringInput(input);
        console.println("\nPlease provide a password for your profile:");
        String password = console.getStringInput(input);
        Account casinoAccount = new Account(username, password);
        this.bank.add(casinoAccount);
        return casinoAccount;
    }

    public Account loginUser(String input) {
        Account currentAccount = null;
        console.println("\n" +
                "Please enter your username.");
        String username = console.getStringInput(input);
        console.println("\nPlease enter your password.");
        String password = console.getStringInput(input);
        for (Account account : bank) {
            String currentUsername = account.getUsername();
            String currentPassword = account.getPassword();
            boolean isCorrectName = currentUsername.equals(username);
            boolean isCorrectPassword = currentPassword.equals(password);
            boolean isValid = isCorrectName && isCorrectPassword;
            if (isValid) {
                currentAccount = account;
            }
            if (currentAccount == null) {
                console.println("\nIncorrect user or password, please try again.");
                currentAccount = createNewUser(input);
            }
        }
        return currentAccount;
    }
}

