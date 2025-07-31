package DATA_STRUCTURE.QUEUES;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        Queue<Integer> prioQueue = new PriorityQueue<>();

        prioQueue.offer(30);
        prioQueue.offer(10);
        prioQueue.offer(20);
        prioQueue.offer(40);

        System.out.println("PriorityQueue: " + prioQueue); // [10, 30, 20] (order may vary)

        while (!prioQueue.isEmpty()) {
            System.out.println("Processed: " + prioQueue.poll()); // 10, 20, 30
        }
    }
}
