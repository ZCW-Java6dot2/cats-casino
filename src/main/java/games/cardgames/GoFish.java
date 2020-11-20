package games.cardgames;


import interfaces.Game;
import io.zipcoder.casino.utilities.Console;
import player.Account;
import player.BlackjackPlayer;
import player.FatCatDealer.BlackjackDealer;
import player.FatCatDealer.GoFishDealer;
import player.GoFishPlayer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class GoFish implements Game {
    private DeckOfCards deck = new DeckOfCards();
    private GoFishPlayer player;
    private GoFishDealer fatCat;
    boolean stillPlaying;
    private Console console;
    ArrayList<Card> cardsToRemove = new ArrayList<Card>();

    public GoFish(GoFishPlayer player, GoFishDealer fatCat, Console console) {
        this.player = player;
        this.fatCat = fatCat;
        this.stillPlaying = true;
        this.console = console;
    }
    public void playerDraw() {
        player.draw(deck.getCard());
    }
    public void fatCatDraw() {
        fatCat.draw(deck.getCard());
    }
    public void playersHand() {
        for(int i = 0; i < 7; i++) {
            playerDraw();
        }
    }
    public void fatCatHand() {
        for(int i = 0; i < 7; i++) {
            fatCatDraw();
        }
    }
    public void showPlayerHand() {
        int handSize = player.getPlayerHand().size();
        for(int i = 0; i < handSize; i++) {
            console.print(player.getPlayerHand().get(i).toString());
        }
    }
    public boolean checkPlayerHand(Integer cardValue) {
        for(Card card: player.getPlayerHand()) {
            if(card.getValue().equals(cardValue)) {
                return true;
            }
        }
        return false;
    }
    public boolean checkFatCatHand(Integer cardValue) {
        for(Card card: fatCat.getFatCatHand()) {
            if(card.getValue().equals(cardValue)) {
                return true;
            }
        }
        return false;
    }
    public void takeFatCatCards(Integer cardValue) {
        for(Card card: fatCat.getFatCatHand()) {
            if(card.getValue().equals(cardValue)) {
                cardsToRemove.add(card);
            }
        }
        fatCat.getFatCatHand().removeAll(cardsToRemove);
        cardsToRemove.clear();
    }
    public void takePlayerCards(Integer cardValue) {
        for(Card card: player.getPlayerHand()) {
            if(card.getValue().equals(cardValue)) {
                cardsToRemove.add(card);
            }
        }
        player.getPlayerHand().removeAll(cardsToRemove);
        cardsToRemove.clear();
    }
    public void sortPlayerHand() {
        Collections.sort(player.getPlayerHand());
    }
    public void sortFatCatHand() {
        Collections.sort(fatCat.getFatCatHand());
    }
    public boolean checkWin() {
        if((player.getPlayerScore() + fatCat.getFatCatScore()) == 13) {
            return true;
        }
        return false;
    }
    public Integer fatCatFish() {
        Random random = new Random();
        return fatCat.getFatCatHand().get(random.nextInt(fatCat.getFatCatHand().size())).getValue();
    }
    public void playerTurn() {
        Integer fish = console.getIntegerInput("What are you fishing for?");
        if(fish.equals(0)) {
            ///return to card game menu
        }
        while (!checkPlayerHand(fish)) {
            console.println("You aren't holding that! You must ask for a card you have.");
            fish = console.getIntegerInput("What are you fishing for?");
        }
        if(checkFatCatHand(fish)) {
            console.println("You caught something!");
            takeFatCatCards(fish);
            sortPlayerHand();
            sortFatCatHand();
            player.addScore();
            showPlayerHand();
        }
        else if(!checkFatCatHand(fish)) {
            if(!deck.isEmpty()) {
                player.draw(deck.getCard());
            }
            console.println("GO FISH!\n You draw a card and add it to your hand");
            sortPlayerHand();
            sortFatCatHand();
            player.addScore();
            showPlayerHand();
        }
    }
    public void fatCatTurn() {
        Integer fish = fatCatFish();
        if(checkPlayerHand(fish)) {
            takePlayerCards(fish);
            console.println("Fat Cat is fishing for: " + fish);
            console.println("Fat Cat always was a good fisher he grabbed your " + fish);
            sortFatCatHand();
            sortPlayerHand();
            fatCat.addScore();
            showPlayerHand();
        }
        else if(!checkPlayerHand(fish)) {
            if(!deck.isEmpty()) {
                fatCat.draw(deck.getCard());
            }
            console.println("You avoided Fat Cat this time!");
            sortPlayerHand();
            sortFatCatHand();
            fatCat.addScore();
        }
    }
    public void startGame() {
        boolean stillPlaying = true;
        console.println("Welcome to Fat Cat's Go Fish!");
        deck.createDeck();
        deck.shuffleDeck();
        playersHand();
        fatCatHand();
        sortFatCatHand();
        sortPlayerHand();
        console.println("To fish for cards use 1 for Aces, 11 for Jack, 12 for Queen and 13 for King");
        console.println("Here is your starting hand:");
        showPlayerHand();

        while(stillPlaying) {
            playerTurn();
            fatCatTurn();
            console.println(fatCat.printFatCatScore() + "\n" + player.printPlayerScore());
            if(deck.isEmpty() || checkWin()) {
                if(player.getPlayerScore() > fatCat.getFatCatScore()) {
                    console.println("You win!");
                    break;
                }
                else
                    console.println("Cat got your tongue??? You lose!");
                break;
            }
        }
  }
}
