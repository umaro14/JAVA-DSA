# GRAPHS
Graphs are fundamental data structures that model pairwise relationships between objects. Here's a comprehensive guide to graph theory and implementations in Java.

# 1. Graph Basics
# Key Concepts
Vertex (Node): Fundamental unit

Edge: Connection between vertices

Directed/Undirected: Edges with/without direction

Weighted/Unweighted: Edges with/without values

Cyclic/Acyclic: Contains cycles or not

# Understanding Graph Basics
    A graph is a set of nodes (also called vertices) connected by edges.

    ndirected graph → edges have no direction (A–B is the same as B–A)

    Directed graph → edges have direction (A→B is different from B→A)

    Weighted graph → edges have a cost/weight (e.g., distance, time)

    Unweighted graph → all edges have equal cost

# Example:
# Undirected
A ---- B           
|      |
C ---- D

# Directed
0 → 1
↓
2


# 2. Representing Graphs in Java
There are two common ways:

# Adjacency List → Store each node and a list of connected nodes.

    --> Space efficient for sparse graphs.

# Adjacency Matrix → 2D array where matrix[i][j] = 1 if there’s an edge.

    --> Good for dense graphs but uses more memory.