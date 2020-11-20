package io.zipcoder.casino;


import games.cardgames.BlackjackGame;
import io.zipcoder.casino.utilities.Console;
import menus.LoginMenu;
import player.Account;
import player.BlackjackPlayer;
import player.FatCatDealer.BlackjackDealer;


public class Casino {

    public static void main(String[] args) {


        Console console = new Console(System.in, System.out);
        console = console;
        BlackjackPlayer player = new BlackjackPlayer(console, "pompy", "1234", new Account(console));
        BlackjackDealer fatCat = new BlackjackDealer();
//        LoginMenu loginMenu = new LoginMenu(console);
//        loginMenu.runLoginMenu();
        BlackjackGame blackjackGame = new BlackjackGame();



    }

}

