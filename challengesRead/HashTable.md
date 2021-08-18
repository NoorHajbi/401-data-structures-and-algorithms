# 30. HashTable
A hash table (hash map) is a data structure that implements a hash table array, which maps keys to values. 

## Challenge
- **We asked to implement hashtable by Creating 2 classes with their basic methods:**
1. **Node class**
2. **HashTable Class**


## Approach & Efficiency
- **Space complexity** -> O(n).

- **Time complexity** ->
1. **hashCode** mehod -> O(1)
2. **getBucketIndex** mehod -> O(n)
3. **isEmpty** method -> O(1)
4. **add** method -> O(n)
5. **remove** method -> O(n)
6. **get** method (for search) -> O(n)

Because it could include more than one item point to the single cell


## API
### HashTable Class Methods:
1.  **hashCode(K key)** ->  hashes the key using built in java hash function
returns hashCode of the key
2.  **getBucketIndex(K key)** -> Gets the index of where the value is located in the bucket array.
returns bucketIndex.
3. **isEmpty()** -> checks if hashTable is empty
returns boolean.
4. **add(K key, V value)** -> adds the key/value pairs to the table.
5. **remove(K key)** -> remove the value from the table
returns deleted value.
6. **get(K key)** -> return the value from the table based on inserted key.


## Resources

- Class-30.
