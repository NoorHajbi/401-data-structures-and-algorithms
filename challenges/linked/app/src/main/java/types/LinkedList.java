package types;

import data.Node;

public class LinkedList<T> {
    //a head property
    public Node<T> head;
    public int size = 0;

    public LinkedList() {
        this.head = null;
    }

    public void insertABeginning(T data) {
        //Create new node
        Node<T> node = new Node<>(data);
        //Checks if the list is empty
        if (this.head == null) {
            //If list is empty, head would point to new node.
            this.head = node;
        } else {
            //Store data into current and will point to head
            Node<T> current = this.head;
            //node will become new head of the list
            this.head = node;
            //Node current(previous head) will be added after new head
            head.setNext(current);
        }
        size++;
    }

    // Indicates whether that value exists as a Node’s value somewhere within the list.
    public boolean Includes(T key) {
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

    // Code Challenge: Class 06
    //    adds a new node with the given value to the end of the list
    public void append(T data) {
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

    //  adds a new node with the given new value immediately
//  before the first node that has the value specified
    public void insertBefore(T value, T newVal) {
        if (this.head == null)
            System.out.println("Please fill the Linked List");

        else if (Includes(value)) {
            Node<T> node = new Node<>(newVal);
            Node<T> current = head;
            Node<T> before = current;
            if (this.head.getData() == value) {
                insertABeginning(newVal);
            } else {
                while (current.getData() != value) {
                    before = current;
                    current = current.getNext();
                }
                node.setNext(current);
                before.setNext(node);
                size++;
            }
        } else
            System.out.println(value + " Is not existed in the linked list");
    }

    //    adds a new node with the given new value immediately after the first node that has the value specified
    public void insertAfter(T value, T newVal) {
        if (this.head == null)
            System.out.println("Please fill the Linked List");

        else if (Includes(value)) {
            Node<T> node = new Node<>(newVal);
            Node<T> current = head;
            Node<T> after = current;
            if ((this.head.getData() == value)) {
                after = after.getNext();
            } else {
                while (current.getData() != value) {
                    current = after;
                    after = after.getNext();
                }
            }
            node.setNext(after);
            current.setNext(node);

            size++;
        } else
            System.out.println(value + " Is not existed in the linked list");
    }

}
