package player;

import io.zipcoder.casino.utilities.Console;
import org.junit.Assert;
import org.junit.Test;

public class PlayerTest {

    Console console = new Console(System.in, System.out);
    @Test
    public void getUsernameTest() {
        //given
        String expectedUsername = "amandaW";
        Player amanda = new Player(null, expectedUsername, null, null);
        //when
        amanda.setUsername(expectedUsername);
        String actualUsername = amanda.getUsername();
        //then
        Assert.assertEquals(expectedUsername, actualUsername);
    }

    @Test
    public void getPasswordTest() {
        //given
        String expectedPassword = "coder1";
        Player amanda = new Player(console, null, expectedPassword, null);
        //when
        amanda.setPassword(expectedPassword);
        String actualPassword = amanda.getPassword();
        //then
        Assert.assertEquals(expectedPassword, actualPassword);
    }

//    @Test
//    public void changeUsername() {
//        //given
//        String expectedPreChangeUsername = "amandaW";
//        Player amanda = new Player(console, expectedPreChangeUsername, null, null);
//        String expectedPostChangeUsername = "QueenOfTheWorld";
//        //when
//        String actualPreChangeUsername = amanda.getUsername();
//        amanda.setUsername(expectedPostChangeUsername);
//        amanda.changeUsername();
//        String actualPostChangeUsername = amanda.getUsername();
//        //then
//        Assert.assertEquals(expectedPreChangeUsername, actualPreChangeUsername);
//        Assert.assertEquals(expectedPostChangeUsername, actualPostChangeUsername);
//    }
//
//    @Test
//    public void changePassword(){
//        //given
//        String expectedPreChangePassword = "coder1";
//        Player amanda = new Player(console, null, expectedPreChangePassword, null);
//        String expectedPostChangePassword = "c0d3r1";
//        //when
//        String actualPreChangePassword = amanda.getPassword();
//        amanda.setPassword(expectedPostChangePassword);
//        amanda.changePassword();
//        String actualPostChangePassword = amanda.getPassword();
//        //then
//        Assert.assertEquals(expectedPreChangePassword, actualPreChangePassword);
//        Assert.assertEquals(expectedPostChangePassword, actualPostChangePassword);
//    }
//
//    @Test
//    public void depositFunds(){
//        //given
//        Player player = new Player(console, null, null, null);
//        Account account = new Account(console);
//        account.setBalance(0);
//        Integer expectedPreDepositTotal = account.getBalance();
//        Integer expectedPostDepositTotal = 150;
//        //when
//        Integer actualPreDepositTotal = account.getBalance();
//        player.depositFunds();
//        Integer actualPostDepositTotal = account.getBalance();
//        //then
//        Assert.assertEquals(expectedPreDepositTotal, actualPreDepositTotal);
//        Assert.assertEquals(expectedPostDepositTotal, actualPostDepositTotal);
//    }
}