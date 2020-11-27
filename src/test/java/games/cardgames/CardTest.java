package games.cardgames;

import org.junit.Assert;
import org.junit.Test;

public class CardTest {
    @Test
    public void cardConstructorTest(){
        //given
        String cardSuit = "";
        Integer cardValue = 0;
        //when
        Card card = new Card(cardSuit, cardValue);
        //then
        Assert.assertNotEquals("0", card.getValue());
        Assert.assertNotEquals("0", card.getSuit());
        Assert.assertEquals("error", card.toString());
    }
}