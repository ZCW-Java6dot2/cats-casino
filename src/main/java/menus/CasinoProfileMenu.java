package menus;


import io.zipcoder.casino.utilities.Console;

public class CasinoProfileMenu {
    Console console;

    public CasinoProfileMenu(Console console) {
        this.console = console;
    }

    public String runCasinoProfileMenu() {
        boolean casinoProfileMenu = true;
        //TODO: Add ASCII ART
        Integer selection = 0;
        while (casinoProfileMenu) {
            System.out.println("\n" +
                    "Please choose from the following options:\n" +
                    "1 - Manage Funds\n" +
                    "2 - Change Username\n" +
                    "3 - Change Password\n" +
                    "4 - Return to Main Menu\n" +
                    "---------------------------------\n" +
                    "Enter choice here: -> ");
            selection = console.getIntegerInput("Enter choice here: -> ");
            casinoProfileSwitch(selection);
        }
        return String.valueOf(selection);
    }

    public void casinoProfileSwitch(Integer selection) {
        boolean powerOn = true;
        switch (selection) {
            case 1:
                manageFundsMenu();
                break;
            case 2:
                //change username
                break;
            case 3:
                //change password
                break;
            case 4:
                powerOn = false;
                break;
            default:
                break;
        }

    }

    //TODO: Add ASCII ART
    public String manageFundsMenu() {
//        boolean casinoProfileMenu = true;
        Integer selection = 0;
    boolean manageFundsMenu = true;
        while (manageFundsMenu) {
        System.out.println("\n" +
                "Please choose from the following options:\n" +
                "1 - Deposit Funds\n" +
                "2 - Cash Out\n" +
                "3 - Return to Profile Menu\n" +
                "---------------------------------\n" +
                "Enter choice here: -> ");
            selection = console.getIntegerInput("Enter choice here: -> ");
            managedFundsSwitch(selection);

    }
        return String.valueOf(selection);
}

    public void managedFundsSwitch(Integer selection) {
        boolean powerOn = true;
        switch (selection) {
            case 1:
                //Deposit Funds
                break;
            case 2:
                //Cash out
                break;
            case 3:
                powerOn = false;
                break;
            default:
                break;
        }

    }

    public void createPlayer() {

    }

    public void deletePlayer() {

    }

    public void depositMoney() {

    }

    public void cashOut() {

    }
}
