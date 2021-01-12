package javahungry05atm;

import java.util.ArrayList;

public class User {

    /**
     * First name of user
     */
    private String firstName;
    
    /**
     * Last name of user
     */    
    private String lastName;
    
    /**
     * ID number of user
     */
    private String uuid; //Unique Universal Identifier
    
    /**
     * MD5 hash (algorithm) of user's pin number
     */    
    private byte pinHash[];
    
    /**
     * List of accounts for user
     */
    private ArrayList<Account> accounts;

}
