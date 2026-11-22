package midtermexercises;

public class Account {
	private String accountNumber;
	private double balance;
	
	public Account(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		if (amount > 0 ) {
			balance += amount;
		} else {
			System.out.println("Error, the amount is lower than zero!");
		}
	}
	
	public void withdraw(double amount) {
		if (balance > 0 && balance > amount) {
			balance -= amount;
		} else {
			System.out.println("Insufficient balance!");
		}
	}
	
	public void display() {
		System.out.println("The account number is " + accountNumber + "\nAnd the current balance is " + balance);
	}
	
	public double getBalance(){
		return balance;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public static double totalBalance(Account[] accounts) {
		double total = 0;
		for(int i = 0; i < accounts.length; i++) total += accounts[i].getBalance();	
		return total;
	}
	
	public static double averageBalance(Account[] accounts) {
		if(accounts.length == 0) return 0;
		return totalBalance(accounts) /accounts.length;
	}
	
	public static Account findMaxBalance(Account[] accounts) {
		if (accounts.length == 0) return null;
		Account max = accounts[0];
		
		for(int i = 0; i < accounts.length; i++) {
			if(accounts[i].getBalance() > max.getBalance()) {
				max = accounts[i];
			}
		}
		return max;
	}

	public static Account searchByNumber(Account[] accounts, String number) {
		for(int i = 0; i < accounts.length; i++) {
			if(accounts[i].getAccountNumber().equals(number)) {
				return accounts[i];
			}
		}
		return null;
	}
	
	public static void displayAll(Account[] accounts) {
		for(int i = 0; i < accounts.length; i++) accounts[i].display();
	}
	
	public static void depositToAll (Account[] accounts, double amount) {
		for(int i = 0; i < accounts.length; i++) accounts[i].deposit(amount);
	} 
	
	
}

