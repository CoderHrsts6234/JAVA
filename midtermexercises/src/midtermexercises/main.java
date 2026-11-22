package midtermexercises;

public class main {

	public static void main(String[] args) {
		
		Account[] accounts = {
				new Account("A0", 1000),
				new Account("A1", 2300),
				new Account("A2", 500),
				new Account("A3", 200),
				new Account("A4", 10000)
		};
		
		System.out.println("Initial Account Details:");
		Account.displayAll(accounts);
		 
		Account.depositToAll(accounts, 200);
		
		System.out.println("\nAfter Depositing 200 to All:");
		Account.displayAll(accounts);
		
		System.out.println("\nTotal Balance: " + Account.totalBalance(accounts));
        System.out.println("Average Balance: " + Account.averageBalance(accounts));

        Account maxAccount = Account.findMaxBalance(accounts);
        System.out.println("\nAccount with Maximum Balance:");
        maxAccount.display();
        
        String searchNumber = "A3";
        Account found = Account.searchByNumber(accounts, searchNumber);
        
        if(found != null) found.display();
        else System.out.println("Account not found!");
	}

}
