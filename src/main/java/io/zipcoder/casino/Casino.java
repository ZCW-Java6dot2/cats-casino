package io.zipcoder.casino;

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


public class Casino {
    public static void main(String[] args) {


        Console console = new Console(System.in, System.out);
//        LoginMenu loginMenu = new LoginMenu(console);
//        loginMenu.runLoginMenu();
        GoFish goFish = new GoFish(new GoFishPlayer(console, "test", "1234", new Account(console)),new GoFishDealer(), console);
    goFish.startGame();
    }

    //        Craps craps = new Craps();
//        CrapsPlayer crapsPlayer = new CrapsPlayer(new Player(console, crapsPlayer.getUsername(), crapsPlayer.getPassword(), crapsPlayer.getPlayersAccount()));
//        CrapsEngine crapsEngine = new CrapsEngine(craps, crapsPlayer);

}

