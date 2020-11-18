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

        Integer account = playersAccount.getBalance();

        Scanner userInput = new Scanner(System.in);

        //Game Loop
        while (account > 0) {
            // Take the players bet
            System.out.println("You have $" + account + ", how much would you like to bet?");
            Integer playersBet = userInput.nextInteger();
            if (playersBet > account) {
                System.out.println("You cannot bet more than you have. Try again.");
                break;
            }

            boolean endHand = false;

            //Deal cards
            playerHand.dealCard(playingDeck);
            playerHand.dealCard(playingDeck);
            dealerHand.dealCard(playingDeck);
            dealerHand.dealCard(playingDeck);

            while (true) {
                //Display player hand
                System.out.println("Your hand:  " + playerHand.toString());
                System.out.println("Your hand is valued at:  " + playerHand.handValue());

                //Display dealer hand
                System.out.println("Dealer hand:  " + dealerHand.getCard(0).toString() + " and [Hidden]");

                //What does the player want to do?
                System.out.println("Would you like to (1)Hit or (2)Stand ?");
                int response = userInput.nextInt();

                //They Hit
                if(response == 1){
                    playerHand.dealCard(playingDeck);
                    System.out.println("You draw a:  " + playerHand.getCard(playerHand.deckSize()-1).toString());
                    //Bust if >21
                    if(playerHand.handValue() > 21){
                        System.out.println("Bust! Your hand is over 21.");
                        account -= playersBet;
                        endHand = true;
                        break;
                    }
                }
                //If player chooses to Stand
                if (response == 2){
                    break;
                }
            }
            //Reveal dealer card
            System.out.println("Dealer Cards:  " + dealerHand.toString());

            //See if dealer beats player
            if((dealerHand.handValue() > playerHand.handValue()) && endHand == false) {
                System.out.println("Fat Cats Win!! You lose!");
                account -= playersBet;
                endHand = true;
            }
            while((dealerHand.handValue() < 17) && endHand == false )  {
                dealerHand.dealCard(playingDeck);
                System.out.println("Dealer hits:" + dealerHand.getCard(dealerHand.deckSize() - 1).toString());
            }
            System.out.println("Dealer's hand is valued at:  " + dealerHand.handValue());
            if((dealerHand.handValue() > 21) && endHand == false) {
                System.out.println("Dealer Busts! You win.");
                account += playersBet;
                endHand = true;
            }
            if((playerHand.handValue()) == dealerHand.handValue() && endHand == false) {
                System.out.println("Push!");
                endHand = true;
            }
            if((playerHand.handValue() > dealerHand.handValue()) && endHand == false) {
                System.out.println("You win!");
                account += playersBet;
                endHand = true;
            }
            else if(endHand == false) {
                System.out.println("You lose!");
                account -= playersBet;
                endHand = true;
            }
            playerHand.moveAllToDeck(playingDeck);
            dealerHand.moveAllToDeck(playingDeck);
            System.out.println("End of hand.");
        }

    }
}