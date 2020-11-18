package games.dicegames;

import interfaces.Game;

import java.util.Random;

public class Die {
    private Integer numOfSides;
    private Integer faceValue;


    public Die(Integer numOfSides) {
        this.numOfSides = numOfSides;
    }


    public void rollDice() {

        Random randomNumGenerator = new Random();
        faceValue = randomNumGenerator.nextInt(numOfSides) + 1;
    }


    public Integer getFaceValue() {
        return faceValue;
    }







}
