package Utils;
import java.util.*;


public class DataGenerator {
	public static int[] generateRand(int n) {
		Random rand = new Random();
		int[] array = new int[n];
		
		for(int i = 0; i < n; i++) array[i] = rand.nextInt(100000);
		return array;
	}
	
	public static int[] generateSorted(int n) {
		int[] array = generateRand(n);
		Arrays.sort(array);
		return array;
	}
	
	public static int[] generateOpposite(int n) {
		int[] array = generateSorted(n);
		for(int i = 0; i < n/2; i++) {
			int temp = array[i];
			array[i] = array[n - i - 1];
			array[n - i - 1] = temp;
		}
		return array;
	}

}
