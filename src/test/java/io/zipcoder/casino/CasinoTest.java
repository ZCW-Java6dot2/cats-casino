//package io.zipcoder.casino;
//
//
//import io.zipcoder.casino.utilities.Console;
//import menus.LoginMenu;
//import org.junit.Assert;
//import org.junit.Test;
//
//public class CasinoTest {
//    @Test
//    public void mainConstructorTest(){
//        //given
//        Console console = new Console(System.in, System.out);
//        LoginMenu loginMenu = new LoginMenu(console);
//        String expectedOutput = "Please choose from the following options:\n" +
//                "1 - Login to your Casino Profile\n" +
//                "2 - Create a New Casino Profile\n" +
//                "3 - Leave Casino\n" +
//                "---------------------------------\n" +
//                "Enter choice here: -> ";
//        //when
//        String actualOutput = (loginMenu.runLoginMenu());
//        //then
//        Assert.assertEquals(expectedOutput, actualOutput);
//    }
//}
