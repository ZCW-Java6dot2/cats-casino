package games.cardgames;

import interfaces.GamblingGame;
import interfaces.Game;
import io.zipcoder.casino.utilities.Console;
import menus.CardGameMenu;
import player.Account;
import player.BlackjackPlayer;
import player.FatCatDealer.BlackjackDealer;

import java.util.ArrayList;

public class BlackjackGame implements Game, GamblingGame {
    private Console console;
    private DeckOfCards deck = new DeckOfCards();
    private BlackjackPlayer player;
    private BlackjackDealer fatCat;
    private Integer playersBet;
    private boolean stillPlaying;
    private Integer input;
    Integer makeDecision;
    private CardGameMenu cardGameMenu;
    private Account currentAccount;


    public BlackjackGame(BlackjackPlayer player, BlackjackDealer fatCat, Console console) {
        this.player = player;
        this.currentAccount = player.getPlayersAccount();
        this.fatCat = fatCat;
        this.playersBet = 0;
        this.stillPlaying = true;
        this.console = console;
    }

    public DeckOfCards getDeck() {
        return deck;
    }

    public void drawCardPlayer() {
        player.hit(deck.getCard());
    }

    public void drawCardDealer() {
        fatCat.hit(deck.getCard());
    }

    public int getScorePlayer() {
        return player.getScore();
    }

    public int getScoreDealer() {
        return fatCat.getScore();
    }

    public boolean bustPlayer() {
        if (getScorePlayer() > 21) {
            return true;
        }
        return false;
    }

    public boolean bustDealer() {
        if (getScoreDealer() > 21) {
            return true;
        }
        return false;
    }

    public Integer getPlayerBet() {
        if (currentAccount.getBalance() == 0) {
            //insert something here
        }
        playersBet = console.getIntegerInput("You have $" + currentAccount + ", how much would you like to bet?");
        while (playersBet > currentAccount.getBalance() || playersBet < 1) {
            playersBet = console.getIntegerInput("Please enter a valid bet.");
        }
        return playersBet;
    }

    public void placeBet() {
        currentAccount.setBalance(player.getPlayersAccount().getBalance() - playersBet);
    }

    public void winnings(Integer playersBet) {
        currentAccount.setBalance(currentAccount.getBalance() + playersBet * 2);

    }

    public void push(Integer playersBet) {
        currentAccount.setBalance(currentAccount.getBalance() + playersBet);
    }

    public void setPlayerHand() {
        player.getHand().add(deck.getCard());
        player.getHand().add(deck.getCard());
    }

    public ArrayList<Card> getPlayerHand() {
        return player.getHand();
    }

    public void setDealerHand() {
        fatCat.getHand().add(deck.getCard());
        fatCat.getHand().add(deck.getCard());
    }

    public Boolean checkBlackjack() {
        if (this.fatCat.checkBlackjack() && this.player.checkBlackjack()) {
            console.println("Push! You both got Blackjack.\n");
            push(playersBet);
            return true;
        }
        if (this.fatCat.checkBlackjack() && !this.player.checkBlackjack()) {
            console.println("You lost! Fat Cat got Blackjack.\n");
            return true;
        }
        if (!this.fatCat.checkBlackjack() && this.player.checkBlackjack()) {
            console.println("You win! Player got Blackjack.\n");
            winnings(playersBet);
            return true;
        }
        return false;
    }

    public void startGame() {
        //TODO
        // console.println(String.format("Welcome to ", getGameName(gameName), "!"));

        while (stillPlaying) {
            deck.createDeck();
            deck.shuffleDeck();
            setPlayerHand();
            setDealerHand();

            input = console.getIntegerInput("Would you like to play a hand or leave? \n1: Play a hand \n2: Leave the game\n");
            while (input != 1 && input != 2) {
                input = console.getIntegerInput("Would you like to play a hand or leave? \n1: Play a hand \n2: Leave the game\n");
            }
            if (input == 2) {
                cardGameMenu.runCardGameMenu(player);
            } else {
                getPlayerBet();
                placeBet();
            }

            console.println(fatCat.fatCatFaceUpCard() + "\n");
            console.println(getPlayerHand().toString() + "\n");

            if (checkBlackjack()) {
                continue;
            }


            makeDecision = console.getIntegerInput("\n1: Hit \n2: Stay");
            while (player.getScore() <= 21) {
                while (makeDecision != 1 && makeDecision != 2) {
                    makeDecision = console.getIntegerInput("\n1: Hit \n2: Stay");
                }
                if (makeDecision == 1) {
                    drawCardPlayer();
                    console.println(getPlayerHand().toString() + "\n");
                    if (player.getScore() <= 21) {
                        makeDecision = console.getIntegerInput("\n1: Hit \n2: Stay");
                    }

                    if (bustPlayer()) {
                        console.println("You busted!");
                        player.getHand().clear();
                        fatCat.getHand().clear();
                        break;
                    }
                }
                if (makeDecision == 2) {
                    console.println(player.toString());
                    console.println(fatCat.toString());
                    while (fatCat.getScore() < 17) {
                        drawCardDealer();
                        console.println(fatCat.toString() + "\n");
                        break;
                    }

                    if (bustDealer()) {
                        console.println("Fat Cat Busted. You win!");
                        winnings(playersBet);
                        player.getHand().clear();
                        fatCat.getHand().clear();
                        break;
                    }
                    if (fatCat.getScore() > player.getScore()) {
                        console.println("Fat Cat Wins!");
                        player.getHand().clear();
                        fatCat.getHand().clear();
                        break;
                    }
                    if (fatCat.getScore() < player.getScore()) {
                        console.println("You win!");
                        winnings(playersBet);
                        player.getHand().clear();
                        fatCat.getHand().clear();
                        break;
                    } else {
                        console.println("You pushed!");
                        push(playersBet);
                        player.getHand().clear();
                        fatCat.getHand().clear();
                        break;
                    }
                }
            }
        }
    }
}