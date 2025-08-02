# A HashMap is a key-value storage data structure that provides O(1) average time complexity for get() and put() operations. It implements the Map interface and uses hashing to store and retrieve elements efficiently.

# 1. HashMap Basics
  # Key Features

    Stores data in key-value pairs.
    
    No duplicate keys (each key maps to one value).
    
    Allows null keys and values (but only one null key).
    
    Unordered (no guaranteed iteration order; use LinkedHashMap for order).
    
    Not thread-safe (use ConcurrentHashMap for thread safety).

# Important HashMap Methods
# --> Method	Description
# --> put(K key, V value)	Inserts a key-value pair (replaces if key exists).
# --> get(K key)	Returns the value for the given key (null if absent).
# --> remove(K key)	Removes the key-value pair.
# --> containsKey(K key)	Checks if a key exists.
# --> containsValue(V value)	Checks if a value exists.
# --> keySet()	Returns all keys as a Set.
# --> values()	Returns all values as a Collection.
# --> entrySet()	Returns all key-value pairs as Set<Entry<K,V>>.

# How HashMap Works Internally
# --> Hashing: Uses hashCode() of keys to compute bucket location.

# --> Collision Handling: If two keys have the same hash, they are stored in a linked list (or balanced tree in Java 8+ if too many collisions).

# --> Load Factor & Resizing: When the HashMap reaches a threshold (default: 75% full), it doubles its size and rehashes all entries.

# Time Complexity
# --> Operation	Average Case	Worst Case (many collisions)
# --> put()	O(1)	O(log n) (Java 8+)
# --> get()	O(1)	O(log n) (Java 8+)
# --> remove()	O(1)	O(log n) (Java 8+)

# Best Practices
# --> Override hashCode() & equals() for custom key objects.

# --> Avoid mutable keys (changing a key after insertion breaks the HashMap).

# --> Use LinkedHashMap if insertion order matters.

# --> Use ConcurrentHashMap in multithreaded environments.


# Common Use Cases
    -->Caching (store computed results for quick lookup).

    -->Frequency counting (e.g., counting word occurrences).

    -->Database indexing (fast key-based retrieval).

    -->Storing configurations (key-value settings).


# Why HashMap is Not Thread-Safe in Java ?
HashMap is not thread-safe because it lacks internal synchronization mechanisms, which can lead to data corruption, infinite loops, and race conditions when accessed by multiple threads simultaneously. Here's why:

1. Race Conditions During put() Operations
Problem:
When two threads call put() at the same time:

They might compute the same bucket index for different keys.

One thread’s update could be overwritten by another.

This leads to lost data.

# Map<String, Integer> map = new HashMap<>();

# Thread t1 = () -> map.put("A", 1);  
# Thread t2 = () -> map.put("B", 2);  

# t1.start();  
# t2.start();  
// Possible outcome: Only one entry ("A" or "B") remains.