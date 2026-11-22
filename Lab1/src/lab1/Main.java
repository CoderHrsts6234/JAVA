package lab1;
import java.util.Scanner;

public class Main {
	
	//Faktoriyel hesaplama

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, fact = 1;
		
		n = scan.nextInt();
		
		if(n < 0) {
			System.out.println("N must be bigger than 0");
		} else {
			for(int i = 1; i <= n; i++) {
				fact *= i;
			}
			System.out.println("The factorial of n is = " + fact);
		}
	}

}
