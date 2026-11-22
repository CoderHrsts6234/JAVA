package Proje;
import java.util.Scanner;

public class ScanClass {
	Scanner scan = new Scanner(System.in);
	User user = new User();
	Vehicle vehicle = new Vehicle();
	
	public void datas1() {
		System.out.println("Please enter your name:");
		String Name = scan.nextLine();
		System.out.println("Please enter your surname:");
		String Surname = scan.nextLine();
		String Email;
		
		while(true) {
			System.out.println("Please enter your email:");
			Email = scan.nextLine();
			
			if(Email.contains("@")) {
				// System.out.println("Valid email entered: " + Email);
		        break;
			} else {
				System.out.println("Invalid email! Please enter a valid email address.");
			}
		}
		
		// user_age, user_license_number, user_birth_day, user_birth_month, user_birth_year
		System.out.println("Please enter your license number:");
		int User_license_number = scan.nextInt();
		System.out.println("Please enter your age:");
		int User_age = scan.nextInt();
		System.out.println("Please enter your birthday:");
		int User_birth_day = scan.nextInt();
		System.out.println("Please enter your birthmonth:");
		int User_birth_month = scan.nextInt();
		System.out.println("Please enter your birthyear:");
		int User_birth_year = scan.nextInt();
	    /*
		System.out.println("Please enter your average budget (₺):");
		int budget = scan.nextInt();
		*/
		
		user.access(Name, Surname, Email, User_license_number, User_age, User_birth_day, User_birth_month, User_birth_year);
	}
	
	
	public void datas2() {
		int min_val, max_val;
		do {
		    System.out.println("\nPlease enter your minimum value:");
		    min_val = scan.nextInt();
		    System.out.println("\nPlease enter your maximum value:");
		    max_val = scan.nextInt();

		    if (min_val >= max_val) {
		        System.out.println("\nThe minimum value must be less than the maximum value.");
		    }

		} while (min_val >= max_val);
		
		scan.nextLine(); 
	}
	
	
	public void choosingbrand() {
		for(int i = 0; i < vehicle.vehicles.length; i++) {
			System.out.println((i+1) + ". " + vehicle.vehicles[i]);
		}

        System.out.println("\nSelect vehicles (example: 1 or 1,3,5):");
        String choice = scan.nextLine(); 
       
        String[] selections = choice.split(","); //yazılan tek değeri selections adlı diziye parçalayarak atıyor .split
        String[] chosen = new String[selections.length];
		
		for(int i = 0; i < selections.length; i++) {
			int index = Integer.parseInt(selections[i].trim()) - 1; // boşluklu yazımda boşlukları siler .trim ; parseInt ise yazılan stringi integer haline getirir; "-1" kullanıcı ilk markayı seçmek için "1" yazarsa "0." elemanı belirtsin diyedir
 			if (index >= 0 && index < vehicle.vehicles.length) {
		        chosen[i] = vehicle.vehicles[index];
		    }
		}
		
		vehicle.setChosenVehicles(chosen);
		
		System.out.println("You have chosen:\n");
		for (String car_choice : vehicle.getChosenVehicles()) {
		    System.out.println(car_choice);
		}
	}
	
}
