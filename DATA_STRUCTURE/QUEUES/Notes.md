# A queue 
--> is a First-In-First-Out (FIFO) data structure where the first element added is the first one to be removed. It supports two main operations:

# Enqueue (Add) – Insert an element at the rear.

# Dequeue (Remove) – Remove and return the front element.

# Java provides several implementations:

  # --> LinkedList (implements Queue interface)

  # --> ArrayDeque (faster for most use cases)

# PriorityQueue (elements are ordered by priority)

# ArrayDeque (Faster Alternative)

# Common Use Cases of Queues
Breadth-First Search (BFS) in graphs.

Task scheduling (e.g., printer queue).

Message queues in distributed systems.

Handling requests in web servers.

# Concept	Java Method	                    Alternative (Safer)
# Enqueue   (Add to rear)	add()	        offer()
# Dequeue  (Remove from front)	remove()	poll()