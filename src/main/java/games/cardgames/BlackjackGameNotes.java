package games.cardgames;

import io.zipcoder.casino.utilities.Console;

import java.util.InputMismatchException;

public class BlackjackGameNotes {
    private Integer integer;
    player.Account playersAccount;
    Console console;




    public BlackjackGameNotes(Console console) {
        this.console = console;
    }

    public void BlackjackGame(Integer integer) {
        this.integer = integer;
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

        java.lang.Integer account = playersAccount.getBalance();


        //Game Loop
        while (account > 0) {
            // Take the players bet
            java.lang.Integer playersBet = console.getIntegerInput("You have $" + account + ", how much would you like to bet?");
            if (playersBet > account) {
                console.println("You cannot bet more than you have. Try again.");

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
                console.println("Your hand:  " + playerHand.toString());
                console.println("Your hand is valued at:  " + playerHand.handValue());

                //Display dealer hand
                console.println("Fat Cats hand:  " + dealerHand.getCard(0).toString() + " and [Hidden]");

                //What does the player want to do?
                try {
                    int response = console.getIntegerInput("Would you like to (1)Hit or (2)Stand ?");

                    //They Hit
                    switch (response) {
                        case 1:
                            playerHand.dealCard(playingDeck);
                            console.println("You draw a:  " + playerHand.getCard(playerHand.deckSize() - 1).toString());
                            //Bust if >21
                            if (playerHand.handValue() > 21) {
                                console.println("Bust! Your hand is over 21.");
                                account -= playersBet;
                                endHand = true;
                                break;
                            }
                            //If player chooses to Stand
                        case 2:
                            break;
                    }
                } catch (InputMismatchException e) {
                    console.getIntegerInput("\n" + "Not a valid move. Select from: (1)Hit or (2)Stand)");
                }
                //Reveal dealer card
                console.println("Fat Cats Cards:  " + dealerHand.toString());

                //See if dealer beats player
                if ((dealerHand.handValue() > playerHand.handValue()) && endHand == false) {
                    console.println("Fat Cats Win!! You lose!");
                    account -= playersBet;
                    endHand = true;
                }
                while ((dealerHand.handValue() < 17) && endHand == false) {
                    dealerHand.dealCard(playingDeck);
                    console.println("Fat Cats hit:  " + dealerHand.getCard(dealerHand.deckSize() - 1).toString());
                }
                console.println("Fat Cats' hand is valued at:  " + dealerHand.handValue());
                if ((dealerHand.handValue() > 21) && endHand == false) {
                    console.println("Fat Cats Bust! You win.");
                    account += playersBet;
                    endHand = true;
                }
                if ((playerHand.handValue()) == dealerHand.handValue() && endHand == false) {
                    console.println("Push!");
                    endHand = true;
                }
                if ((playerHand.handValue() > dealerHand.handValue()) && endHand == false) {
                    console.println("You win!");
                    account += playersBet;
                    endHand = true;
                } else if (endHand == false) {
                    console.println("You lose!");
                    account -= playersBet;
                    endHand = true;
                }
                playerHand.moveAllToDeck(playingDeck);
                dealerHand.moveAllToDeck(playingDeck);
                console.println("End of hand.");
            }

        }
    }
}