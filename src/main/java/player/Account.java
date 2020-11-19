package player;

import io.zipcoder.casino.utilities.Console;

public class Account {
    private Account currentAccount;
    private Console console;
    private String username;
    private String password;
    private Integer balance;
    private Integer newBalance;


    public Account(Account currentAccount){
        this.currentAccount = currentAccount;
    }


    public Account(Console console, String username, String password) {
        this.console = console;
        this.username = username;
        this.password = password;
        this.balance = 0;
    }

    public Account changeUsername(Account currentAccount) {
        String newAccountUsername = console.getStringInput("Please provide your new username: ");
        currentAccount.setUsername(newAccountUsername);
        return currentAccount;
    }

    public Account changePassword(Account currentAccount) {
        String newAccountPassword = console.getStringInput("Please provide your new password: ");
        currentAccount.setPassword(newAccountPassword);
        return currentAccount;
    }

    public Account depositFunds(Account currentAccount) {
        Integer fundsToBeDeposited = console.getIntegerInput("Please indicate the amount you would like to deposit:");
        currentAccount.setBalance(currentAccount.getBalance() + fundsToBeDeposited);
        return currentAccount;
    }

    public Account cashoutFunds(Account currentAccount) {
        Integer fundsToBeCashedOut = console.getIntegerInput("Please indicate the amount you would like to deposit:");
        currentAccount.setBalance(currentAccount.getBalance() + fundsToBeCashedOut);
        return currentAccount;
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

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer newBalance) {
        this.newBalance = newBalance;
    }
}
