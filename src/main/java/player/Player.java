package player;


import io.zipcoder.casino.utilities.Console;

public class Player {
    private Console console;
    private String username;
    private String password;
    private Account playersAccount;

    public Player(Console console, String username, String password, Account playersAccount) {
        this.console = console;
        this.username = username;
        this.password = password;
        this.playersAccount = playersAccount;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Account getPlayersAccount() {
        return playersAccount;
    }

    public void setPlayersAccount(Account playersAccount) {
        this.playersAccount = playersAccount;
    }

    public void changeUsername() {
        String newPlayerUsername = console.getStringInput("Please provide your new username: ");
        this.setUsername(newPlayerUsername);
    }

    public void changePassword() {
        String newAccountPassword = console.getStringInput("Please provide your new password: ");
        this.setPassword(newAccountPassword);
    }

    public void depositFunds() {
        Integer fundsToBeDeposited = console.getIntegerInput("Please indicate the amount you would like to deposit:");
        Account playerAccount = this.getPlayersAccount();
        playerAccount.setBalance(playerAccount.getBalance() + fundsToBeDeposited);
    }

    public void cashoutFunds() {
        Integer fundsToBeCashedOut = console.getIntegerInput("Please indicate the amount you would like to deposit:");
        Account playerAccount = this.getPlayersAccount();
        playerAccount.setBalance(playerAccount.getBalance() - fundsToBeCashedOut);
    }
}
