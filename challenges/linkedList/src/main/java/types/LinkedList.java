package types;

import data.Node;

public class LinkedList<T> {
    private Node<T> head;
    private int size;

    //Insert data at the end of the list
    public void insertAtEnd(T data) {
        Node<T> node = new Node<>(data);
        if (this.head == null) {
            this.head = node;
        } else {
            Node<T> current = this.head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(node);
        }
        size++;
    }
}
