package DATA_STRUCTURE.QUEUES;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueUsingArrayDequeue {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();

        queue.offer("Alice");
        queue.offer("Bob");
        queue.offer("Charlie");

        System.out.println("Queue: " + queue); // [Alice, Bob, Charlie]

        System.out.println("Front: " + queue.peek()); // Alice

        System.out.println("Removed: " + queue.poll()); // Alice
        System.out.println("Queue after poll: " + queue); // [Bob, Charlie]
    }
};