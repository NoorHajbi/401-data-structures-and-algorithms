package hashTable.data;

import java.util.Objects;

public class Node<K, V> {
    K key;
    V value;

    final int hashCode;
    Node<K, V> next;


    public Node(K key, V value, int hashCode) {
        this.key = key;
        this.value = value;
        this.hashCode = hashCode;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public int getHashCode() {
        return hashCode;
    }

    public Node<K, V> getNext() {
        return next;
    }

    public void setNext(Node<K, V> next) {
        this.next = next;
    }

//these are override methods, I didn't implement anything inside them
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Node<?, ?> node = (Node<?, ?>) o;
//        return hashCode == node.hashCode && Objects.equals(key, node.key) && Objects.equals(value, node.value) && Objects.equals(next, node.next);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(key, value, hashCode, next);
//    }
}
