package games.cardgames;


import interfaces.GamblingGame;
import interfaces.Game;
import io.zipcoder.casino.utilities.Console;
import player.Dealer;
import player.Player;

import java.util.ArrayList;

public class BlackjackGame extends CardGame implements Game, GamblingGame {
    Console console;
    private ArrayList<Card> cards;
    private Integer integer;

    public BlackjackGame(Console console) {
        this.console = console;
    }

    public BlackjackGame(ArrayList<Card> deck) {
        this.cards = deck;
    }

    public BlackjackGame(Integer integer) {
        this.integer = integer;
    }

    //TODO:
    Dealer dealer = new Dealer();


    public void addPlayer(Player player) {

    }

    public void removePlayer(Player player) {

    }

    public void startGame() {

    }


    public void endGame() {

    }

    public String results(ArrayList<java.lang.Integer> scores) {
        return null;
    }

    public void startPlayersTurn() {

    }

    public void finishTurn() {

    }

    public java.lang.Integer getPlayerBet() {
        return null;
    }

    public java.lang.Integer payWinnings() {
        return null;
    }


    // taking a new card from the stake into player's array of cards
    public Card hit() {
        return null;
    }

    // taking no more cards into player's array of cards continue game until winner is found
    public Boolean stand() {
        return null;
    }
    // taking a new card from the stack into the player's array of cards & doubling player's current bet & only hitting 1x
    public Card doubleDown(java.lang.Integer bet) {
        return null;
    }



    public Card split() {
        return null;
    }
}
