package OOPF2;

class Car extends Vehicle{
	private int number_of_doors;
	private Engine engine;
	
	public Car(String brand, int year, int number_of_doors, Engine engine) {
		super(brand, year);
		this.number_of_doors = number_of_doors;
		this.engine = engine;
	}
	
	public int getNumberOfDoors() {
		return number_of_doors;
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Car Brand: " + brand);
		System.out.println("Car Year: " + year);
		System.out.println("Number of doors: " + number_of_doors);
		System.out.println("Engine type: " + engine.getEngineType());
		System.out.println("Horse power: " + engine.getHorsePower());
	}
	
	@Override
	public double calculateInsurance() {
		return (2026 - year) * 200 + engine.getHorsePower() * 10;
	}

}
