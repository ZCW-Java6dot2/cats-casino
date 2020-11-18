package games.cardgames;

//TODO implement comparable interface
public class Card extends DeckOfCards implements Comparable<Card> {
    private CardSuits cardSuits;
    private CardValues cardValues;

    public Card(CardSuits cardSuits, CardValues cardValues) {
        this.cardSuits = cardSuits;
        this.cardValues = cardValues;
    }

    public String toString() {
        return this.cardSuits.toString() + " " + this.cardValues.toString();
    }
    public CardValues getCardValue() {
        return this.cardValues;
    }
    //Comparing cards for the games
    public int compareTo(Card o) {
        return 0;
    }

}
