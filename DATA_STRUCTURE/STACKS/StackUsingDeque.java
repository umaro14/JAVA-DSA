package DATA_STRUCTURE.STACKS;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackUsingDeque {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack); // [30, 20, 10]

        System.out.println("Top element: " + stack.peek()); // 30

        System.out.println("Popped: " + stack.pop()); // 30
        System.out.println("Stack after pop: " + stack); // [20, 10]

        System.out.println("Is stack empty? " + stack.isEmpty()); // false
        };
}

