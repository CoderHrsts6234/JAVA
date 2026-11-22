package Algorithms;

import Utils.DataGenerator;


public class QuickSort {
	
	int partition(int arr[], int left, int right) {
		int p = arr[right];
		int i = (left - 1);
		
		for(int j = left; j < right; j++) {
			if(arr[j] < p) {
				i++;
				
				int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
			}
		}
		
		int temp = arr[i + 1];
        arr[i + 1] = arr[right];
        arr[right] = temp;
		
		return i + 1;
	}
	
	public void quick(int arr[], int left, int right) {
		if(left < right) {
			int PI = partition(arr, left, right);
			
			quick(arr, left, PI - 1);
            quick(arr, PI + 1, right);
		}
	}
	
	public static void main(String[] args) {
		int N = 1000;
		QuickSort ob = new QuickSort();
		
		String[] testScenarios = {"Random", "Opposite", "Sorted"};
		
		for(String scenario : testScenarios) {
			int arr[];
			
			System.out.println("\n---" + scenario + "Test of data ---");
			System.out.println("Generating random " + N + " values...");
			
			switch(scenario) {
			case "Random":
				arr = DataGenerator.generateRand(N);
				break;
			case "Opposite":
				arr = DataGenerator.generateOpposite(N);
				break;
			case "Sorted":
				arr = DataGenerator.generateSorted(N);
				break;
			default:
				continue;
			}
			
			System.out.print(scenario + " | The array is sorting....");
			long startTime = System.nanoTime();
			ob.quick(arr, 0, arr.length - 1);
			long endTime = System.nanoTime();
			
			double elapsedTimeMs = (endTime - startTime) / 1000000.0;
			System.out.printf("Completed! The time which passed is: %.2f ms%n", elapsedTimeMs);
		}
	}
}
