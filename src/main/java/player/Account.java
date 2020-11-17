package player;

public class Account {
    private String username;
    private String password;
    private Integer balance;

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
        this.balance = 0;
    }
}
