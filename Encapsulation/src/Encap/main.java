package Encap;

public class main {

	public static void main(String[] args) {
		Car a1 = new Car();
		
		/* a1.driveCar();
		a1.speed = 10;
		a1.driveCar();
		a1.speed = 50;
		
		drivingCarManager dcm1 = new drivingCarManager();
		
		dcm1.drivetheCar(a1);
		
		*/
		
		a1.driveCar(10);
		a1.driveCar(40);
		a1.driveCar(50);
		a1.driveCar(80);
		
        drivingCarManager dcm1 = new drivingCarManager();
		
		dcm1.drivetheCar(a1);

	}

}
