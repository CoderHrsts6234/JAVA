package OOPF5;

public class Electronics extends Product implements Payment{
	private int warrantyMonths;
	
	public Electronics(String name, double price, int warrantyMonths) {
		super(name, price);
		this.warrantyMonths = warrantyMonths;
	}
	
	@Override
	public double calculateTax() {
		return this.price * 0.18;
	}
	
	public double calculateFinalPrice() {
		return this.price + calculateTax();
	}

}
