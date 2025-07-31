package DATA_STRUCTURE.QUEUES;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);                    //throws exception if queue is full (unlikely in LinkedList)
        queue.offer(20);                  //// returns false if queue is full (safer)

        

        System.out.println("Queue: " + queue);
        System.out.println("Front element: " + queue.peek()); // 10

        // Dequeue (remove front element)
        System.out.println("Removed: " + queue.remove()); // 10 (throws exception if empty)
        System.out.println("Removed (safer): " + queue.poll()); // 20 (returns null if empty)

        System.out.println("Queue after removal: " + queue); // []

      
        System.out.println("Is queue empty? " + queue.isEmpty()); // true
    }
}
