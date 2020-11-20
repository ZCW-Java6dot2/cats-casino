package games.cardgames;

public class Card implements Comparable<Card> {
    private String cardSuits;
    private Integer cardValue;

    public Card(String cardSuits, Integer cardValue) {
        this.cardSuits = cardSuits;
        this.cardValue = cardValue;
    }

    public String getSuit() {
        return cardSuits;
    }

    public Integer getValue() {
        return cardValue;
    }

    @Override
    public String toString() {
        if (this.getValue() == 1) {
            if (this.getSuit() == "Hearts") {
                return "Ace of ♥";
            } else if (this.getSuit() == "Spades") {
                return "Ace of ♠";
            } else if (this.getSuit() == "Clubs") {
                return "Ace of ♣";
            } else {
                return "Ace of ♦";
            }
        } else if (this.getValue() > 1 && this.getValue() < 11) {
            if (this.getSuit() == "Hearts") {
                return this.getValue() + " of ♥";
            } else if (this.getSuit() == "Spades") {
                return this.getValue() + " of ♠";
            } else if (this.getSuit() == "Clubs") {
                return this.getValue() + " of ♣";
            } else {
                return this.getValue() + " of ♦";
            }
        } else if (this.getValue() == 11) {
            if (this.getSuit() == "Hearts") {
                return "Jack of ♥";
            } else if (this.getSuit() == "Spades") {
                return "Jack of ♠";
            } else if (this.getSuit() == "Clubs") {
                return "Jack of ♣";
            } else {
                return "Jack of ♦";
            }
        } else if (this.getValue() == 12) {
            if (this.getSuit() == "Hearts") {
                return "Queen of ♥";
            } else if (this.getSuit() == "Spades") {
                return "Queen of ♠";
            } else if (this.getSuit() == "Clubs") {
                return "Queen of ♣";
            } else {
                return "Queen of ♦";
            }
        } else if (this.getValue() == 13) {
            if (this.getSuit() == "Hearts") {
                return "King of ♥";
            } else if (this.getSuit() == "Spades") {
                return "King of ♠";
            } else if (this.getSuit() == "Clubs") {
                return "King of ♣";
            } else {
                return "King of ♦";
            }
        }
        return "Error";
    }

    public int compareTo(Card c) {
        return this.getValue().compareTo(c.getValue());
    }
}
