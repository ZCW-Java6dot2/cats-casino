package games.dicegames;

import interfaces.Game;

import java.util.Random;

public class Die {

    private Integer numOfSides;
    private Integer faceValue;


    public Die(Integer numOfSides) {
        this.numOfSides = numOfSides;
    }


    public void rollDice() {             //this method is going to roll the dice

        Random randomNumGenerator = new Random();
        faceValue = randomNumGenerator.nextInt(numOfSides) + 1;
        //Bins B = new Bins();
        //B.storeValues(faceValue);

    }


    public Integer getFaceValue() {
        return faceValue;
    }

    public Integer tosses(int numOfTosses) {

        DiceBin diceBin = new DiceBin();

        for (int i = 1; i <= numOfTosses; i++) {
            rollDice();
            diceBin.storeValues(faceValue);


        } return 0;
    }

    public Die placeDiceInBin() {
        return null;
    }


}

