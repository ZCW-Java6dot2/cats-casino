package games.cardgames;

//TODO implement comparable interface
public class Card extends DeckOfCards implements Comparable<Card> {
    private CardSuitesForBlackjack cardSuitesForBlackjack;
    private CardValuesForBlackjack cardValuesForBlackjack;

    public Card(CardSuitesForBlackjack cardSuitesForBlackjack, CardValuesForBlackjack cardValuesForBlackjack) {
        this.cardSuitesForBlackjack = cardSuitesForBlackjack;
        this.cardValuesForBlackjack = cardValuesForBlackjack;
    }

    //Comparing cards for the games
    public int compareTo(Card o) {
        return 0;
    }

}
