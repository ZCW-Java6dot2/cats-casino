package games.dicegames;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class DieTest {
    @Test
    public void getValueTest(){
        //given
        Random rand = new Random();
        Integer expectedValue = rand.nextInt(6) + 1;
        //when
        Die die = new Die();
        Integer actualValue = die.getValue();
        //then
        Assert.assertNotEquals(expectedValue, actualValue);

    }
    @Test
    public void printDieTest(){
        //given
        Die die = new Die();
        Random rand = new Random();
        Integer value = rand.nextInt(6) + 1;
        String expectedOutput = "";
        //when
        String actualOutput = die.printDie();
        //then
        Assert.assertNotEquals(expectedOutput, actualOutput);
    }
}
