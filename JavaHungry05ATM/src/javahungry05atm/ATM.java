package javahungry05atm;

import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        //create Bank
        Bank theBank = new Bank("Foz Bank");
        
        // add a user, and create a savings account
        User user = theBank.addUser("Luis", "Castro", "1234");
        
        //add a checking account for user
        Account newAccount = new Account("Checking", user, theBank);
        user.addAccount(newAccount);
        theBank.addAccount(newAccount);
    }

}
