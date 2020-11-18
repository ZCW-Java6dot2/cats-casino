package games.cardgames;

public class BlackjackGameNotes {

}

    public void startGame(String gameName) {

//TODO        console.println(String.format("Welcome to ", getGameName(gameName), "!"));

        //Create playing deck
        DeckOfCards playingDeck = new DeckOfCards();
        playingDeck.createFullDeck();
        playingDeck.shuffleDeck();
    }

    //Create a hand for the player
    DeckOfCards playerHand = new DeckOfCards();
    DeckOfCards dealerHand = new DeckOfCards();

    Integer Account =


}