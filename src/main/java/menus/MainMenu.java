package menus;

import io.zipcoder.casino.utilities.Console;

public class MainMenu {
    Console console = new Console(System.in, System.out);

    public String runMainMenu() {
        boolean mainMenuPower = true;
        //TODO: Add ASCII ART
        Integer selection = 0;
        while (mainMenuPower) {
            System.out.println("\n" +
                    "Please choose from the following options:\n" +
                    "1 - Play Card Games\n" +
                    "2 - Play Dice Games\n" +
                    "3 - Modify Casino Profile\n" +
                    "4 - Return to Login Menu\n" +
                    "---------------------------------\n" +
                    "Enter choice here: -> ");

            selection = console.getIntegerInput("Enter choice here: -> ");
            runMainMenuSwitch(selection);
        }
        return null;
    }

    public void runMainMenuSwitch(Integer selection) {
        boolean powerOn = true;
        switch (selection) {
            case 1:
                //Take to card game menu
                break;
            case 2:
                //Take to dice game menu
                break;
            case 3:
                //Modify casino player
                break;
            case 4:
                powerOn = false;
                break;
            default:
                break;
        }

    }

}
