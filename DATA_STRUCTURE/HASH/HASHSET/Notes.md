 # A HashSet 
    --> is a unordered collection of unique elements that implements the Set interface. It is backed by a HashMap and provides O(1) average time complexity for basic operations like add(), remove(), and contains().

# HashSet Basics
# Key Features
    Stores unique elements (no duplicates).

    Allows null values (but only one null can be stored).

    Unordered (no guaranteed iteration order; use LinkedHashSet for order).

    Not thread-safe (use Collections.synchronizedSet() or ConcurrentHashMap.newKeySet() for thread safety).

# Important HashSet Methods
# Method	Description
# --> add(E e)	Adds an element (ignores duplicates).
# --> remove(Object o)	Removes the element if present.
# --> contains(Object o)	Checks if an element exists.
# --> size()	Returns the number of elements.
# --> isEmpty()	Checks if the set is empty.
# --> clear()	Removes all elements.
# --> iterator()	Returns an iterator for traversal.

# How HashSet Works Internally
Backed by a HashMap: Each element is stored as a key in the underlying HashMap (values are dummy objects).

Hashing: Uses hashCode() to determine bucket location.

Collision Handling: Similar to HashMap (linked list or balanced tree in Java 8+).

# Time Complexity
Operation	Average Case	Worst Case (many collisions)
add()	    O(1)	        O(log n) (Java 8+)
remove()	O(1)	        O(log n) (Java 8+)
contains()	O(1)	        O(log n) (Java 8+)

# Common Use Cases
Removing duplicates from a list.

Checking membership (e.g., tracking visited nodes in a graph).

Mathematical set operations (union, intersection, difference).


# HashSet vs. Other Setss
# Set Type	          Ordering	                        Allows null	      Thread-Safe
HashSet	              Unordered	                          Yes	              ❌ No
LinkedHashSet	      Insertion-order	                  Yes	              ❌ No
TreeSet	              Sorted (natural/comparator order)	  ❌ No	             ❌ No
CopyOnWriteArraySet	  Insertion-order	                  ✅Yes               ✅Yes