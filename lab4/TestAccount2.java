package lab4;

//************************************************************
//TestAccounts2.java
//
//A simple program to test the consolidation and close of the Account class.
//************************************************************
import java.util.Scanner;

public class TestAccount2 {

    /**
     * method main Controls the Account program
     */
    public static void main(String[] args) {

        //Declare variable
        int NumOfAccts = 3;
        long acctNum = 100;
        Account accounts[] = new Account[NumOfAccts];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < accounts.length; i++) 
        {
            System.out.print("Enter the name for accounts " + (i + 1) + ": ");
            accounts[i] = new Account(100, scan.nextLine(), acctNum++);
        }

        for (int i = 0; i < accounts.length; i++) 
        {
            System.out.println(accounts[i]);
        }

        System.out.println();
        accounts[0].close();
        Account newAccount = Account.consolidate(accounts[1], accounts[2]);
         
        //print account information 
        for (int i = 0; i < accounts.length; i++) 
        {
            System.out.println(accounts[i]);
        }

       

    }

}
