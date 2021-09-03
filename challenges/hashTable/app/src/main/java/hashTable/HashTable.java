package hashTable;

import hashTable.data.Node;

import java.util.LinkedList;
import java.util.Objects;

public class HashTable<K, V> {
    private LinkedList<Node<K, V>> bucketArray; //a.k.a the hashTable

    //To hold the current size of bucketArray
    private int numBuckets;

    //To hold the total number of hash nodes in the bucket array
    private int size;

    public HashTable() {
        bucketArray = new LinkedList<>();
        numBuckets = 30;
        size = 0;

        //create bucket array
        for (int index = 0; index < numBuckets; index++) {
            bucketArray.add(null);
        }
    }

    /**
     * hashes the key using built in java hash function
     *
     * @param key
     * @return hashCode of the key
     */
    public int hashCode(K key) {
        return Objects.hashCode(key);
    }


    /**
     * Gets the index of where the value is located in the bucket array
     *
     * @param key
     * @return bucketIndex
     */
    public int getBucketIndex(K key) {
        int hashCode = hashCode(key);
        // this is to ensure the index is with in the bounds of the bucket array
        int index = hashCode % numBuckets;

        //hashCode can be negative (key.hashCode() can be negative)
        //So we need to make it positive
        index = index < 0 ? index * -1 : index;
        return index;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return getSize() == 0;
    }

    /**
     * @param key
     * @param value
     */
    public void add(K key, V value) {
        //gets the head of the linked list for a given key
        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);

        Node<K, V> head = bucketArray.get(bucketIndex);

        //check if key present
        while (head != null) {
            if (head.getKey().equals(key) && head.getHashCode() == hashCode) {
                head.setValue(value);
                return;
            }
            head = head.getNext();
        }
        // insert the value in the position
        size++;
        head = bucketArray.get(bucketIndex);
        Node<K, V> newNode = new Node<>(key, value, hashCode);
        newNode.setNext(head);
        bucketArray.set(bucketIndex, newNode);

        //if the number of hashNodes goes beyond the threshold
        //double the bucket array
        if ((1.0 * size) / numBuckets >= 0.7) {
            LinkedList<Node<K, V>> temp = bucketArray;
            bucketArray = new LinkedList<>();
            numBuckets *= 2;
            size = 0;

            for (int index = 0; index < numBuckets; index++) {
                bucketArray.add(null);
            }
            for (Node<K, V> headNode : temp) {
                while (headNode != null) {
                    add(headNode.getKey(), headNode.getValue());
                    headNode = headNode.getNext();
                }
            }

        }
    }

    /**
     * @param key
     * @return
     */
    public V remove(K key) {
        //Apply hash function to get index for given key
        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);

        //Get head of Chain
        Node<K, V> head = bucketArray.get(bucketIndex);

        //search for the key in its chain
        Node<K, V> prev = null;
        while (head != null) {
            // if Key found
            if (head.getKey().equals(key) && hashCode == head.getHashCode())
                break;

            //Else keep moving in chain
            prev = head;
            head = head.getNext();
        }
        //if Key wasn't there
        if (head == null)
            return null;

        //reduce size
        size--;

        //remove key
        if (prev != null)
            prev.setNext(head.getNext());
        else
            bucketArray.set(bucketIndex, head.getNext());

        return head.getValue();

    }

    /**
     * @param key
     * @return
     */
    public V get(K key) {
        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);

        Node<K, V> head = bucketArray.get(bucketIndex);

        //search the linked list
        while (head != null) {
            if (head.getKey().equals(key) && head.getHashCode() == hashCode) {
                return head.getValue();
            }
            head = head.getNext();
        }

        // key not found
        return null;
    }

    public boolean includes(K key) {
        return get(key)!= null;
    }

}

