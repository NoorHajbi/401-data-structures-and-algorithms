package stackQueue;

import data.Node;

public class QueueLinkedList<T> {
    public Node front, rear;

    public QueueLinkedList() {
        this.front = this.rear = null;
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);

        //if it's empty, the newNode is rear and front
        if (this.rear == null) {
            this.front = this.rear = newNode;
            return;
        }
        //Add the new Node at the end of the queue and change rear
        this.rear.next = newNode;
        this.rear = newNode;
    }

    public int dequeue() {
        if (this.front == null){
            System.out.println("The queue is empty");
            return Integer.MIN_VALUE;
        }else{
        //else if front.next== null
        Node temp = this.front;
        this.front = this.front.next;
        temp.next= null;
        return temp.data;}
    }

    //I can put them in interface
    public int peek() {
        if (front == null) {
            System.out.println("Queue is Empty");
            return Integer.MIN_VALUE;
        } else
            return front.data;
    }
    public boolean isEmpty() {
        return front == null;
    }

    ////
//    Create a pull request from your branch to your master branch
//    In your open pull request, leave as a comment a checklist of the specifications and tasks above,
//    with the actual steps that you completed checked off

//    Submitting your completed work to Canvas:
//    Copy the link to your open pull request and paste it into the corresponding Canvas assignment
//    Leave a description of how long this assignment took you in the comments box
//    Add any additional comments you like about your process or any difficulties you may have had with the assignment
//    Merge your branch into master, and delete your branch (don’t worry, the PR link will still work)
}
