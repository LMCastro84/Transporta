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
}
