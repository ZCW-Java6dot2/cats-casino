package menus;

import io.zipcoder.casino.Casino;
import io.zipcoder.casino.utilities.Console;
import junit.framework.TestCase;

import java.io.ByteArrayInputStream;


public class MenuTests extends TestCase {

    public void testRunLoginMenu() {

        String expectedInput = "1\nKyle\n2020\n4\n3\n";
        System.setIn(new ByteArrayInputStream(expectedInput.getBytes()));

        Console console = new Console(System.in, System.out);
        LoginMenu loginMenu = new LoginMenu(console);
        String output = loginMenu.runLoginMenu();
        assertEquals("Closing casino!", output);
    }

    public void testCreateAccountWithMenu() {
        String expectedInput = "2\nbob\n20\n4\n4\n3\n";
        System.setIn(new ByteArrayInputStream(expectedInput.getBytes()));

        Console console = new Console(System.in, System.out);
        LoginMenu loginMenu = new LoginMenu(console);
        String output = loginMenu.runLoginMenu();
        assertEquals("Closing casino!", output);
    }

//    public void testDepositFunds() {
//        String expectedInput = "2\nPeter\npass\n1\n1\n1000\n3\n4\n3\n";
//        System.setIn(new ByteArrayInputStream(expectedInput.getBytes()));
//
//        Console console = new Console(System.in, System.out);
//        Accounts preLoadedAccounts = Casino.preLoadAccounts(console);
//        LoginMenu loginMenu = new LoginMenu(console, preLoadedAccounts);
//        String output = loginMenu.runLoginMenu();
//        assertEquals("Closing casino!", output);
//    }
//
//    public void testRunMainMenu() {
//    }
//
//    public void testRunCardGamesMenu() {
//    }
//
//    public void testRunDiceGamesMenus() {
//    }
//
//    public void testRunPlayerMenu() {
//    }
//
//    public void testLoginMenuSwitch() {
//    }
}