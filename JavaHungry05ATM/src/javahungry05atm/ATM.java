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

        User curUser;
        while (true) {

            //stay in the login prompt until successful login
            curUser = ATM.mainMenuPrompt(theBank, in);

            //stay in main menu until user quits
            ATM.printUserMenu(curUser, in);

        }
    }

    /**
     *
     * @param theBank
     * @param in
     * @return
     */
    public static User mainMenuPrompt(Bank theBank, Scanner in) {

        //initialize
        String userID;
        String pin;
        User authenticatedUser;

        //prompt the user for user ID/pin combo until a correct one is reached
        do {
            System.out.printf("\n\nWelcome to %s\n\n", theBank.getName());
            System.out.print("Enter user ID: ");
            userID = in.nextLine();
            System.out.print("Enter pin: ");
            pin = in.nextLine();

            //try to get the user object correspondig to the ID and pin combo
            authenticatedUser = theBank.userLogin(userID, pin);
            if (authenticatedUser == null) {
                System.out.println("Incorrect user ID/pin combination. Please "
                        + "try again.");
            }

        } //continue looping until successful login
        while (authenticatedUser == null);
        return authenticatedUser;

    }

    public static void prinUserMenu(User theUser, Scanner in) {
        //print a summary of user's accounts
        theUser.printAccountsSummary();

        //initialize
        int choice;

        //user menu
        do {
            System.out.printf("Welcome %s, what would you like to do?", theUser.getFirstName());
            System.out.println("1- Account transaction history");
            System.out.println("2- Withdraw");
            System.out.println("3- Deposit");
            System.out.println("4- Transfer");
            System.out.println("5- Quit");
            System.out.println("");
            System.out.print("Enter choice: ");
            choice = in.nextInt();

            if (choice < 1 || choice > 5) {
                System.out.println("Invalid choice. Please try again:");
            }
        } while (choice < 1 || choice > 5);

        //process the choice
        switch (choice) {
            case 1:
                ATM.showTransHistory(theUser, in);
                break;
            case 2:
                ATM.withdrawFunds(theUser, in);
                break;
            case 3:
                ATM.depositFunds(theUser, in);
                creak;
            case 4:
                ATM.transferFunds(theUser, in);
                break;
        }

        //redisplay menu unless user wants to quit
        if (choice != 5) {
            ATM.prinUserMenu(theUser, in);
        }
    }

    public static void showTransHistory(User theUser, Scanner in) {
        int theAccount;
        //get account whose transaction history to look at
        do {
            //"(1-%d)" means the numbers of the existing accounts
            System.out.printf("Enter number between (1-%d) of the account whose"
                    + " transactions you want to see: ", theUser.numAccounts());
            //"-1" to coincide with the number of the account in the ArrayList
            theAccount = in.nextInt()-1;
            if (theAccount < 0 || theAccount >= theUser.numAccounts()){
                System.out.println("Invalid account. Please try again.");
            }
        } while (theAccount < 0 || theAccount >= theUser.numAccounts());
        
        //print the transaction history
        theUser.printAccountTransHistory(theAccount);
    }

}
