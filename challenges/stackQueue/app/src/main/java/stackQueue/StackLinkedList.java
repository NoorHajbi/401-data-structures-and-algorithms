package stackQueue;

import data.Node;

public class StackLinkedList<T> {
    public Node<T> top;

    //O(1)
     void push(int value) {
        Node newNode = new Node(value);
        if (top == null)
            top = newNode;
        else {
            Node temp = top;
            top = newNode;
            newNode.next = temp;
        }
//        System.out.println(value + " pushed to stack");
    }

     T pop() {
        if (top == null)
            throw new IllegalArgumentException("Stack is Empty");
        T popped = top.data;
        top = top.next;
        return popped;
    }

     T peek() {
        if (top == null) {
            return (T) "Stack is Empty, So the returned Peek-> ";
        } else
            return top.data;
    }

    //Returns: Boolean indicating whether or not the stack is empty.
     boolean isEmpty() {
        return top == null;
    }


    @Override
    public String toString() {
        Node temp = this.top;
        StringBuilder output = new StringBuilder();
        if (temp == null) {
            return "Please fill the Linked List";
        }
        while (temp != null) {
            output.append("{ ").append(temp.data).append(" } -> ");
            temp = temp.next;
        }
        output.append("NULL");
        return output.toString();
    }
}
