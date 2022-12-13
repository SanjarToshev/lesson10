package uz.pdp.enums.project.model;

import java.math.BigDecimal;

public class User {

    private String name;
    private BigDecimal balance;
    private String login;


    public User(String name, BigDecimal balance, String login) {
        this.name = name;
        this.balance = balance;
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
