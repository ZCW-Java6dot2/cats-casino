package io.zipcoder.casino;


import io.zipcoder.casino.utilities.Console;
import menus.LoginMenu;
import player.Account;
import player.Accounts;


public class Casino {
    public static void main(String[] args) {
        // write your tests before you start

        Console console = new Console(System.in, System.out);
        Accounts accounts = preLoadAccounts(console);
        LoginMenu loginMenu = new LoginMenu(console, accounts);
        loginMenu.runLoginMenu();

    }

    public static Accounts preLoadAccounts (Console console){
        Accounts accounts = new Accounts(console);
        Account preAccountOne = new Account(console, "Kyle", "2020");
        accounts.getListOfAccounts().add(preAccountOne);
        Account preAccountTwo = new Account(console, "Amanda", "345");
        accounts.getListOfAccounts().add(preAccountTwo);
        Account preAccountThree = new Account(console, "Pompy", "123");
        accounts.getListOfAccounts().add(preAccountThree);
        return accounts;
    }

}

