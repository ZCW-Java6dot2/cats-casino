package menus;


import games.cardgames.GoFish;
import io.zipcoder.casino.utilities.Console;
import player.FatCatDealer.GoFishDealer;
import player.GoFishPlayer;
import player.Player;

public class CardGameMenu {
    Console console;
    Player player;

    public CardGameMenu(Console console, Player player) {
        this.console = console;
        this.player = player;
    }

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
                    "---------------------------------\n");
            selection = console.getIntegerInput("Enter choice here: -> ");
            runCardGameSwitch(selection);

        }
        return String.valueOf(selection);
    }

    public void runCardGameSwitch(Integer selection) {
        switch (selection) {
            case 1:
                //Play Blackjack
//                BlackjackGame game = new BlackjackGame();
//                        game.run
                break;
            case 2:
                GoFish goFishGame= new GoFish(new GoFishPlayer(console, player.getUsername(), player.getPassword(), player.getPlayersAccount()),new GoFishDealer(), console);
                break;
            case 3:
                //run main menu
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

}
