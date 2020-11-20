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
                return "Ace ♥";
            } else if (this.getSuit() == "Spades") {
                return "Ace ♠";
            } else if (this.getSuit() == "Clubs") {
                return "Ace ♣";
            } else {
                return "Ace ♦";
            }
        } else if (this.getValue() > 1 && this.getValue() < 11) {
            if (this.getSuit() == "Hearts") {
                return this.getValue() + " ♥";
            } else if (this.getSuit() == "Spades") {
                return this.getValue() + " ♠";
            } else if (this.getSuit() == "Clubs") {
                return this.getValue() + " ♣";
            } else {
                return this.getValue() + " ♦";
            }
        } else if (this.getValue() == 11) {
            if (this.getSuit() == "Hearts") {
                return "Jack ♥";
            } else if (this.getSuit() == "Spades") {
                return "Jack ♠";
            } else if (this.getSuit() == "Clubs") {
                return "Jack ♣";
            } else {
                return "Jack ♦";
            }
        } else if (this.getValue() == 12) {
            if (this.getSuit() == "Hearts") {
                return "Queen ♥";
            } else if (this.getSuit() == "Spades") {
                return "Queen ♠";
            } else if (this.getSuit() == "Clubs") {
                return "Queen ♣";
            } else {
                return "Queen ♦";
            }
        } else if (this.getValue() == 13) {
            if (this.getSuit() == "Hearts") {
                return "King ♥";
            } else if (this.getSuit() == "Spades") {
                return "King ♠";
            } else if (this.getSuit() == "Clubs") {
                return "King ♣";
            } else {
                return "King ♦";
            }
        }
        return "error";
    }

    public int compareTo(Card c) {
        return this.getValue().compareTo(c.getValue());
    }
}
