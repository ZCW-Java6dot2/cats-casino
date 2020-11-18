package gametables;

import games.cardgames.Blackjack;
import player.BlackjackPlayer;



public class BlackjackEngine {
    BlackjackPlayer blackjackPlayer;
    Blackjack blackjack;

    public BlackjackEngine(Blackjack blackjack, BlackjackPlayer blackjackPlayer) {
        this.blackjack = blackjack;
        this.blackjackPlayer = blackjackPlayer;
    }

}
