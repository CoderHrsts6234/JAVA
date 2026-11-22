package Lab2;

public class Main {

	public static void main(String[] args) {
		employee employee1 = new employee("Olgu Açıkgöz", "Computer Engineer", 50000);
		employee employee2 = new employee("Melih Tarakçı", "Doctor", 120000);
		
		System.out.println("\n Employee Details:");
		employee1.printEmployeeDetails();
		employee2.printEmployeeDetails();
		
		employee1.raiseSalary(8);
		employee2.raiseSalary(12);
		
		System.out.println("\n After raising salary:");
		System.out.println("\n %8 for 'Olgu Açıkgöz':");
		employee1.printEmployeeDetails();
		System.out.println("\n %12 for 'Melih Tarakçı':");
		employee2.printEmployeeDetails();
		
	}

}
