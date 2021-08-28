package hashTable.hashmapChallenges;

import hashTable.data.Node;
import hashTable.hashmapChallenges.data.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class HashMap<K, V> {
    private static int SIZE;
    private int size;
    private final LinkedList<Node<K, V>> bucketArray; //a.k.a the hashmap

    public HashMap() {
        bucketArray = new LinkedList<>();
        size = 0;
        SIZE = 16;

//        create bucket array
        for (int index = 0; index < SIZE; index++) {
            bucketArray.add(null);
        }
    }

    private int getBucket() {
        // this is to ensure the index is with in the bounds of the bucket array
        int index = hashCode() % SIZE;

        //hashCode can be negative (key.hashCode() can be negative)
        //So we need to make it positive
        index = index < 0 ? index * -1 : index;
        return index;
    }

    public int size() {
        return size;
    }

    public V get(K key) {
        int bucket = getBucket();
        Node<K, V> node = bucketArray.get(bucket);
        while (node != null) {
            if (node.getKey().equals(key)) {
                return node.getValue();
            }
            node = node.getNext();
        }
        return null;
    }

    public void put(K key, V value) {
        if (key == null) {
            throw new IllegalArgumentException("Cannot add null key");
        }

        int bucket = getBucket();
        Node<K, V> node = bucketArray.get(bucket);
        Node<K, V> newNode = new Node<>(key, value, 0);

        if (node == null) {
            bucketArray.set(bucket, newNode);
            size++;
        } else {
            while (!node.getKey().equals(key)) {
                if (node.getNext() == null) {
                    node.setNext(newNode);
                    size++;
                    return;
                }
                node = node.getNext();
            }
            node.setValue(value);
        }
    }

    public boolean remove(K key) {
        if (key == null) {
            return false;
        }

        int bucket = getBucket();
        Node<K, V> node = bucketArray.get(bucket);
        if (node == null) {
            return false;
        }

        while (!node.getKey().equals(key)) {
            if (node.getNext() == null) {
                return false;
            }
            node = node.getNext();
        }

        bucketArray.set(bucket, node.getNext());
        size--;
        return true;
    }


    public boolean containsKey(K key) {
        return get(key) != null;
    }

    public List<K> keySet() {
        int bucket = getBucket();
        List<K> list = new ArrayList<>();
        Node<K, V> node = bucketArray.get(bucket);
        while (node != null) {
            if (node.getKey() != null) {
                list.add(node.getKey());
            }
            node = node.getNext();
        }
        return list;
    }


}