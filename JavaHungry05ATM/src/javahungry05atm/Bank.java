package javahungry05atm;

import java.util.ArrayList;
import java.util.Random;

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

    /**
     * Generate a new universally unique ID for user
     *
     * @return the uuid
     */
    public String getNewUserUUID() {
        //initialize
        String uuid;
        Random rng = new Random();
        int length = 6;
        boolean nonUnique;

        //continue looping until get a unique ID
        do {
            //generate number
            uuid = "";
            for (int i = 0; i < length; i++) {
                uuid += ((Integer) rng.nextInt(10)).toString();
            }

            //check if uuid is unique
            nonUnique = false;
            for (User u : this.users) {
                if (uuid.compareTo(u.getUUID()) == 0) {
                    nonUnique = true;
                    break;
                }
            }
        } while (nonUnique);

        return uuid;
    }

    /**
     * Generate a new universally unique ID for an account
     *
     * @return uuid
     */
    public String getNewAccountUUID() {
        //initialize
        String uuid;
        Random rng = new Random();
        int length = 10;
        boolean nonUnique;

        //continue looping until get a unique ID
        do {
            //generate number
            uuid = "";
            for (int i = 0; i < length; i++) {
                uuid += ((Integer) rng.nextInt(10)).toString();
            }

            //check if uuid is unique
            nonUnique = false;
            for (Account a : this.accounts) {
                if (uuid.compareTo(a.getUUID()) == 0) {
                    nonUnique = true;
                    break;
                }
            }
        } while (nonUnique);

        return uuid;
    }

}
