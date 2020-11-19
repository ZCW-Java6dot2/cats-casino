package games.cardgames;

import interfaces.GamblingGame;
import interfaces.Game;
import io.zipcoder.casino.utilities.Console;
import player.FatCatDealer.BlackjackDealer;
import player.Player;

import java.util.ArrayList;

public class Blackjack implements Game, GamblingGame {








    public void startGame() {
        console.println("Welcome to BlackJack!");

        //Create playing deck
        DeckOfCards playingDeck = new DeckOfCards();
 //       playingDeck.createFullDeck();
        playingDeck.shuffleDeck();

        //Test Print
      // console.print(playingDeck.toString());
    }





}
