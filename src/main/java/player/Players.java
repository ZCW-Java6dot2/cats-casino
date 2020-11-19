package player;


import io.zipcoder.casino.utilities.Console;

import java.util.ArrayList;


public class Players {
    Console console;
    ArrayList<Player> listOfPlayers;
    Player currentPlayer;


    public Players(Console console) {
        this.console = console;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public Player createNewUser() {
        String userNameInput = "";
        console.println("\nPlease provide a username you would like to use:");
        String username = console.getStringInput(userNameInput);
        String passwordInput = "";
        console.println("\nPlease provide a password for your profile:");
        String password = console.getStringInput(passwordInput);
        Player currentPlayer = new Player(console, username, password, new Account(console));
        this.listOfPlayers.add(currentPlayer);
        return currentPlayer;
    }

    public Player loginUser() {
        currentPlayer = null;
        String username = console.getStringInput("Please enter your username.");
        String password = console.getStringInput("Please enter your password.");
        if (listOfPlayers.size() == 0) {
            currentPlayer = createNewUser();
        } else {
            for (Player player : listOfPlayers) {
                String currentUsername = player.getUsername();
                String currentPassword = player.getPassword();
                boolean isCorrectName = currentUsername.equals(username);
                boolean isCorrectPassword = currentPassword.equals(password);
                boolean isValid = isCorrectName && isCorrectPassword;
                if (isValid) {
                    currentPlayer = player;
                }
                if (currentPlayer == null) {
                    console.println("\nIncorrect user or password, please try again.");
                    currentPlayer = createNewUser();
                }
            }

        }
        return currentPlayer;
    }

    public void addPreexistingPlayers(Player newPlayer) {
        this.listOfPlayers.add(newPlayer);
    }
}
