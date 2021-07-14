package stackQueue;

public class pseudoQueue<T> {
    StackLinkedList<Integer> stackList1;
    StackLinkedList<Integer> stackList2;

    public pseudoQueue() {
        this.stackList1 = new StackLinkedList<Integer>(); //as a rear //top
        this.stackList2 = new StackLinkedList<Integer>(); //as a front
    }

    //    Inserts value into the PseudoQueue, using a first-in, first-out approach.
    public void enqueue(int value) {
        this.stackList1.push(value);
    }


    public int dequeue() {
        if (this.stackList2.top == null) {
            while (stackList1.top != null) {
                stackList2.push(stackList1.pop());
            }
        }
        return stackList2.pop();
    }

    @Override
    public String toString() {
        //will be full at enqueue and empty in dequeue
        if (stackList1.top == null)
            return stackList2.toString();

            //will be empty at enqueue and full in dequeue
        else if (stackList2.top == null)
            return stackList1.toString();
        else
            return "Please fill the queue";

    }
}
