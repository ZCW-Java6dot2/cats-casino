package menus;
import games.cardgames.BlackjackGame;
import games.cardgames.GoFish;
import io.zipcoder.casino.utilities.Console;
import player.BlackjackPlayer;
import player.FatCatDealer.BlackjackDealer;
import player.FatCatDealer.GoFishDealer;
import player.GoFishPlayer;
import player.Player;

public class CardGameMenu {
    private Console console;
    private Player player;
    private boolean cardGameMenuPower = true;

    public CardGameMenu(Console console) {
        this.console = console;
    }

    public String runCardGameMenu(Player currentPlayer) {
        this.player = currentPlayer;
        Integer selection = 0;
        while (cardGameMenuPower) {
            System.out.println("\n" +
                    "Please choose from the following options:\n" +
                    "1 - Play Blackjack\n" +
                    "2 - Play Go Fish\n" +
                    "3 - Return to Main Menu\n" +
                    "---------------------------------\n");
            selection = console.getIntegerInput("Enter choice here: -> ");
            runCardGameSwitch(selection);
        }
        return String.valueOf(selection);
    }
    public void runCardGameSwitch(Integer selection) {
        switch (selection) {
            case 1:
                BlackjackGame blackjackGame = new BlackjackGame(new BlackjackPlayer(console, player.getUsername(), player.getPassword(), player.getPlayersAccount()),new BlackjackDealer(), console);
                blackjackGame.startGame();
                break;
            case 2:
                GoFish goFishGame= new GoFish(new GoFishPlayer(console, player.getUsername(), player.getPassword(), player.getPlayersAccount()),new GoFishDealer(), console);
                goFishGame.startGame();
                break;
            case 3:
                cardGameMenuPower = false;
                break;
            default:
                console.println("Please choose a correct option from the menu.");
                break;
        }
    }
}