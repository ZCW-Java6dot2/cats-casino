package menus;

import io.zipcoder.casino.utilities.Console;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import player.Player;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class LoginMenuTest extends TestCase {

    @Before
    public void setUp() {
//        LoginMenu loginMenu = new LoginMenu();
    }

    @After
    public void tearDown() throws Exception {
    }

    public void testRunMainMenu() {
    }

    public void testRunCardGamesMenu() {
    }

    public void testRunDiceGamesMenus() {
    }

    public void testRunPlayerMenu() {
    }

    public void testRunLoginMenu() {

        String expectedInput = "1\n1\n4\n3\n";
        System.setIn(new ByteArrayInputStream(expectedInput.getBytes()));

        Console console = new Console(System.in, System.out);
        LoginMenu loginMenu = new LoginMenu(console);
        String output = loginMenu.runLoginMenu();
        assertEquals("Closing casino!", output);
    }

    public void testLoginMenuSwitch() {
    }
}