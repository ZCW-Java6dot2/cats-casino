package games.dicegames;

import interfaces.Game;
import menus.DiceGameMenu;
import player.Player;

import java.util.ArrayList;

public class DiceGame implements Game {

    ArrayList<Die> dice;
    ArrayList<Player> players;

    public DiceGame(ArrayList<Die> dice, ArrayList<Player> players) {
        this.dice = dice;
        this.players = players;
    }

    public void rollDice() {
    }


    public void createDice(Integer number) {

        for (int i = 0; i < number; i++) {
            Die die = new Die(6);
            dice.add(die);
        }
    }

    public void createPlayers(Integer number) {
        for (int i = 0; i < number; i++) {
            Player player = new Player();
            players.add(player);
        }
    }

        public Integer sumDice () {
            return null;
        }

        public Integer numberOfRolls () {
            return null;
        }

        public void addPlayer (Player player){

        }

        public void removePlayer (Player player){

        }

        public void startGame () {

        }

        public void endGame () {

        }

        public String results (ArrayList < Integer > scores) {
            return null;
        }

        public void results () {

        }

        public void startPlayersTurn () {

        }

        public void action () {

        }

        public void finishTurn () {

        }
    }
