package Structures;

import java.util.ArrayList;

import Utils.DataGenerator; 

public class CustomHeap {
    
    private ArrayList<Integer> heap;

    public CustomHeap() {
        this.heap = new ArrayList<>();
    }

   
    private int parent(int i) { return (i - 1) / 2; }
    private int leftChild(int i) { return 2 * i + 1; }
    private int rightChild(int i) { return 2 * i + 2; }

    
    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    
    public void insert(int value) {
        heap.add(value); 
        heapifyUp(heap.size() - 1); 
    }

    private void heapifyUp(int i) {
       
        while (i > 0 && heap.get(i) > heap.get(parent(i))) {
            swap(i, parent(i));
            i = parent(i); 
        }
    }

  
    public int extractMax() {
        if (heap.isEmpty()) throw new IllegalStateException("Heap boş!");

        int max = heap.get(0); 
        int lastElement = heap.remove(heap.size() - 1); 

        if (!heap.isEmpty()) {
            heap.set(0, lastElement); 
            heapifyDown(0); 
        }
        return max;
    }

    private void heapifyDown(int i) {
        int maxIndex = i;
        int left = leftChild(i);
        int right = rightChild(i);

       
        if (left < heap.size() && heap.get(left) > heap.get(maxIndex)) {
            maxIndex = left;
        }

       
        if (right < heap.size() && heap.get(right) > heap.get(maxIndex)) {
            maxIndex = right;
        }

       
        if (i != maxIndex) {
            swap(i, maxIndex);
            heapifyDown(maxIndex);
        }
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println("--- Custom Heap Validation Test ---");

        
        int N = 10; 
        
       
        int[] input = DataGenerator.generateRand(N);
        
        System.out.print("Incoming Random Data: ");
        for(int n : input) System.out.print(n + " ");
        System.out.println("\n");

        
        CustomHeap myHeap = new CustomHeap();
        for(int n : input) {
            myHeap.insert(n);
        }

       
        System.out.print("Output from Heap: ");
        while(!myHeap.isEmpty()) {
            System.out.print(myHeap.extractMax() + " ");
        }
        
        System.out.println("\n\nIf the numbers are in descending order, the code is correct.");
    }
}