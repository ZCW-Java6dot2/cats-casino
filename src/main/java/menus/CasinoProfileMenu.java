package menus;


import io.zipcoder.casino.utilities.Console;
import player.Account;

public class CasinoProfileMenu {
    Console console;
    private boolean casinoMenuPower = true;
    private boolean managedFundsMenuPower = true;

    public CasinoProfileMenu(Console console) {
        this.console = console;
    }

    public String runCasinoProfileMenu(Account account) {
        String output = null;
        //TODO: Add ASCII ART
        while (casinoMenuPower) {
            System.out.println("\n" +
                    "Current Username logged in: " + account.getUsername() +
                    "\nPlease choose from the following options:\n" +
                    "1 - Manage Funds\n" +
                    "2 - Change Username\n" +
                    "3 - Change Password\n" +
                    "4 - Return to Main Menu\n" +
                    "---------------------------------\n");
            Integer newSelection = console.getIntegerInput("Enter choice here: -> ");
            output = casinoProfileSwitch(newSelection, account);
        }
        return output;
    }

    public String casinoProfileSwitch(Integer newSelection, Account account) {
        String output = null;
        switch (newSelection) {
            case 1:
                output = manageFundsMenu(account);
                break;
            case 2:
                account.changeUsername(account);
                output = "Account username change successful";
                break;
            case 3:
                account.changePassword(account);
                output = "Account password change successful";
                break;
            case 4:
                casinoMenuPower = false;
                break;
            default:
                output = "Please choose a correct option from the menu.";
                break;
        }
        return output;
    }


    //TODO: Add ASCII ART
    public String manageFundsMenu(Account account) {
        String output = null;
        while (managedFundsMenuPower) {
        System.out.println("\n" +
                "Please choose from the following options:\n" +
                "1 - Deposit Funds\n" +
                "2 - Cash Out\n" +
                "3 - Return to Profile Menu\n" +
                "---------------------------------\n");
            Integer newestSelection = console.getIntegerInput("Enter choice here: -> ");
            output = managedFundsSwitch(newestSelection, account);

    }
        return output;
}

    public String managedFundsSwitch(Integer newestSelection, Account account) {
        String output = null;
        switch (newestSelection) {
            case 1:
                account.depositFunds(account);
                output = "Funds deposited successfully. Current balance = $" + account.getBalance();
                break;
            case 2:
                account.cashoutFunds(account);
                output = "Cash out successful. Balance = $0.00";
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
