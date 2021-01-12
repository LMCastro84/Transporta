package javahungry05atm;

import java.util.ArrayList;
import java.security.MessageDigest;

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

    public User(String firstName, String lastName, String pin, Bank theBank) {
        //set user's name
        this.firstName = firstName;
        this.lastName = lastName;
        
        //store pin's MD5 hash, rather than the original value,for security reasons
        
    }
}
