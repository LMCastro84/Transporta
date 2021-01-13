package javahungry05atm;

import java.util.ArrayList;

public class Bank {

    /**
     * Name of Bank
     */
    private String name;

    /**
     * List of users
     */
    private ArrayList<User> users;

    /**
     * List of accounts
     */
    private ArrayList<Account> accounts;

    public String getNewUserUUID() {

    }

    public String getNewAccountUUID() {

    }

    /**
     * Add account
     *
     * @param anAccount account to add
     */
    void addAccount(Account anAccount) {
        this.accounts.add(anAccount);
    }
}
