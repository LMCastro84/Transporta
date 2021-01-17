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
        do{
            System.out.printf("Welcome %s, what would you like to do?", theUser.getFirstName());
            System.out.println("1- Account transaction history");
            System.out.println("2- Withdraw");
            System.out.println("3- Deposit");
            System.out.println("4- Transfer");
            System.out.println("5- Quit");
            System.out.println("");
            System.out.print("Enter choice: ");
            choice = in.nextInt();
        }
    }
}
