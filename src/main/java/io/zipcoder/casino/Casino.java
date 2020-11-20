package io.zipcoder.casino;
<<<<<<< HEAD


import games.cardgames.BlackjackGame;
import io.zipcoder.casino.utilities.Console;
import menus.LoginMenu;
import player.Account;
import player.BlackjackPlayer;
import player.FatCatDealer.BlackjackDealer;


=======
import games.dicegames.Craps;
import gametables.CrapsEngine;
import io.zipcoder.casino.utilities.Console;
import menus.LoginMenu;
import player.CrapsPlayer;
import player.Player;
import games.cardgames.GoFish;
import io.zipcoder.casino.utilities.Console;
import menus.LoginMenu;
import player.PlayerWarehouse;
import player.Account;
import player.FatCatDealer.GoFishDealer;
import player.GoFishPlayer;
import player.PlayerWarehouse;
>>>>>>> a26e6ecef2d1e1c382054b5657466f942c27670e
public class Casino {

    public static void main(String[] args) {
        Console console = new Console(System.in, System.out);
<<<<<<< HEAD
        console = console;
        BlackjackPlayer player = new BlackjackPlayer(console, "pompy", "1234", new Account(console));
        BlackjackDealer fatCat = new BlackjackDealer();
//        LoginMenu loginMenu = new LoginMenu(console);
//        loginMenu.runLoginMenu();
        BlackjackGame blackjackGame = new BlackjackGame();



=======
        LoginMenu loginMenu = new LoginMenu(console);
        loginMenu.runLoginMenu();
>>>>>>> a26e6ecef2d1e1c382054b5657466f942c27670e
    }
}