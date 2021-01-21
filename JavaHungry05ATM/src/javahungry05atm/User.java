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

    /**
     * Add account for user
     *
     * @param anAccount account to add
     */
    public void addAccount(Account anAccount) {
        this.accounts.add(anAccount);
    }

    /**
     * Return user's UUID
     *
     * @return uuid
     */
    public String getUUID() {
        return this.uuid;
    }

    /**
     * Check whether a given pin matches the true User pin
     *
     * @param pin pin to chek
     * @return whether the pin is valid or not
     */
    public boolean validatePin(String pin) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            return MessageDigest.isEqual(md.digest(pin.getBytes()), this.pinHash);
        } catch (NoSuchAlgorithmException ex) {
            System.err.println("error, caught NoSuchAlgorithmException");
            ex.printStackTrace();
            System.exit(1);
        }
        return false;
    }

    /**
     * Returns the user's first name
     *
     * @return first name
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Print summaries for the accounts of this user
     */
    public void printAccountsSummary() {
        System.out.printf("\n%s's accounts summary ", this.firstName);
        for (int i = 0; i < this.accounts.size(); i++) {
            System.out.printf("%d) %s\n", i + 1, this.accounts.get(i).getSummaryLine());
        }
        System.out.println("");
    }

    /**
     * Get the number of accounts of the user
     *
     * @return number of accounts
     */
    public int numAccounts() {
        return this.accounts.size();
    }

    /**
     * Print transaction history for a particular account
     *
     * @param accountIndex index of the account to ues
     */
    public void printAccountTransHistory(int accountIndex) {
        this.accounts.get(accountIndex).printTransHistory();
    }

    /**
     * Get the balance of a particular account
     *
     * @param accountIndex the index of the account to use
     * @return the balance of the account
     */
    public double getAccountBalance(int accountIndex) {
        return this.accounts.get(accountIndex).getBalance();
    }
}
