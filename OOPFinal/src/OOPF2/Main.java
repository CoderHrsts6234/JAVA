package OOPF2;

public class Main {

	public static void main(String[] args) {
		Engine gasEngine = new SimpleEngine("Gasoline", 180);
		Engine electricEngine = new SimpleEngine("Electric", 250);
		
		Vehicle car = new Car("Toyota", 2018, 4, gasEngine);
		Vehicle electricCar = new ElectricalCar("Tesla", 2023, 2, electricEngine, 75.5);
		
		Vehicle[] vehicles = {car, electricCar};
		
		System.out.println("Vehicle Information: ");
		for(Vehicle v: vehicles) {
			v.displayInfo();
			System.out.println("Age: "+ v.calculateAge(2026));
			System.out.println("Insurance Cost: $" + v.calculateInsurance());
			System.out.println();
		}
	}

}
