package stackQueue;

import data.Node;

public class QueueLinkedList<T> {
    public Node<T> front, rear;

    public QueueLinkedList() {
        this.front = this.rear = null;
    }

    public void enqueue(T value) {
        Node<T> newNode = new Node<>(value);

        //if it's empty, the newNode is rear and front
        if (this.rear == null) {
            this.front = this.rear = newNode;
            return;
        }
        //Add the new Node at the end of the queue and change rear
        this.rear.next = newNode;
        this.rear = newNode;
    }

    public T dequeue() {
        if (this.front == null) {
            return (T) "The queue is empty";
//            return Integer.MIN_VALUE;
        } else {
            //else if front.next== null
            Node<T> temp = this.front;
            this.front = this.front.next;
            temp.next = null;
            return temp.data;
        }
    }

    //I can put them in interface
    public T peek() {
        if (front == null) {
            return (T) "Queue is Empty";
//            return Integer.MIN_VALUE;
        } else
            return front.data;
    }

    public boolean isEmpty() {
        return front == null;
    }

    @Override
    public String toString() {
        Node temp = this.front;
        StringBuilder output = new StringBuilder();
        if (temp == null) {
            return "Please fill the Queue list";
        }
        while (temp != null) {
            output.append("{ ").append(temp.data).append(" } -> ");
            temp = temp.next;
        }
        output.append("NULL");
        return output.toString();
    }

}
