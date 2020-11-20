package games.cardgames;

import io.zipcoder.casino.utilities.Console;
import org.junit.Assert;
import org.junit.Test;
import player.FatCatDealer.GoFishDealer;
import player.GoFishPlayer;

public class GoFishTest {
    @Test
    public void goFishConstructorTest(){
        //given
        Console console = new Console(System.in, System.out);
        GoFishPlayer player = new GoFishPlayer(console, null, null, null);
        GoFishDealer dealer = new GoFishDealer();
        //when
        GoFish goFish = new GoFish(player, dealer, console);
        //then
        Assert.assertTrue(goFish.stillPlaying);
        Assert.assertFalse(goFish.checkPlayerHand(0));
        Assert.assertFalse(goFish.checkFatCatHand(0));
        Assert.assertFalse(goFish.checkWin());
    }

}