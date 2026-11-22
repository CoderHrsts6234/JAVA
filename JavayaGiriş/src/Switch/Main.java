package Switch;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter your numeric value for switch: ");
		 int num = scanner.nextInt();
		 
		 System.out.print("Enter your 2nd numeric value for switch: ");
		 int num2 = scanner.nextInt();
		 
		 switch(num) {
		 case 100:
			 System.out.println("Yes, it is 100!");
			 break;
		 case 200:
			 if (num2 > 100) System.out.println("The last value more than 100!");
			 System.out.println("Yes, it is 200!");
			 break;
			 
		default:
			System.out.println("The number is neither 100 nor 200, it is: " + num);
			break;
		
		 }
		*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your string for switch: ");
		String str = scanner.nextLine();
		
		switch(str) {
		case "Olgu": 
			System.out.println("Yes, it is Olgu");
			break;
		case "Arda": 
			System.out.println("Yes, it is Arda");
			break;
		case "Atakan": 
			System.out.println("Yes, it is Atakan");
			break;
		case "İbo": 
			System.out.println("Yes, it is İbo");
			break;
		default: 
			System.out.println("The name is not these are! It is: " + str);
			break;
		
		}
		
		
	}

}
