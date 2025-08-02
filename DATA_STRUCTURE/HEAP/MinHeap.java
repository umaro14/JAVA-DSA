package DATA_STRUCTURE.HEAP;

import java.util.PriorityQueue;

public class MinHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        minHeap.add(30);
        minHeap.add(20);
        minHeap.add(100);
        minHeap.add(10);
        minHeap.add(40);
        minHeap.add(500);
        minHeap.add(60);

        System.out.println("Min-Heap: " + minHeap);
        
        System.out.println("Min Element: " + minHeap.peek());

        System.out.println("Removed: " + minHeap.poll());
        System.out.println("Min-Heap after removal: " + minHeap);

        for(int value : minHeap) {
            System.out.println("Values: " + minHeap.peek());
        }

    }
}
