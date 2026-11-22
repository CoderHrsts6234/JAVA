package constructor;

public class Car {
	public String model;
	public int pyear;
	
	public Car(String _model, int year) {
		System.out.println("Nesne üretiliyor...");
		model = _model;
		pyear = year;
	} /* Constructor budur */
	
	public void printCar(){
		System.out.println("Araba modeli: " + model);
		System.out.println("Araba üretim tarihi: " + pyear);
	}
}
