# Heap 
    A Heap is a specialized tree-based data structure that satisfies the heap property:

#   Min-Heap: Parent node ≤ Child nodes (smallest element at root)

#   Max-Heap: Parent node ≥ Child nodes (largest element at root)

# In Java, heaps are implemented using the PriorityQueue class from java.util.

# Heap Basics
#    Key Features
        Complete Binary Tree: Filled level-by-level from left to right.

#       Efficient Operations:

        Insertion (add()): O(log n)

        Removal (poll()): O(log n)

        Peek (peek()): O(1)

        No Index-Based Access: Can't directly access elements like in an array.

        Thread-Unsafe: Use PriorityBlockingQueue for thread safety.

# Why Use Min Heap?
To get/remove the minimum element in O(1) time.

To insert a new element in O(log n) time.

# Widely used in:

--> Dijkstra's Algorithm

--> Top-K problems

--> Priority queues

--> Heap sort


# Complete Binary Tree Property:
All levels are completely filled except possibly the last.

The last level is filled from left to right.

        1                
      /   \
     3     2
    / \   /
   5  4  6

# In Java, PriorityQueue is a Min Heap by default.
So the smallest element always comes out first when you call .poll().


# Key Heap Operations
## Method	                Description	                           Time Complexity
add(E e) / offer(E e)	Inserts an element	                            O(log n)
poll()	                Removes and returns the root	                O(log n)
peek()	                Returns (but doesn't remove) the root	        O(1)
size()	                Returns the number of elements	                O(1)
isEmpty()	            Checks if the heap is empty	                    O(1)


# Internal Implementation
     Backed by an array (for space efficiency).
     
#     Parent-Child Index Relationship:
     
        Parent of i = (i - 1) / 2
        
        Left child of i = 2*i + 1
        
        Right child of i = 2*i + 2
        
#     Heapify: Adjusts the heap after insertion/deletion to maintain the heap property.

# Common Use Cases
#    Priority Scheduling

      --> Task scheduling (OS), Dijkstra's algorithm.

#    Heap Sort

      --> Sort elements in O(n log n) time.

#    K-th Largest/Smallest Element

      --> Use a min-heap to track top K elements.

#    Merge K Sorted Lists

     --> Efficiently merge multiple sorted streams.