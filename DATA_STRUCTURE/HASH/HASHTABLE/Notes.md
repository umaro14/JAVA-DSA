# Hashtable 
    A Hashtable is a legacy key-value storage data structure that implements the Map interface. It is similar to HashMap but is synchronized (thread-safe) and does not allow null keys or values.

# Hashtable Basics
# Key Features
    -->Thread-safe (all methods are synchronized).

    -->No null keys or values (throws NullPointerException).

    -->Slower than HashMap due to synchronization overhead.

    -->Legacy class (use ConcurrentHashMap for modern thread-safe needs).

# Important Hashtable Methods
#     Method	                   Description
    --> put(K key, V value)	       Inserts a key-value pair (synchronized).
    --> get(K key)	               Returns the value for the given key.
    --> remove(K key)	           Removes the key-value pair.
    --> containsKey(K key)	       Checks if a key exists.
    --> containsValue(V value)	   Checks if a value exists.
    --> keySet()	               Returns all keys as an Enumeration.
    --> elements()	               Returns all values as an Enumeration.

# How Hashtable Works Internally
Hashing: Uses hashCode() of keys to compute bucket location.

Synchronization: Every method is thread-safe (unlike HashMap).

No null support: Explicitly disallows null keys/values.

# Time Complexity
# Operation	Average Case	Worst Case (many collisions)
  put()	        O(1)	              O(n)
  get()	        O(1)	              O(n)
  remove()	    O(1)	              O(n)


# Hashtable vs. HashMap
# Feature	        Hashtable	                HashMap
Thread-Safe	        ✅ Yes	                   ❌ No
null Keys/Values	❌ No	                   ✅ Yes
Performance	        Slower (synchronized)	     Faster
Legacy	            ✅ Yes (since Java 1.0)	   ❌ No
