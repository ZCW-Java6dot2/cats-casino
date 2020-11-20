package player;

import io.zipcoder.casino.utilities.Console;

public class Account {
    private Console console;
    private Integer balance;

    public Account(Console console) {
        this.console = console;
        this.balance = 0;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                '}';
    }
}
