package Main;

import Algorithms.*; 
import Utils.DataGenerator;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 50000, 100000}; 
    
        QuickSort qs = new QuickSort();
        MergeSort ms = new MergeSort(); 
        HeapSort hs = new HeapSort();
        InsertionSort is = new InsertionSort();
        
        String[] scenarios = {"Random", "Opposite", "Sorted"};
        
        for (int N : sizes) {
            System.out.println("=== SORTING ALGORITHMS PERFORMANCE TEST (N=" + N + ") ===\n");
            
            for (String scenario : scenarios) {
                
                int[] baseArray;
                System.out.println("--- Scenario: " + scenario + " ---");
                
                switch(scenario) {
                    case "Random": 
                        baseArray = DataGenerator.generateRand(N); 
                        break;
                    case "Opposite": 
                        baseArray = DataGenerator.generateOpposite(N); 
                        break;
                    case "Sorted": 
                        baseArray = DataGenerator.generateSorted(N); 
                        break;
                    default: 
                        baseArray = new int[0];
                        break;
                }

                testAlgorithm("Quick Sort", qs, Arrays.copyOf(baseArray, baseArray.length));
                testAlgorithm("Merge Sort", ms, Arrays.copyOf(baseArray, baseArray.length));
                testAlgorithm("Heap Sort", hs, Arrays.copyOf(baseArray, baseArray.length));
                
                if (N <= 20000) {
                    testAlgorithm("Insertion Sort", is, Arrays.copyOf(baseArray, baseArray.length));
                } else {
                    System.out.printf("%-15s : %s%n", "Insertion Sort", "Atlandı (Çok Yavaş - N>" + N + ")");
                }
                
                System.out.println();
            }
            System.out.println("------------------------------------------------------");
        }
    }

    public static void testAlgorithm(String algName, Object algObj, int data[]) {
        long startTime = System.nanoTime();
        
        if (algObj instanceof QuickSort) {
            ((QuickSort) algObj).quick(data, 0, data.length - 1);
            
        } else if (algObj instanceof MergeSort) {
            ((MergeSort) algObj).sort(data, 0, data.length - 1);
            
        } else if (algObj instanceof HeapSort) {
            ((HeapSort) algObj).sort(data);
            
        } else if (algObj instanceof InsertionSort) {
            ((InsertionSort) algObj).insertionSort(data);
        }
        
        long endTime = System.nanoTime();
        double timeMs = (endTime - startTime) / 1000000.0;
        
        System.out.printf("%-15s : %.2f ms%n", algName, timeMs);
    }
}