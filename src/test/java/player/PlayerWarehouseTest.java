package player;


import org.junit.Assert;
import org.junit.Test;

public class PlayerWarehouseTest {
    @Test
    public void getCurrentPlayerTest() {
        //given
        Player player = new Player(null, null, null, null);
        PlayerWarehouse playerWarehouse = new PlayerWarehouse(null);
        Player expectedPlayer = player;
        //when
        playerWarehouse.setCurrentPlayer(expectedPlayer);
        Player actualPlayer = playerWarehouse.getCurrentPlayer();
        //then
        Assert.assertEquals(expectedPlayer, actualPlayer);
    }

    @Test
    public void addPreexistingPlayersTest(){
        //given
        Player newPlayer = new Player(null, "newGuy", "jfjf", null);
        PlayerWarehouse playerWarehouse = new PlayerWarehouse(null);
        //when
        playerWarehouse.addPreexistingPlayers(newPlayer);
        //then
    }
}