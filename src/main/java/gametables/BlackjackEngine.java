package gametables;

import games.cardgames.BlackjackGame;
import player.BlackjackPlayer;
import player.Player;


public class BlackjackEngine {
    BlackjackPlayer blackjackPlayer;
    BlackjackGame blackjackGame;
    BlackjackEngine blackjackEngine;

    public BlackjackEngine(BlackjackGame blackjackGame, BlackjackPlayer blackjackPlayer) {
        this.blackjackGame = blackjackGame;
        this.blackjackPlayer = blackjackPlayer;
    }
//    public void addPlayer(BlackjackPlayer blackjackPlayer) {
//        BlackjackEngine.put(blackjackPlayer);
//    }

}
