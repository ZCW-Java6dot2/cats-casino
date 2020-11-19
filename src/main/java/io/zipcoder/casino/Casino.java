package io.zipcoder.casino;


import games.dicegames.SnakeEyes;
import io.zipcoder.casino.utilities.Console;
import menus.LoginMenu;
import player.Account;
import player.Accounts;


public class Casino {
    public static void main(String[] args) {


        Console console = new Console(System.in, System.out);
        SnakeEyes snakeEyes = new SnakeEyes(console);
        snakeEyes.startGame();


    }

    public static Accounts preLoadAccounts (Console console){
        Accounts accounts = new Accounts(console);
        Account preAccountOne = new Account(console, "Kyle", "2020");
        accounts.getListOfAccounts().add(preAccountOne);
        Account preAccountTwo = new Account(console, "Peter", "2020");
        accounts.getListOfAccounts().add(preAccountOne);
        Account preAccountThree = new Account(console, "Shubham", "266");
        accounts.getListOfAccounts().add(preAccountOne);
        Account preAccountFour = new Account(console, "Amanda", "345");
        accounts.getListOfAccounts().add(preAccountTwo);
        Account preAccountFive = new Account(console, "Pompy", "123");
        accounts.getListOfAccounts().add(preAccountThree);

        return accounts;
    }

}

