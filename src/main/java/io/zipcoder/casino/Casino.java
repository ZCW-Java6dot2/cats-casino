package io.zipcoder.casino;


import games.dicegames.Craps;
import gametables.CrapsEngine;
import io.zipcoder.casino.utilities.Console;
import menus.LoginMenu;
import player.CrapsPlayer;
import player.Player;
import player.PlayerWarehouse;


public class Casino {
    public static void main(String[] args) {


        Console console = new Console(System.in, System.out);
        LoginMenu loginMenu = new LoginMenu(console);
        loginMenu.runLoginMenu();

    }

    //        Craps craps = new Craps();
//        CrapsPlayer crapsPlayer = new CrapsPlayer(new Player(console, crapsPlayer.getUsername(), crapsPlayer.getPassword(), crapsPlayer.getPlayersAccount()));
//        CrapsEngine crapsEngine = new CrapsEngine(craps, crapsPlayer);

}

