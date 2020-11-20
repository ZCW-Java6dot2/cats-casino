package gametables;

import games.dicegames.Craps;
import interfaces.Game;
import io.zipcoder.casino.utilities.Console;
import menus.MainMenu;
import player.CrapsPlayer;

public class CrapsEngine implements Game {
    private Console console;
    private Craps crapsGame;
    private CrapsPlayer crapsPlayer;
    private Integer betAmount;
    private MainMenu mainMenu;

    public CrapsEngine(Craps crapsGame, CrapsPlayer crapsPlayer) {
        this.crapsGame = crapsGame;
        this.crapsPlayer = crapsPlayer;
    }

    public CrapsEngine(Console console) {
        this.console = console;
        this.mainMenu = new MainMenu(console);
    }

    public void noMoneyLeft(CrapsPlayer crapsPlayer) {
        while (crapsPlayer.getPlayersAccount().getBalance() > 0) {
            playRound();
        }
    }

    public void startGame() {
        setUpGame();
        noMoneyLeft(crapsPlayer);
    }

    public void setUpGame() {
        console.println("Welcome to Fat Cat Casino CRAPS!");
        playRound();
    }

    public void playRound() {
        if (crapsPlayer.getPlayersAccount().getBalance() > 0) {
            askContinue();
            if (crapsPlayer.getPlayersAccount().getBalance() > 0) {
                bet(crapsPlayer);
            }
        }
    }

    public static boolean question(Console console) {
        boolean input = false;
        boolean isValidInput = false;
        while (!isValidInput) {
            Integer userInput = console.getIntegerInput("Would you like to cash out?\n" +
                    "1 - Yes, 2 - No");
            if (userInput == 1) {
                input = true;
                isValidInput = true;
            } else if (userInput == 2) {
                input = false;
                isValidInput = true;
            } else {
                console.println("Invalid input, please choose a correct option!");
            }
        }
        return input;
    }

    public void askContinue() {
        console.println(String.valueOf(crapsPlayer.getPlayersAccount().getBalance()));
        if (crapsPlayer.getPlayersAccount().getBalance() > 0) {
            boolean cashOut = question(console);
            if (cashOut) {
                endGame();
            }
        }
    }

    public void bet(CrapsPlayer crapsPlayer) {
        placeBet(crapsPlayer);
        Integer userInput = console.getIntegerInput("Would you like to make a bet?\n" +
                "1 - Yes, 2 - No");
        if (userInput == 1) {
            placeBet(crapsPlayer);
        } else {
            endGame();
        }
        boolean comeOutRollEndsRound = comeOutRoll();
        if (!comeOutRollEndsRound) {
            rollForPoint();
        }
        getWinnings();
    }

    public void placeBet(CrapsPlayer crapsPlayer) {
        Integer balance = crapsPlayer.getPlayersAccount().getBalance();
        betAmount = 0;
        boolean isValidInput = false;
        while (!isValidInput) {
            console.println(String.format("%s, how much would you like to bet?", crapsPlayer.getUsername()));
            if (betAmount <= balance) {
                isValidInput = true;
            } else {
                System.out.println("Sorry you do not have that much money to bet.");
                addFunds();
            }
        }
        crapsGame.takeBet(crapsPlayer, betAmount);
        console.println("Where would you like to place your bet?");
        Integer userInput = console.getIntegerInput("1 - On Pass Line, 2 - On Don't Pass Line");
        switch (userInput) {
            case 1:
                crapsGame.putPlayerOnDontPass();
                break;
            case 2:
                crapsGame.putPlayerOnPass();
                break;
        }

    }

    public boolean comeOutRoll() {
        crapsGame.rollDice();
        int rollSum = crapsGame.getSumOfDice();
        console.println("You rolled a %d %s\n", rollSum, crapsGame.getDice().printDice());
        switch (rollSum) {
            case 2:
            case 3:
            case 12:
                crapsGame.setPassBetsWin(false);
                return true;
            case 7:
            case 11:
                crapsGame.setPassBetsWin(true);
                return true;
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
                crapsGame.setPoint(rollSum);
                return false;
        }
        return false;
    }

    public void rollForPoint() {
        boolean continueRolling = true;
        int rollSum = 0;
        while (continueRolling) {
            console.println("Rolling for point: %d\n", crapsGame.getPoint());
            console.getStringInput("Press enter to roll again.");
            crapsGame.rollDice();
            rollSum = crapsGame.getSumOfDice();
            console.println("You rolled a %d %s\n", rollSum, crapsGame.getDice().printDice());
            if (rollSum == crapsGame.getPoint() || rollSum == 7) {
                continueRolling = false;
            }
        }
        crapsGame.setPassBetsWin(rollSum == crapsGame.getPoint());
    }

    public void getWinnings() {
        if (crapsGame.isPassBetsWin()) {
            console.println("Congratulations, the bets on PASS win!");
        } else {
            console.println("Congratulations, the bets on DON'T PASS win!");
        }
        crapsPlayer.getPlayersAccount().setBalance(crapsPlayer.getPlayersAccount().getBalance() + betAmount);
        betAmount = 0;
    }

    public void endGame() {
        mainMenu.runMainMenu(crapsPlayer);
    }

    public void addFunds() {
        console.println("Would you like to add additional funds?\n");
        Integer answer = console.getIntegerInput("1 - Yes, 2 - No");
        if (answer == 1) {
            Integer amountToDeposit = console.getIntegerInput("How much would you like to deposit?");
            crapsPlayer.getPlayersAccount().setBalance(crapsPlayer.getPlayersAccount().getBalance() + amountToDeposit);
        } else {
            endGame();
        }
    }
}
