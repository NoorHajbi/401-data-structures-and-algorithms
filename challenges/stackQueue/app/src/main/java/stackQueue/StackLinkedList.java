package stackQueue;

import data.Node;

public class StackLinkedList<T> {
    Node head;

    public boolean isEmpty() {
        return head == null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (head == null)
            head = newNode;
        else {
            Node temp = head;
            head = newNode;
            newNode.next = temp;
        }
        System.out.println(data + " pushed to stack");
    }

    public int pop() {
        int popped = Integer.MAX_VALUE;
        if (head == null)
            System.out.println("Stack is Empty");
        else {
            popped = head.data;
            head = head.next;
        }
        return popped;
    }

    public int peek() {
        if (head == null) {
            System.out.println("Stack is Empty");
            return Integer.MIN_VALUE;
        } else
            return head.data;
    }
}
