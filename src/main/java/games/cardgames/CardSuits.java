package games.cardgames;

public enum CardSuits {
    HEARTS("♥"), SPADES("♠"), DIAMONDS("♦"), CLUBS("♣");

    String suiteText;

    CardSuits(String suiteText) {
        this.suiteText = suiteText;
    }
}
