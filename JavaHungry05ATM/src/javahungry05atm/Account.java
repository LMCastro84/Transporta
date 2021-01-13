package javahungry05atm;

import java.util.ArrayList;

public class Account {

    /**
     * Name of the account
     */
    private String name;

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

    /**
     *
     * @param name name of account
     * @param holder User object that holds account
     * @param theBank bank that issues account
     */
    public Account(String name, User holder, Bank theBank) {
        //set the account name and holder
        this.name = name;
        this.holder = holder;

        //get new account UUID
        this.uuid = theBank.getNewAccountUUID();

        //initialize transactions
        this.transactions = new ArrayList<Transaction>();

        //add to holder and bank lists
        holder.addAccount(this);
        theBank.addAccount(this);
    }

    /**
     * Get account ID
     *
     * @return uuid
     */
    public String getUUID() {
        return this.uuid;
    }
}
