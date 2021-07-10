package stackQueue;

import data.Node;

public class QueueLinkedList {
    public Node front, rear;

    public QueueLinkedList() {
        this.front = this.rear = null;
    }

    public void enqueue(int key) {
        Node newNode = new Node(key);

        //if it's empty, the newNode is rear and front
        if (this.rear == null) {
            this.front = this.rear = newNode;
            return;
        }
        //Add the new Node at the end of the queue and change rear
        this.rear.next = newNode;
        this.rear = newNode;
    }

    public void dequeue() {
        
    }

}
