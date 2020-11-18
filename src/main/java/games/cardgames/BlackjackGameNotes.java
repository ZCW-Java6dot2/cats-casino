package games.cardgames;

import io.zipcoder.casino.utilities.Console;
import player.Account;

import java.sql.SQLOutput;

public class BlackjackGameNotes {
    private final CardValues cardValues;
    player.Account playersAccount;
    Console console;

//    public Account(String username, String password) {
//        this.username = username;
//        this.password = password;
//        this.balance = 0;
//    }

    public BlackjackGameNotes(Console console) {
        this.console = console;
    }
    public BlackjackGame(CardValues cardValues) {
        this.cardValues = cardValues;
    }
    public void startGame(String gameName) {

//TODO        console.println(String.format("Welcome to ", getGameName(gameName), "!"));

        //Create playing deck
        DeckOfCards playingDeck = new DeckOfCards();
        playingDeck.createFullDeck();
        playingDeck.shuffleDeck();

        //Create a hand for the player
        DeckOfCards playerHand = new DeckOfCards();
        DeckOfCards dealerHand = new DeckOfCards();

        Integer Account = playersAccount.getBalance();

        Scanner userInput = new Scanner(System.in);

        //Game Loop
        while (playersAccount > 0) {
            // Take the players bet
            System.out.println("You have $" + playersAccount + ", how much would you like to bet?");
            Integer playersbet = userInput.nextInteger();
            if (playersbet > playersAccount) {
                System.out.println("You cannot bet more than you have. Try again.");
                break;
            }
            //Deal cards
            playerHand.dealCard(playingDeck);
            playerHand.dealCard(playingDeck);
            dealerHand.dealCard(playingDeck);
            dealerHand.dealCard(playingDeck);

            while (true) {
                System.out.println("Your hand:  " + playingDeck.toString());
                System.out.println("Your hand is valued at:  " + playerHand.handValue());
                System.out.println("");
            }


        }


    }
}