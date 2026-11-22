package Proje;

public class Main {

	public static void main(String[] args) {
		User user = new User();
		ScanClass scanclass = new ScanClass();
		Vehicle vehicle = new Vehicle();
		Messages messages = new Messages();
		
		
		// Proje kullanıcıdan bilgilerini almalı
		
		messages.displayMessage1();
		
		scanclass.datas1();
		
		// Araba mı motor mu?
		/*
		do {
			
			messages.displayMessage2();
			String myChoice = scan.nextLine();
			
			if (User_drive_license.equalsIgnoreCase("A") && myChoice.equals("car")) {
		        System.out.println("With \"A\" license, you cannot choose a car. Please choose a bike.");
		    } else if (myChoice.equals("car") || myChoice.equals("bike")) {
		        System.out.println("You chose: " + myChoice);
		        break; 
		    } else {
		        System.out.println("Invalid choice! Please enter 'car' or 'bike'.");
		    }
			
		} while(true);
		*/
		
		// Fiyat aralığı
		
		vehicle.priceMessage();
		scanclass.datas2();
		
		// scan.nextLine(); 
		
		// Marka seçimi
		
		messages.displayMessage2();
		scanclass.choosingbrand();	
	
	}
}
