package chapter7;

import java.util.Arrays;

public class ArrayManipulations {

	public static void main(String[] args) {
		double[] DOUBLE_ARRAY = {8.4, 9.3, 0.2, 7.9, 3.4};
		Arrays.sort(DOUBLE_ARRAY);
		System.out.printf("\nDoubleArray: ");
		
		for(double value : DOUBLE_ARRAY) System.out.printf("%.1f ", value);
		
		int[] FILLED_INT_ARRAY = new int[10];
		Arrays.fill(FILLED_INT_ARRAY, 7);
		displayArray(FILLED_INT_ARRAY, "FILLED_INT_ARRAY");
		
		int[] INT_ARRAY = {1, 2, 3, 4, 5};
		int[] INT_ARRAY_COPY = new int[INT_ARRAY.length];
		System.arraycopy(INT_ARRAY, 0, INT_ARRAY_COPY, 0, INT_ARRAY.length);
		displayArray(INT_ARRAY, "INT_ARRAY");
		displayArray(INT_ARRAY_COPY, "INT_ARRAY_COPY");
		
		boolean b = Arrays.equals(INT_ARRAY, INT_ARRAY_COPY);
		System.out.printf("\n\nINT_ARRAY %s INT_ARRAY_COPY\n", (b ? "==" : "!="));
		
		int LOCATION = Arrays.binarySearch(INT_ARRAY, 5);
		
		if (LOCATION >= 0) System.out.printf("Found 5 at element %d in INT_ARRAY\n", LOCATION);
		else System.out.println("5 not found in INT_ARRAY");
		
		LOCATION = Arrays.binarySearch(INT_ARRAY, 8763);
		if (LOCATION >= 0) System.out.printf("Found 8763 at element %d in INT_ARRAY\n", LOCATION);
		else System.out.println("8763 not found in INT_ARRAY");
	}
	
	public static void displayArray(int[] array, String DESCRIPTION) {
		System.out.printf("\n%s: ", DESCRIPTION);
		
		for(int value : array) System.out.printf("%d ", value);
	}

}
