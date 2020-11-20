package menus;

import games.cardgames.BlackjackGame;
import games.dicegames.Craps;
import games.dicegames.SnakeEyes;
import io.zipcoder.casino.utilities.Console;
import player.BlackjackPlayer;
import player.CrapsPlayer;
import player.FatCatDealer.BlackjackDealer;
import player.Player;
import player.SnakeEyesPlayers;

public class DiceGameMenu {
    private Console console;
    private boolean diceGameMenuPower = true;

    public DiceGameMenu(Console console) {
        this.console = console;
    }

    public String runDiceGameMenu(Player currentPlayer) {
    diceGameMenuPower = true;
    //TODO: Add ASCII ART
        Integer selection = 0;
        while (diceGameMenuPower) {
        System.out.println("\n" +
                "Please choose from the following options:\n" +
                "1 - Play Craps\n" +
                "2 - Play Snake Eyes\n" +
                "3 - Return to Main Menu\n" +
                "---------------------------------\n");
            selection = console.getIntegerInput("Enter choice here: -> ");
            diceGameMenuSwitch(selection, currentPlayer);
    }
        return String.valueOf(selection);
}

    public void diceGameMenuSwitch(Integer selection, Player currentPlayer) {
        boolean powerOn = true;
        switch (selection) {
            case 1:
                CrapsPlayer currentCrapsPlayer = new CrapsPlayer(console, currentPlayer.getUsername(), currentPlayer.getPassword(), currentPlayer.getPlayersAccount());
                Craps crapsGame = new Craps(console, currentCrapsPlayer);
                crapsGame.startGame();
                break;
            case 2:
                SnakeEyes snakeEyes = new SnakeEyes(console);
                snakeEyes.startGame();
                break;
            case 3:
                diceGameMenuPower = false;
                break;
            default:
                console.println("Please choose a correct option from the menu.");
                break;
        }

    }

}
