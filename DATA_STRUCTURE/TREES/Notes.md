# Trees 
    A tree is a hierarchical data structure consisting of nodes connected by edges. Each tree has:

    A root node (topmost node)

    Child nodes (nodes below a parent)

    Leaf nodes (nodes without children)

# The Tree data structure can be useful in many cases:

--> Hierarchical Data: File systems, organizational models, etc.
--> Databases: Used for quick data retrieval.
--> Routing Tables: Used for routing data in network algorithms.
--> Sorting/Searching: Used for sorting data and searching for data.
--> Priority Queues: Priority queue data structures are commonly implemented using trees, such as binary heaps.


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


# 1. Binary Tree (BT)
A Binary Tree is a tree where each node can have at most two children:

Left child

Right child

✅ Rules:

Each node can have 0, 1, or 2 children.

No order rule for the node values.

🧠 It’s just a structure — not sorted.

     A
    / \
   B   C
  /     \
 D       E



# 2. Binary Search Tree (BST)
A Binary Search Tree is a special type of binary tree where the nodes are arranged in a sorted order.

✅ Rules:

Left child < Parent

Right child > Parent

No duplicates (usually)

🧠 BST makes it fast to search, insert, or delete values.
     50
    /  \
  30    70
 / \    / \
20 40  60 80


# 🌲 What is an AVL Tree?
AVL Tree is a Binary Search Tree that keeps itself balanced after every insertion or deletion.

✅ Named after its inventors: Adelson-Velsky and Landis

# Why balance matters?
In a regular BST, if you insert sorted data (like 1, 2, 3, 4...), the tree becomes unbalanced and behaves like a linked list:

1
 \
  2
   \
    3
     \
      4
🧨 This causes search time to degrade to O(n) instead of O(log n).

# ✅ AVL Tree Rules
Follows all rules of a Binary Search Tree

Maintains a balance factor for every node:
# balanceFactor = height(left subtree) - height(right subtree)


# For every node, balance factor must be -1, 0, or +1
#    Balance Factor	       What It Means
    0	                   Left and right subtrees are equal height
    +1	                   Left subtree is 1 level taller
    -1	                   Right subtree is 1 level taller

# ❌ >1 or <-1	Node is unbalanced — needs rotation

# 🚨 If it’s not balanced, we apply rotations to fix it.
# ⚖️ Rotations in AVL Tree
There are 4 types of rotations to restore balance:

# 1. LL Rotation (Right Rotation) – Occurs when a node is inserted into the left subtree of left child.
Unbalanced at:      Fix with Right Rotate
     z                   y
    /                   / \
   y        =>         x   z
  /
 x

# 2. RR Rotation (Left Rotation) – Node inserted into right subtree of right child.
Unbalanced at:      Fix with Left Rotate
 z                      y
  \                    / \
   y       =>         z   x
    \
     x

# 3. LR Rotation (Left-Right) – Insert into right subtree of left child
Unbalanced at:         z              z
    z                 /             /
   /    => Left      x     =>     x
  y         +      /             / \
   \       Right   y            y   z
    x

# 4. RL Rotation (Right-Left) – Insert into left subtree of right child
Unbalanced at:         z              z
    z                    \              \
     y       => Right     x   =>      x
    /             +         \        / \
   x             Left         y      z


# Levels
Nodes 10 and 25 are at the same level relative to their parent 20, so they count as one level in terms of height calculation.

Let’s clarify this with a breakdown:

AVL Tree Height Concept:
The height of a node = the length of the longest path from that node to a leaf.

A leaf node has height 0.
      30
     /  \
   20    40
  /  \
10   25


