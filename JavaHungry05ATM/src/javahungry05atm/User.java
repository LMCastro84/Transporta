package javahungry05atm;

import java.util.ArrayList;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    /**
     * Create new user
     *
     * @param firstName user's first name
     * @param lastName user's last name
     * @param pin user's account pin number
     * @param theBank Bank object that the user is a costumer of
     */
    public User(String firstName, String lastName, String pin, Bank theBank) {
        //set user's name
        this.firstName = firstName;
        this.lastName = lastName;

        //store pin's MD5 hash, rather than the original value,for security reasons
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            this.pinHash = md.digest(pin.getBytes());
        } catch (NoSuchAlgorithmException ex) {
            System.err.println("error, caught NoSuchAlgorithmException");
            ex.printStackTrace();
            System.exit(1);
        }

        //get a new, unique universal ID for the user
        this.uuid = theBank.getNewUserUUID();

        //create empty list of accounts
        this.accounts = new ArrayList<Account>();

        //print log message
        System.out.printf("New user %s, %s with ID %s created.\n", lastName,
                firstName, this.uuid);

    }

    public void addAccount(Account anAccount) {
        this.accounts.add(anAccount);
    }
}
