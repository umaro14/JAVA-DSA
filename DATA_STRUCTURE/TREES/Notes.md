# Trees 
    A tree is a hierarchical data structure consisting of nodes connected by edges. Each tree has:

    A root node (topmost node)

    Child nodes (nodes below a parent)

    Leaf nodes (nodes without children)


# Real-World Applications
    File Systems (Directory structure)

    Database Indexing (B-trees, B+ trees)

    Networking (Routing algorithms)

    Compilers (Syntax trees)

    AI (Decision trees)


# Common Tree Operations
    Operation	BST (Avg)	BST (Worst)	AVL Tree
    Search	     O(log n)	O(n)	     O(log n)
    Insert	     O(log n)	O(n)	     O(log n)
    Delete	     O(log n)	O(n)	     O(log n)

# Key Differences Between DFS and BFS
# Feature	         DFS	                         BFS
Data Structure	     Stack (implicit recursion)	     Queue
Memory Usage	     Less (height of tree)	         More (width of tree)
Use Cases	         Pathfinding, solving mazes	     Shortest path, level-order
Order of Traversal	 Depth-first	                 Level-by-level


# When to Use Which?
# Use DFS when:

You need to explore all possible paths (e.g., solving puzzles)

Memory is limited (for deep trees)

# Use BFS when:

You need the shortest path (e.g., GPS navigation)

The tree is very wide (shallow depth)

Both are fundamental algorithms used in tree/graph problems like:

Finding connected components

Checking if a path exists

Serializing/deserializing trees