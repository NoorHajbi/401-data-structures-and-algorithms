package stackQueue;

import data.Node;

public class StackLinkedList<T> {
    Node top;

    //O(1)
    public void push(int value) {
        Node newNode = new Node(value);
        if (top == null)
            top = newNode;
        else {
            Node temp = top;
            top = newNode;
            newNode.next = temp;
        }
        System.out.println(value + " pushed to stack");
    }

    public int pop() {
        int popped = Integer.MAX_VALUE;
        if (top == null)
            System.out.println("Stack is Empty");
        else {
            popped = top.data;
            top = top.next;
        }
        return popped;
    }

    public int peek() {
        if (top == null) {
            System.out.println("Stack is Empty");
            return Integer.MIN_VALUE;
        } else
            return top.data;
    }

    //Returns: Boolean indicating whether or not the stack is empty.
    public boolean isEmpty() {
        return top == null;
    }
}
