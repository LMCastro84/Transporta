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
     * 
     */
    private byte pinHash[];
    private ArrayList<Account> accounts;

}
