package lab4;


import java.util.Random;

//************************************************************
//Account.java
//
//A bank account class with methods to deposit to, withdraw from,
//change the name on, and get a String representation
//of the account.
//************************************************************

public class Account {
	private double balance;
	private String name;
	private long acctNum;
	private static int numAccounts =0;

	// -------------------------------------------------
	// Constructor -- initializes balance, owner, and account number
	// -------------------------------------------------
	public Account(double initBal, String owner, long number) {
		balance = initBal;
		name = owner;
		acctNum = number;
		numAccounts++;
	}
	// -------------------------------------------------
	// Constructor -- initializes balance, owner, and account number
	// -------------------------------------------------
	public Account(double initBal, String owner) {
		this.balance = initBal;
		this.name = owner;
		Random generator = new Random();
		acctNum = Math.abs(generator.nextLong());
		numAccounts++;
	}
	// -------------------------------------------------
	// Constructor -- initializes balance equal 0, owner and a random account
	// number
	// -------------------------------------------------
	public Account(String owner) {
		balance = 0;
		name = owner;
		Random generator = new Random();
		acctNum = generator.nextLong();
		numAccounts++;

	}

	// -------------------------------------------------
	// Checks to see if balance is sufficient for withdrawal.
	// If so, decrements balance by amount; if not, prints message.
	// -------------------------------------------------
	public void withdraw(double amount) {
		if (balance >= amount)
			balance -= amount;
		else
			System.out.println("Insufficient funds");
	}

	// -------------------------------------------------
	// takes a fee and deducts that fee from the account.
	// Checks to see if balance is sufficient for withdrawal.
	// If so, decrements balance by amount; if not, prints message.
	// -------------------------------------------------
	public void withdraw(double amount, double fee) {

		if (balance >= amount + fee)
			balance = balance - amount - fee;
		else
			System.out.println("Invalid Transaction: Balance is "
                                + "insufficient for transaction");
	}

	// -------------------------------------------------
	// Adds deposit amount to balance.
	// -------------------------------------------------
	public void deposit(double amount) {
		balance += amount;
	}

	// -------------------------------------------------
	// Returns balance.
	// -------------------------------------------------
	public double getBalance() {
		return balance;
	}

	// -------------------------------------------------
	// Returns a string containing the name, account number, and balance.
	// -------------------------------------------------
	public String toString() {
		return "Name:" + name + "\nAccount Number: " + acctNum 
                        + "\nBalance: " + balance;
	}

	//-------------------------------------------------
	//Returns the number of accounts
	//-----------------------------------------------
	public static int getNumAccounts() {
		return numAccounts;
	}
	
	
	//----------------------------------------------------------------------
	// Creates a new account that is the sum of the balance of two accounts 
        //and closes the two original accounts
	//----------------------------------------------------------------------
	public static Account consolidate(Account acct1, Account acct2) {
		if (acct1.name.equalsIgnoreCase(acct2.name) 
                        && acct1.acctNum != acct2.acctNum) {
                    double newBalance = acct1.getBalance() + acct2.getBalance();
			Account newAccount = new Account(newBalance, acct1.name);
			acct1.close();
			acct2.close();
			return newAccount;
		} else {
			System.out.println();
			System.out.println("Account " + acct1.name + " and "
            			+ acct2.name + " are not consolidatable.");
			System.out.println();
			return null;
		}
	}

	//------------------------------------------------------------------
	//Method close is used to close accounts
	//---------------------------------------------------------------
	public void close() {
		name += " CLOSED";
		balance = 0;
		numAccounts--;
	}

	//-------------------------------------------------------------------
        //Method getAcctNumber
	//Return the account number of the account
	//-----------------------------------------------------------------
	public  long getAcctNumber() {		
		return acctNum;
	}

	//-----------------------------------------------------------------
        //method transfer
        //paramenter acct, amount
	// Transfers money from one bank account to another bank account
	//--------------------------------------------------------------------
	public void transfer(Account acct, double amount) {
		
		if (amount < 0) {
			System.out.println("Invalid transfer- No enough money"
                                + " in the account");
		} else if (balance > amount) {			
			acct.balance += amount;
                        balance -= amount;
			System.out.println(amount + "  transfered from account "
			+ this.acctNum	+ " to account " + acct.acctNum 
                                + " was succcessfull.");
		} else {
			System.out.println("Insufficient funds to transfer "
                                + "from account " + this.acctNum + ".");
		}
	}

	//-------------------------------------------------------------------------
	// Transfers money from acct1 to acct2
	//-------------------------------------------------------------------------
	public static void transfer(Account acct1, Account acct2, double amount) {
		acct1.transfer(acct2, amount);
	}
}
