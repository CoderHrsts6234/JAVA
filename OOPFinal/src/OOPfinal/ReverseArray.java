package OOPfinal;

public class ReverseArray {

	public static void main(String[] args) {
		int[] array = {10, 20, 30, 40, 50};
		
		System.out.println("Original array:");
		for (int element : array) {
			System.out.print(element + " ");
		}
		System.out.println();
		
		reverseArray(array);
		
		System.out.println("Reversed array:");
		
		for(int element : array) {
			System.out.print(element + " ");
		}
		
		

	}
	
	public static void reverseArray(int array[]) {
		int n = array.length;
		
		for(int i = 0; i < n/2; i++) {
			int temp = array[i];
			array[i] = array[n - i - 1];
			array[n - i - 1] = temp;
		}
	}
	
}
