package io.zipcoder.casino;
import io.zipcoder.casino.utilities.Console;
import menus.LoginMenu;

public class Casino {
    public static void main(String[] args) {
        Console console = new Console(System.in, System.out);
        LoginMenu loginMenu = new LoginMenu(console);
        loginMenu.runLoginMenu();
    }
}