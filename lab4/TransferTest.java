package lab4;
//************************************************************

//TransferTest
//A program used toe transfer fund from one funds between accounts
//************************************************************
import java.util.Scanner;

public class TransferTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Account acct1 = new Account(50000, "Janet");
        Account acct2 = new Account(25000, "Jefferson");

        boolean exit = false;

        // Loop until the user choose to exit
        while (!exit) {
            System.out.println("Current Open Accounts: \n\n"
                    + acct1.toString() + "\n" + acct2.toString());

            System.out.print("****MENU********* \nChoose Transfers option: "
                    + "\n1: Transfer money from account" + acct1.getAcctNumber()
                    + " to account " + acct2.getAcctNumber()
                    + "\n2: Transfer money from account " + acct2.getAcctNumber()
                    + " to account " + acct1.getAcctNumber()
                    + "\n3: Save all transfers and exit \n:");
            if (scanner.hasNextInt()) {  //Has the user entered value
                int option = scanner.nextInt();
                scanner.nextLine();// scanner misbehaves if you dont put this

                if (option == 1 || option == 2) {
                    System.out.print("How much money would you like to "
                            + "transfer? :");

                    double amount = scanner.nextDouble();//Transfer amount
                    scanner.nextLine();

                    if (option == 1) {
                        Account.transfer(acct1, acct2, amount);
                    } else if (option == 2) {
                        acct2.transfer(acct1, amount); //Transfer fund
                    }

                    System.out.print("Would you like to make another transaction?"
                            + " Enter y for yes and n for no :");
                    String choice = scanner.next().toLowerCase();
                    scanner.nextLine();

                    if (choice.equals("n")) {
                        System.out.println("Thank you");
                        exit = true;
                    }
                } else if (option == 3) {
                    System.out.println("Thank you");
                    exit = true;
                } else {
                    System.out.println("Invalid option.");
                }
            }
        }
    }
}
