package menus;

import io.zipcoder.casino.utilities.Console;
import player.Account;
import player.Bank;
import player.Player;

import java.util.ArrayList;

public class LoginMenu {
    Console console = new Console(System.in, System.out);
    Player currentPlayer;
    MainMenu mainMenu;
    CasinoProfileMenu casinoProfileMenu;
    ArrayList<Account> bank;


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
                mainMenu.runMainMenu();
                break;
            case 2:
                //Create profile method for Casino Profile
                //Instantiate Account
                casinoProfileMenu.runCasinoProfileMenu();
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

    public Account createNewUser(String input) {
        console.println("\nPlease provide a username you would like to use:");
        String username = console.getStringInput(input);
        console.println("\nPlease provide a password for your profile:");
        String password = console.getStringInput(input);
        Account casinoAccount = new Account(username, password);
        this.bank.add(casinoAccount);
        return casinoAccount;
    }

    public Users loginUser() {
        Users currentActiveUser = null;
        System.out.println("\n" +
                "Please enter your username.");
        String username = scanner.next();
        System.out.println("\nPlease enter your password.");
        String password = scanner.next();
        for (Users user : userList) {
            String currentName = user.getUsername();
            String currentPassword = user.getPassword();
            boolean isCorrectName = currentName.equals(username);
            boolean isCorrectPassword = currentPassword.equals(password);
            boolean isValid = isCorrectName && isCorrectPassword;
            if (isValid) {
                currentActiveUser = user;
            }
            if (currentActiveUser == null) {
                System.out.println("\nIncorrect user or password, please try again.");
                currentActiveUser = createNewUser();
            }
        }
        return currentActiveUser;
    }


    public void deleteUser(Users currentActiveUser) {
        System.out.println("Please confirm deletion with providing your password:");
        String deletionPassword = scanner.nextLine();
        if (currentActiveUser.getPassword().equals(deletionPassword)) {
            userList.remove(currentActiveUser);
            System.out.println("User profile deleted.");
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

