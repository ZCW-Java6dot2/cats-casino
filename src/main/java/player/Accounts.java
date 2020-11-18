package player;


import io.zipcoder.casino.utilities.Console;

import java.util.ArrayList;


public class Accounts {
    Console console;
    ArrayList<Account> listOfAccounts;
    private Account currentAccount;


    public Account getCurrentAccount() {
        return currentAccount;
    }

    public void setCurrentAccount(Account currentAccount) {
        this.currentAccount = currentAccount;
    }

    public Accounts(Console console) {
        this.console = console;
        listOfAccounts = new ArrayList<Account>();
    }

    public ArrayList<Account> getListOfAccounts() {
        return listOfAccounts;
    }

    public void setListOfAccounts(ArrayList<Account> listOfAccounts) {
        this.listOfAccounts = listOfAccounts;
    }

    public Account createNewUser() {
        String userNameInput = "";
        console.println("\nPlease provide a username you would like to use:");
        String username = console.getStringInput(userNameInput);
        String passwordInput = "";
        console.println("\nPlease provide a password for your profile:");
        String password = console.getStringInput(passwordInput);
        Account casinoAccount = new Account(console, username, password);
        this.listOfAccounts.add(casinoAccount);
        return casinoAccount;
    }

    public Account loginUser() {
        currentAccount = null;
        String username = console.getStringInput("Please enter your username.");
        String password = console.getStringInput("Please enter your password.");

        if (listOfAccounts.size() == 0) {
            currentAccount = createNewUser();
        } else {
            for (Account account : listOfAccounts) {
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

        }
        return currentAccount;
    }
}
