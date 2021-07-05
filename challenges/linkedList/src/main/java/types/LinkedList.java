package types;

import data.Node;

public class LinkedList<T> {
    //a head property
    private Node<T> head;
    private int size;

    public LinkedList() {
        this.head = null;
    }

    //Insert data at the Beginning of the list
    public void insertABeginning(T data) {
        //Create new node
        Node<T> node = new Node<>(data);
        if (this.head == null) {
            //If list is empty, head would point to new node.
            head = node;
        } else {
            //Store data into current
            Node<T> current = this.head;
            head = node;
            current.setNext(node);
        }
        size++;
    }

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

    //    Indicates whether that value exists as a Node’s value somewhere within the list.
    public boolean Search(T key) {
        Node<T> current = this.head;
        if (size != 0) {
            while (current != null) {
                if (current.getData() == key)
                    return true;
                current = current.getNext();
            }
        }
        return false;
    }

    //    Returns: a string representing all the values in the Linked List, formatted as:
//            "{ a } -> { b } -> { c } -> NULL"
    @Override
    public String toString() {
        Node<T> current = this.head;
        StringBuilder output = new StringBuilder();
        if (current == null) {
            return "Please fill the Linked List";
        }
        while (current != null) {
            output.append("{ ").append(current.getData()).append(" } -> ");
            current = current.getNext();
        }
        output.append("NULL");
        return output.toString();
    }
}
