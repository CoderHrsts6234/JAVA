package Encap;

public class Car {
	/* public double speed;
	
	public Car() {
		speed = 0;
	}
	
	public void driveCar() {
		System.out.println("Araba sürülüyor, Hız: " + speed);
	} */
	
	// Şimdi private olarak kapsülleme yapacağız (Encapsulation)
	
    private double speed;
    private double friction;
    private double dirt;
	
	public Car() {
		speed = 0;
		friction = 1;
		dirt = 5;
	}
	
	public void driveCar(int _speed) {
		speed = _speed - friction - dirt;
		System.out.println("Araba sürülüyor, Hız: " + speed);
	} 
}
