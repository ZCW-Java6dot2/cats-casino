package gametables;

import games.dicegames.SnakeEyes;
import player.SnakeEyesPlayers;

public class SnakeEyesEngine {
    SnakeEyesPlayers snakeEyesPlayers;
    SnakeEyes snakeEyes;

    public SnakeEyesEngine(SnakeEyesPlayers snakeEyesPlayers, SnakeEyes snakeEyes){
        this.snakeEyes = snakeEyes;
        this.snakeEyesPlayers = snakeEyesPlayers;

    }
}
