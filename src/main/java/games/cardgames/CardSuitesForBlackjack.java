package games.cardgames;

public enum CardSuitesForBlackjack {
    HEARTS("♥"), SPADES("♠"), DIAMONDS("♦"), CLUBS("♣");

    String suiteText;

    CardSuitesForBlackjack(String suiteText) {
        this.suiteText = suiteText;
    }
}
