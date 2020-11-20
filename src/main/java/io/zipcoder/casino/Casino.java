package io.zipcoder.casino;


import games.cardgames.GoFish;
import io.zipcoder.casino.utilities.Console;
import menus.LoginMenu;
<<<<<<< Updated upstream
import player.PlayerWarehouse;
=======
import player.Account;
import player.FatCatDealer.GoFishDealer;
import player.GoFishPlayer;
>>>>>>> Stashed changes


public class Casino {
    public static void main(String[] args) {


        Console console = new Console(System.in, System.out);
//        LoginMenu loginMenu = new LoginMenu(console);
//        loginMenu.runLoginMenu();
        GoFish goFish = new GoFish(new GoFishPlayer(console, "test", "1234", new Account(console)),new GoFishDealer(), console);
    goFish.startGame();
    }

}

