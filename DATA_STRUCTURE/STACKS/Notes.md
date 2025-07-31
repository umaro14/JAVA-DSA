# Stacks in Java 

A stack is a Last-In-First-Out (LIFO) data structure where the last element added is the first one to be removed. It supports three main operations:

# Push – Add an element to the top.

# Pop – Remove and return the top element.

# Peek – View the top element without removing it.

# Java provides the Stack class in java.util, but it's recommended to use Deque (e.g., ArrayDeque) for better performance.

# Common Use Cases of Stacks
--> Undo/Redo operations (e.g., in text editors).

--> Function call stack in recursion.

--> Balanced parentheses checking (compilers).

--> Backtracking algorithms (e.g., maze solving)

# Time Complexity
Operation	Time Complexity
push()	O(1)
pop()	O(1)
peek()	O(1)
isEmpty()	O(1)