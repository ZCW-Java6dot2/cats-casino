package games.dicegames;

import interfaces.GamblingGame;
import interfaces.Game;
import player.CrapsPlayer;

public class Craps implements Game, GamblingGame {
    private CrapsPlayer currentPlayer;



    public Integer minPlayers = 1;
    public Integer  maxPlayers = 8;

    private Dice dice = new Dice(2);
    private Integer point;

    private boolean playerOnPass;
    private boolean playerOnDontPass;
    private boolean passBetsWin = true;


    public Integer getSumOfDice() {
        return getValueOfDieOne() + getValueOfDieTwo();
    }

    public Integer getValueOfDieOne() {
        return dice.getDice().get(0).getValue();
    }

    public Integer getValueOfDieTwo() {
        return dice.getDice().get(1).getValue();
    }

    public Dice getDice() {
        return dice;
    }

    public void rollDice() {
        dice.rollDice();
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public boolean isPassBetsWin() {
        return passBetsWin;
    }

    public void setPassBetsWin(boolean passBetsWin) {
        this.passBetsWin = passBetsWin;
    }

    public void takeBet(CrapsPlayer crapsPlayer, Integer betAmount) {
        crapsPlayer.getPlayersAccount().setBalance(crapsPlayer.getPlayersAccount().getBalance() - betAmount);
    }

    @Override
    public void payOutBets() {
        if(passBetsWin) {
            for(CrapsPlayer player : playerOnPass) {
                Double amountWon = bets.get(player) * 2;
                player.receiveWinnings(amountWon);
            }
        }
        else {
            for(CrapsPlayer player : playerOnDontPass) {
                Double amountWon = bets.get(player) * 2;
                player.receiveWinnings(amountWon);
            }
        }
        clearAllBets();
    }

    @Override
    public void clearAllBets() {
        bets.clear();
        playerOnPass.clear();
        playerOnDontPass.clear();
    }

    public void putPlayerOnPass() {
        playerOnPass = true;
    }

    public void putPlayerOnDontPass() {
        playerOnDontPass = true;
    }

    @Override
    public Integer getPlayerBet() {
        return null;
    }

    @Override
    public void winnings(Integer playersBet) {

    }

    @Override
    public void startGame() {

    }
}
