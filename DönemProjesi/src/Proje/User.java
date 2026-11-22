package Proje;

public class User {
	/* String name, surname, email, user_drive_license;
	int user_age, user_birth_day, user_birth_month, user_birth_year, budget; */
	
	public void access( String name, String surname, String email, int user_license_number, int user_age, int user_birth_day, int user_birth_month, int user_birth_year) {
		System.out.printf("\nExcellent, then your datas are: \n\n");
		System.out.printf("Name: %s\n", name);
	    System.out.printf("Surname: %s\n", surname);
	    System.out.printf("Email: %s\n", email);
	    System.out.printf("Driver License number: %s\n", user_license_number);
	    System.out.printf("Age: %d\n", user_age);
	    System.out.printf("Birth Day: %d/%d/%d\n", user_birth_day, user_birth_month, user_birth_year);
	 // System.out.printf("Budget: %d₺\n", budget);
	
	}
	
}
