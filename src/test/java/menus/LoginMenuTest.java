package menus;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import player.Player;

public class LoginMenuTest extends TestCase {

    @Before
    public void setUp() {
        LoginMenu loginMenu = new LoginMenu();
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
        LoginMenu loginMenu = new LoginMenu();
        Integer expectedInt = 3;
        Integer actualInt;
        loginMenu.runLoginMenu();

    }

    public void testLoginMenuSwitch() {
    }
}