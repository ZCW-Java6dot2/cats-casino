package menus;

import io.zipcoder.casino.utilities.Console;

public class MainMenu {
    private Console console;

    private boolean mainMenuPower = true;

    public MainMenu(Console console) {
        this.console = console;
    }

    public String runMainMenu(Integer selection) {
        String output = null;
        //TODO: Add ASCII ART
        while (mainMenuPower) {
            System.out.println("\n" +
                    "Please choose from the following options:\n" +
                    "1 - Play Card Games\n" +
                    "2 - Play Dice Games\n" +
                    "3 - Modify Casino Profile\n" +
                    "4 - Return to Login Menu\n" +
                    "---------------------------------\n");
            Integer new_selection = console.getIntegerInput("Enter choice here: -> ");
            output = runMainMenuSwitch(new_selection);
        }
        return output;
    }

    public String runMainMenuSwitch(Integer selection) {
        String output = null;
        boolean powerOn = true;
        switch (selection) {
            case 1:
                //Take to card game menu
                output = "TESTING THIS OUT";
                break;
            case 2:
                //Take to dice game menu
                break;
            case 3:
                //Modify casino player
                break;
            case 4:
                mainMenuPower = false;
                break;
            default:
                break;
        }
        return output;
    }

}
