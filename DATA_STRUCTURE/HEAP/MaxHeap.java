package DATA_STRUCTURE.HEAP;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        maxHeap.add(30);
        maxHeap.add(10);
        maxHeap.add(20);

        System.out.println("Max-Heap: " + maxHeap); 
        System.out.println("Max element: " + maxHeap.peek());
    }
}
