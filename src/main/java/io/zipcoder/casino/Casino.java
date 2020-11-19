package io.zipcoder.casino;


import io.zipcoder.casino.utilities.Console;
import menus.LoginMenu;


public class Casino {
    public static void main(String[] args) {


        Console console = new Console(System.in, System.out);
        LoginMenu loginMenu = new LoginMenu(console);
        loginMenu.runLoginMenu();

    }


//    preLoadAccounts(console)
//    public static Players preLoadAccounts (Console console){
//        Players players = new Players(console);
//        Player prePlayerOne = new Player(console,"Kyle", "2020", new Account(console));
//        players.addPreexistingPlayers(prePlayerOne);
//        Player prePlayerTwo = new Player(console,"Peter", "2020", new Account(console));
//        players.addPreexistingPlayers(prePlayerTwo);
//        Player prePlayerThree = new Player(console,"Shubham", "266", new Account(console));
//        players.addPreexistingPlayers(prePlayerThree);
//        Player prePlayerFour = new Player(console,"Amanda", "345", new Account(console));
//        players.addPreexistingPlayers(prePlayerFour);
//        Player prePlayerFive = new Player(console,"Pompy", "123", new Account(console));
//        players.addPreexistingPlayers(prePlayerFive);
//
//        return players;
//    }

}

