package player;


import io.zipcoder.casino.utilities.Console;
import org.junit.Assert;
import org.junit.Test;

public class AccountTest {
    @Test
    public void accountConstructorTest(){
        //given
        Console expectedConsole = new Console(null, null);
        Integer expectedBalance = 150;
        Account account = new Account(null);
        //when
        //then
    }

    @Test
    public void getBalanceTest(){
        //given
        Account newAccount = new Account(null);
        Integer expectedBalance = 30;
        //when
        newAccount.setBalance(expectedBalance);
        Integer actualBalance = newAccount.getBalance();
        //then
        Assert.assertEquals(expectedBalance, actualBalance);
    }
}

