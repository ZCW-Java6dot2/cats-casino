package player;


import io.zipcoder.casino.utilities.Console;

import java.util.ArrayList;


public class Accounts {
    Console console;
    ArrayList<Account> bank;
    private Account currentAccount;


    public Account getCurrentAccount() {
        return currentAccount;
    }

    public void setCurrentAccount(Account currentAccount) {
        this.currentAccount = currentAccount;
    }

    public Accounts(Console console) {
        this.console = console;
        bank = new ArrayList<Account>();
    }

    public ArrayList<Account> getBank() {
        return bank;
    }

    public void setBank(ArrayList<Account> bank) {
        this.bank = bank;
    }

    public Account createNewUser() {
        String userNameInput = "";
        console.println("\nPlease provide a username you would like to use:");
        String username = console.getStringInput(userNameInput);
        String passwordInput = "";
        console.println("\nPlease provide a password for your profile:");
        String password = console.getStringInput(passwordInput);
        Account casinoAccount = new Account(username, password);
        this.bank.add(casinoAccount);
        return casinoAccount;
    }

        public Account loginUser() {
        currentAccount = null;
        String userNameInput = "";
        console.println("\n" +
                "Please enter your username.");
        String username = console.getStringInput(userNameInput);
        String passwordInput = "";
        console.println("\nPlease enter your password.");
        String password = console.getStringInput(passwordInput);
        for (Account account : bank) {
            String currentUsername = account.getUsername();
            String currentPassword = account.getPassword();
            boolean isCorrectName = currentUsername.equals(username);
            boolean isCorrectPassword = currentPassword.equals(password);
            boolean isValid = isCorrectName && isCorrectPassword;
            if (isValid) {
                currentAccount = account;
            }
            if (currentAccount == null) {
                console.println("\nIncorrect user or password, please try again.");
                currentAccount = createNewUser();
            }
        }
        return currentAccount;
    }
}
