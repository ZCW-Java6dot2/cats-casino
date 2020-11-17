package menus;


import io.zipcoder.casino.utilities.Console;

public class CardGameMenu {
    Console console;

    public String runCardGameMenu() {
        boolean cardGameMenuPower = true;
        //TODO: Add ASCII ART
        Integer selection = 0;
        while (cardGameMenuPower) {
            System.out.println("\n" +
                    "Please choose from the following options:\n" +
                    "1 - Play Blackjack\n" +
                    "2 - Play Go Fish\n" +
                    "3 - Return to Main Menu\n" +
                    "---------------------------------\n" +
                    "Enter choice here: -> ");
            selection = console.getIntegerInput("Enter choice here: -> ");
            runCardGameSwitch(selection);

        }
        return null;
    }

    public void runCardGameSwitch(Integer selection) {
        boolean powerOn = true;
        switch (selection) {
            case 1:
                //Play Blackjack
                break;
            case 2:
                //Play Go Fish
                break;
            case 3:
                powerOn = false;
                break;
            default:
                break;
        }

    }


    public String runBlackjack() {
        return null;
    }

    public String runGoFish() {
        return null;
    }

    LoginMenu loginMenu = new LoginMenu();
}
