//package gametables;
//
//import games.dicegames.Craps;
//import interfaces.Game;
//import io.zipcoder.casino.utilities.Console;
//import menus.CasinoProfileMenu;
//import menus.MainMenu;
//import player.CrapsPlayer;
//
//import java.util.ArrayList;
//
//public class CrapsEngine implements Game {
//    private Console console;
//    private Craps crapsGame;
//    private CrapsPlayer crapsPlayer;
//    private MainMenu mainMenu;
//
//    public CrapsEngine(Craps crapsGame, CrapsPlayer crapsPlayer) {
//        this.crapsGame = crapsGame;
//        this.crapsPlayer = crapsPlayer;
//    }
//
//    public CrapsEngine(Console console) {
//        this.console = console;
//        this.mainMenu = new MainMenu(console);
//    }
//
//    public void noMoneyLeft(CrapsPlayer crapsPlayer) {
//        while (crapsPlayer.getPlayersAccount().getBalance() > 0) {
//            playRound();
//        }
//    }
//
//    public void startGame() {
//        setUpGame();
//        noMoneyLeft(crapsPlayer);
//    }
//
//    public void setUpGame() {
//        console.println("Welcome to Fat Cat Casino CRAPS!");
//        playRound();
//    }
//
//    public void playRound() {
//        if (crapsPlayer.getPlayersAccount().getBalance() > 0) {
//            askContinue();
//            if (crapsPlayer.getPlayersAccount().getBalance() > 0) {
//                playerTakeTurn(crapsPlayer);
//            }
//        }
//    }
//
//    public static boolean question(Console console) {
//        boolean input = false;
//        boolean isValidInput = false;
//        while (!isValidInput) {
//            Integer userInput = console.getIntegerInput("Would you like to cash out?\n" +
//                    "1 - Yes, 2 - No");
//            if (userInput == 1) {
//                input = true;
//                isValidInput = true;
//            } else if (userInput == 2) {
//                input = false;
//                isValidInput = true;
//            } else {
//                System.out.println("Invalid input, please choose a correct option!");
//            }
//        }
//        return input;
//    }
//
//    public void askContinue() {
//        console.println(String.valueOf(crapsPlayer.getPlayersAccount().getBalance()));
//        if (crapsPlayer.getPlayersAccount().getBalance() > 0) {
//            boolean cashOut = question(console);
//            if (cashOut) {
//                endGame(console);
//            }
//        }
//    }
//
//    public void playerTakeTurn(CrapsPlayer crapsPlayer) {
//        makeBet(crapsPlayer);
//        Integer userInput = console.getIntegerInput("Would you like to make a bet?\n" +
//                "1 - Yes, 2 - No");
//        if (userInput == 1) {
//            makeBet(crapsPlayer);
//        } else {
//            endGame(console);
//        }
//        boolean comeOutRollEndsRound = comeOutRoll();
//        if (!comeOutRollEndsRound) {
//            rollForPoint();
//        }
//        payOutBets();
//    }
//
//    public void makeBet(CrapsPlayer crapsPlayer) {
//        Integer balance = crapsPlayer.getPlayersAccount().getBalance();
//        Integer betAmount = 0;
//        boolean isValidInput = false;
//        while (!isValidInput) {
//            console.println(String.format("%s, how much would you like to bet?", crapsPlayer.getUsername()));
//            if (betAmount <= balance) {
//                isValidInput = true;
//            } else {
//                System.out.println("Sorry you do not have that much money to bet.");
//            }
//        }
//        crapsGame.takeBet(crapsPlayer, betAmount);
//        System.out.print("Would you like to place your bet on Pass?");
//        Integer userInput = console.getIntegerInput("1 - Yes, 2 - No");
//        switch (userInput) {
//            case 1:
//                crapsGame.putPlayerOnDontPass();
//                break;
//            case 2:
//                crapsGame.putPlayerOnDontPass();
//                break;
//        }
//    }
//
//    public boolean comeOutRoll() {
//        crapsGame.rollDice();
//        int rollSum = crapsGame.getSumOfDice();
//        System.out.printf("You rolled a %d %s\n", rollSum, crapsGame.getDice().printDice());
//        switch (rollSum) {
//            case 2:
//            case 3:
//            case 12:
//                crapsGame.setPassBetsWin(false);
//                return true;
//            case 7:
//            case 11:
//                crapsGame.setPassBetsWin(true);
//                return true;
//            case 4:
//            case 5:
//            case 6:
//            case 8:
//            case 9:
//            case 10:
//                crapsGame.setPoint(rollSum);
//                return false;
//        }
//        return false;
//    }
//
//    public void rollForPoint() {
//        boolean continueRolling = true;
//        int rollSum = 0;
//        while (continueRolling) {
//            System.out.printf("Rolling for point: %d\n", crapsGame.getPoint());
//            getUserInput("Press enter to roll again.");
//            crapsGame.rollDice();
//            rollSum = crapsGame.getSumOfDice();
//            System.out.printf("You rolled a %d %s\n", rollSum, crapsGame.getDice().printDice());
//            if (rollSum == crapsGame.getPoint() || rollSum == 7) {
//                continueRolling = false;
//            }
//        }
//
//        if (rollSum == crapsGame.getPoint()) {
//            crapsGame.setPassBetsWin(true);
//        } else {
//            crapsGame.setPassBetsWin(false);
//        }
//    }
//
//    public void payOutBets() {
//        if (crapsGame.isPassBetsWin()) {
//            System.out.println("Congratulations, the bets on PASS win!");
//        } else {
//            System.out.println("Congratulations, the bets on DON'T PASS win!");
//        }
//        crapsGame.payOutBets();
//    }
//
//    public void endGame(Console console) {
//        mainMenu.runMainMenu(crapsPlayer);
//    }
//
//    @Override
//    public String getNameOfGame() {
//        return nameOfGame;
//    }
//
//    @Override
//    public boolean bet() {
//        return false;
//    }
//
//    @Override
//    public Integer placeBet() {
//        return null;
//    }
//
//    @Override
//    public Integer getWinnings() {
//        return null;
//    }
//
//    @Override
//    public boolean addFunds() {
//        return false;
//    }
//}
