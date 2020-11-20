package player;


import io.zipcoder.casino.utilities.Console;
import org.junit.Assert;
import org.junit.Test;

public class AccountTest {

    @Test
    public void getBalanceTest(){
        //given
        Console console = new Console(System.in, System.out);
        Account newAccount = new Account(console);
        Integer expectedBalance = 30;
        //when
        newAccount.setBalance(expectedBalance);
        Integer actualBalance = newAccount.getBalance();
        //then
        Assert.assertEquals(expectedBalance, actualBalance);
    }
}

