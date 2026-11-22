package Proje;

public class Vehicle {
	
	public void priceMessage() {
		System.out.println("\nWhat is your price range (₺)?");
	}
	
	public void prices(int min_price, int max_price){
		System.out.printf("\nPerfect, your range is: \n\n");
		System.out.printf("Minimum value: %d₺\n", min_price);
	    System.out.printf("Maximum value: %d₺\n", max_price);
	}
	
	
	String[] vehicles = {"Fiat","Volkswagen","Renault","Toyota","Hyundai","Honda"};
	String[] chosenVehicles;
	
	public void setChosenVehicles(String[] chosenVehicles) {
		this.chosenVehicles = chosenVehicles;
	}
	
	public String[] getChosenVehicles() {
		return chosenVehicles;
	}
	
	String[] filter = {"Buy the car", "Filter"};
	String[] subFilter = {"Gear", "Fuel Type", "Traction"};
	String[] filterGear = {"Manual","Automatic"};
	String[] filterFuelType = {"Gasoline","Gasoline & LPG", "Diesel"};
	String[] filterTraction = {"Front Drive","Rear Wheel Drive"};
	
	
}
