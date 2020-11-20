package games.cardgames;

import io.zipcoder.casino.utilities.Console;
import javafx.print.PageLayout;
import org.junit.Assert;
import org.junit.Test;
import player.Account;
import player.BlackjackPlayer;
import player.FatCatDealer.BlackjackDealer;
//import player.Player;
//
//import java.util.ArrayList;
//
//public class BlackjackGameTest {
//    @Test
//    public void blackjackGameConstructorTest() {
//        //given
//        Console console = new Console(System.in, System.out);
//        BlackjackDealer dealer = new BlackjackDealer();
//        BlackjackPlayer player = new BlackjackPlayer(console, "amandaW", "C00lc0d3", new Account(console));
//        //when
//        BlackjackGame blackjackGame = new BlackjackGame(player, dealer, console);
//        //then
//        Assert.assertFalse(blackjackGame.checkBlackjack());
//        Assert.assertFalse(blackjackGame.bustDealer());
//        Assert.assertFalse(blackjackGame.bustPlayer());
//        Assert.assertEquals(new ArrayList<Card>(), blackjackGame.getPlayerHand());
//        Assert.assertEquals(0, blackjackGame.getPlayerBet(), 0);
//        Assert.assertEquals(0, blackjackGame.getScoreDealer());
//        Assert.assertEquals(0, blackjackGame.getScorePlayer());
//    }
//}