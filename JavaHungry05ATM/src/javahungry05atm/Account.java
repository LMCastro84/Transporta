package javahungry05atm;

import java.util.ArrayList;

public class Account {

    /**
     * Name of the account
     */
    private String name;
    
    /**
     * Current balance
     */
    private double balance;
    
    /**
     * ID number
     */
    private String uuid;
    
    /**
     * User object that uses this account
     */
    private User holder;
    
    /**
     * List of transactions for this account
     */
    private ArrayList<Transaction> transactions;
}
