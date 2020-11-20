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
import player.PlayerWarehouse;
public class Casino {
    public static void main(String[] args) {
        Console console = new Console(System.in, System.out);
        LoginMenu loginMenu = new LoginMenu(console);
        loginMenu.runLoginMenu();
    }
}