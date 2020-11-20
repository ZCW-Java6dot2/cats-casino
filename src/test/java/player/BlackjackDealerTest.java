package player;

import org.junit.Assert;
import org.junit.Test;
import player.FatCatDealer.BlackjackDealer;

public class BlackjackDealerTest {
    @Test
    public void checkBlackjackTest(){
        //given
        //when
        BlackjackDealer blackjackDealer = new BlackjackDealer();
        //then
        Assert.assertFalse(blackjackDealer.checkBlackjack());
    }
    @Test
    public void toStringTest(){
        //given
        BlackjackDealer blackjackDealer = new BlackjackDealer();
        String expectedString = "Fat Cat's cards are:  \n" +
                "Fat Cat's score is:  0";
        //when
        String actualString = blackjackDealer.toString();
        //then
        Assert.assertEquals(expectedString, actualString);
    }

}