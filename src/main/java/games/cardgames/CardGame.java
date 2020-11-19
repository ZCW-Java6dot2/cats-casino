package games.cardgames;


import menus.CardGameMenu;

import java.util.ArrayList;
import java.util.Collections;

public class CardGame {


    //TODO
    CardGameMenu cardGameMenu = new CardGameMenu();

    //Make card games do setup logic for BlackJack video

    public void startGame(String gameName) {

//TODO        console.println(String.format("Welcome to ", getGameName(gameName), "!"));

        //Create playing deck
        DeckOfCards playingDeck = new DeckOfCards();
        playingDeck.createFullDeck();
        playingDeck.shuffleDeck();

        //Test Print
        // console.print(playingDeck.toString());
    }

}
