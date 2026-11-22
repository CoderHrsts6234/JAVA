package Quiz1;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product();
		TheBasket theBasket = new TheBasket();
		
		product.displayMessage();
		product.scanClass1();
		product.displayMessage2();
		product.scanClass2();
		product.checkStock();
		
		theBasket.displayMessage3();
	}

}
