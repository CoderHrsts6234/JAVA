package Algorithms;
import Utils.DataGenerator;

public class InsertionSort {
		public void insertionSort(int arr[]) {
			int n = arr.length;
			
			for(int i = 1; i < n; i++) {
				int key = arr[i];
				int j = i - 1;
				
				while(j >= 0 && arr[j] > key) {
					arr[j + 1] = arr[j];
					j -= 1;
				}
			
				arr[j+1] = key;
			}
		}
		
		public static void main(String[] args) {
			int N = 50000;
			InsertionSort ob = new InsertionSort();
			
			String[] testScenarios = {"Random ", "Opposite ", "Sorted "};
			
			for(String scenario : testScenarios) {
				int arr[];
				
				System.out.println("\n---" + scenario + "Test of data ---");
				System.out.println("Generating random " + N + " values...");
				
				switch(scenario) {
				case "Random ":
					arr = DataGenerator.generateRand(N);
					break;
				case "Opposite ":
					arr = DataGenerator.generateOpposite(N);
					break;
				case "Sorted ":
					arr = DataGenerator.generateSorted(N);
					break;
				default:
					continue;
				}
				
				System.out.print(scenario + " | The array is sorting...");
				long startTime = System.nanoTime();
				ob.insertionSort(arr);
				long endTime = System.nanoTime();
				
				double elapsedTimeMs = (endTime - startTime) / 1000000.0;
				System.out.printf("Completed! The time which passed is: %.2f ms%n", elapsedTimeMs);
			}
		}

}
