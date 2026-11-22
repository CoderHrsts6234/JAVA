package OOPF2;

interface Engine {
    int getHorsePower();
    String getEngineType();
}

abstract class Vehicle{
	protected String brand;
	protected int year;
	
	public Vehicle(String brand, int year) {
		this.brand = brand;
		this.year = year;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public int getYear() {
		return year;
	}
	
	public abstract void displayInfo();
	
	public int calculateAge(int currentYear) {
		return currentYear - year;
	}
	
	public abstract double calculateInsurance();
}

