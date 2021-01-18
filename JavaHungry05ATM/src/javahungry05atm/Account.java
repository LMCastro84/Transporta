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
    }

    /**
     * Get account ID
     *
     * @return uuid
     */
    public String getUUID() {
        return this.uuid;
    }

    /**
     * Get summary line for the account
     *
     * @return the string summary
     */
    public String getSummaryLine() {
        //get the account's balance
        double balance = this.getBalance();

        //format the summary line, dependig on whether the balance is negative
        if (balance <= 0) {
            //"$%.02f" means a floating number with only two decimals
            return String.format("%s : $%.02f : %s", this.uuid, balance, this.name);
        } else {
            //"$(%.02f)" means a floating number with only two decimals
            return String.format("%s : $(%.02f) : %s", this.uuid, balance, this.name);
        }
    }
}
