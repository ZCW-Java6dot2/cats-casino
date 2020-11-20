package menus;


import io.zipcoder.casino.utilities.Console;
import player.Account;
import player.Player;

public class CasinoProfileMenu {
    Console console;
    private boolean casinoMenuPower = true;
    private boolean managedFundsMenuPower = true;


    public CasinoProfileMenu(Console console) {
        this.console = console;
    }

    public String runCasinoProfileMenu(Player currentPlayer) {
        String output = null;
        //TODO: Add ASCII ART
        while (casinoMenuPower) {
            System.out.println("\n" +
                    "Current Username logged in: " + currentPlayer.getUsername() +
                    "\nPlease choose from the following options:\n" +
                    "1 - Manage Funds\n" +
                    "2 - Change Username\n" +
                    "3 - Change Password\n" +
                    "4 - Return to Login Menu\n" +
                    "---------------------------------\n");
            Integer newSelection = console.getIntegerInput("Enter choice here: -> ");
            output = casinoProfileSwitch(newSelection, currentPlayer);
        }
        return output;
    }

    public String casinoProfileSwitch(Integer newSelection, Player currentPlayer) {
        String output = null;
        switch (newSelection) {
            case 1:
                output = manageFundsMenu(currentPlayer);
                break;
            case 2:
                currentPlayer.changeUsername();
                output = "Account username change successful";
                break;
            case 3:
                currentPlayer.changePassword();
                output = "Account password change successful";
                break;
            case 4:
                casinoMenuPower = false;
                output = "\nReturning to Main Menu";
                break;
            default:
                output = "Please choose a correct option from the menu.";
                break;
        }
        return output;
    }


    //TODO: Add ASCII ART
    public String manageFundsMenu(Player currentPlayer) {
        String output = null;
        while (managedFundsMenuPower) {
        System.out.println("\n" +
                "Please choose from the following options:\n" +
                "1 - Deposit Funds\n" +
                "2 - Cash Out\n" +
                "3 - Return to Profile Menu\n" +
                "---------------------------------\n");
            Integer newestSelection = console.getIntegerInput("Enter choice here: -> ");
            output = managedFundsSwitch(newestSelection, currentPlayer);

    }
        return output;
}

    public String managedFundsSwitch(Integer newestSelection, Player currentPlayer) {
        String output = null;
        switch (newestSelection) {
            case 1:
                currentPlayer.depositFunds();
                output = "Funds deposited successfully. Current balance = $" + currentPlayer.getPlayersAccount().getBalance();
                break;
            case 2:
                currentPlayer.cashoutFunds();
                output = "Cash out successful. Current Balance = $" + currentPlayer.getPlayersAccount().getBalance();
                break;
            case 3:
                managedFundsMenuPower = false;
                break;
            default:
                output = "Please choose a correct option from the menu.";
                break;
        }
        return output;
    }
}
