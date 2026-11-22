package chapter7;

public class InitArray {

	public static void main(String[] args) {
		if (args.length != 3) System.out.println("Error: Please re-enter the entire command, including\n" + "an array size, initial value and increment.");
		
		else {
			int ARRAY_LENGTH = Integer.parseInt(args[0]);
			int[] array = new int[ARRAY_LENGTH];
			
			int INITIAL_VALUE = Integer.parseInt(args[1]);
			int INCREMENT = Integer.parseInt(args[2]);
			
			for(int counter = 0; counter < array.length; counter++) array[counter] = INITIAL_VALUE + INCREMENT * counter;
			
			System.out.printf("%s%8s\n", "Index", "Value");
			
			for(int i = 0; i < array.length; i++) System.out.printf("%5d%8d\n", i, array[i]);
		}

	}

}
