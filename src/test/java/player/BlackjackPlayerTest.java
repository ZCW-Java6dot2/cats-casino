package player;

import org.junit.Assert;
import org.junit.Test;

public class BlackjackPlayerTest {
    @Test
    public void getScoreTest() {
        //given
        int expectedScore = 0;
        BlackjackPlayer blackjackPlayer = new BlackjackPlayer(null, null, null, null);
        int aceCounter = 0;
        //when
        int actualScore = blackjackPlayer.getScore();
        //then
        Assert.assertEquals(expectedScore, actualScore);
    }

    @Test
    public void toStringTest() {
        //given
        BlackjackPlayer blackjackPlayer = new BlackjackPlayer(null, "Player1", "qwerty", null);
        String expectedString = "Your cards are:  \n" + "Your score is:  0";
        //when
        String actualString = blackjackPlayer.toString();
        //then
        Assert.assertEquals(expectedString, actualString);
    }
}

