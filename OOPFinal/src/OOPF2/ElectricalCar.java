package OOPF2;

class ElectricalCar extends Car {
	private double battery_Capacity;
	
	public ElectricalCar(String brand, int year, int number_of_doors, Engine engine, double batteryCapacity) {
		super(brand, year, number_of_doors, engine);
		this.battery_Capacity = batteryCapacity;
	}
	
	public double getBatteryCapacity() {
		return battery_Capacity;
	}
	
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Battery Capacity: " + battery_Capacity + "kWh");
	}
	
	@Override
	public double calculateInsurance() {
		return (2026 - year) * 150 + Engine.getHorsePower() * 8 - battery_Capacity * 50;
	}
}
