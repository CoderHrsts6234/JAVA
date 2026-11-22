package ObjectClass;

public class calculator {

	public static void main(String[] args) {
		calculatorCodes hm1 = new calculatorCodes();
		hm1.insert(5,10);
		hm1.insert(12);
		System.out.println(hm1.rotate_the_value_to_main());
	}

}
