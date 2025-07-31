package DATA_STRUCTURE.STACKS;

import java.util.Stack;

public class StatckDemo {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();

        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);

        System.out.println("Stack: " + myStack);
      
        System.out.println("Top element: " + myStack.peek()); // 30

        // Pop (remove top element)
        System.out.println("Popped: " + myStack.pop()); // 30
        System.out.println("Stack after pop: " + myStack); // [10, 20]

        // Check if stack is empty
        System.out.println("Is stack empty? " + myStack.isEmpty()); // false
    }
}
