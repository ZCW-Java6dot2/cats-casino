package games.cardgames;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class HandTest {

    @Test
    public void getHandTest(){
        //given
        Hand hand = new Hand();
        ArrayList<Card> expectedHand = new ArrayList<>();
        //when
        hand.setHand(expectedHand);
        ArrayList<Card> actualHand = hand.getHand();
        //then
        Assert.assertEquals(expectedHand, actualHand);
    }

    @Test
    public void getHandSizeTest(){
        //given
        Hand hand = new Hand();
        int expectedHandSize = 0;
        //when
        int actualHandSize = hand.getHandSize();
        //then
        Assert.assertEquals(expectedHandSize, actualHandSize);
    }





}