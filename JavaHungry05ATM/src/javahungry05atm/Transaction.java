package javahungry05atm;

import java.util.Date;

public class Transaction {

    /**
     * Amount for this transaction
     */
    private double amount;

    /**
     * Tima and date of transaction
     */
    private Date timestamp;

    /**
     * Memo for transaction
     */
    private String memo;

    /**
     * Account in wich the transaction was performed
     */
    private Account inAccount;

    /**
     * Create new transaction
     *
     * @param amount amount transacted
     * @param inAccount account the transaction belongs to
     */
    public Transaction(double amount, Account inAccount) {
        this.amount = amount;
        this.inAccount = inAccount;
        this.timestamp = new Date();
        this.memo = "";
    }

    /**
     * Create new transaction
     *
     * @param amount amount transacted
     * @param memo memo of transaction
     * @param inAccount account the transaction belongs to
     */
    public Transaction(double amount, String memo, Account inAccount) {
        //call the upper two-arg constructor first
        this(amount, inAccount);
        //set the memo
        this.memo = memo;
    }

    /**
     * Get the amount of the transaction
     *
     * @return the amount
     */
    public double getAmount() {
        return this.amount;
    }

    /**
     * Get a string summarizing the transaction
     *
     * @return the summary string
     */
    public String getSummaryLine() {
        if (this.amount >= 0) {
            return String.format("%s : %.02f€ : %s", this.timestamp.toString(),
                    this.amount, this.memo);
        } else {
            return String.format("%s : (%.02f)€ : %s", this.timestamp.toString(),
                    this.amount, this.memo);
        }
    }
}
