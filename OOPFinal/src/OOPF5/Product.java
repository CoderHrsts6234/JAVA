package OOPF5;

interface Payment {
	double calculateTax();
}

public class Product {
	
	protected String name;
	protected double price;
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void displayInfo() {
		System.out.println("Ürün: " + ", Fiyat: " + price);
	}
}
