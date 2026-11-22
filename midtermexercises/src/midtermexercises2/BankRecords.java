package midtermexercises2;

public class BankRecords {
	private double[][] transactions;
	
	public BankRecords(double[][] data) {
		transactions = data;
	}
	
	public void displayAll() {
		System.out.println("All Transactions");
		for(int i = 0; i < transactions.length; i++) {
			System.out.print("Customer " + (i+1) + ": ");
			for(int j = 0; j < transactions[i].length; j++) {
				System.out.print(transactions[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public double totalBalanceOfCustomer(int index) {
		double sum = 0;
		for(int i = 0; i < transactions[index].length; i++) {
			sum += transactions[index][j];
		}
		return sum;
	}
	
	public double[] totalBalances() {
		double[] totals = new double[transactions.length];
		for(int i = 0; i < transactions.length; i++) {
			totals[i] = totalBalanceOfCustomer(i);
		}
		return totals;
	}
	
	
}
