package data;

public class Node<T> {
    //a Node class that has properties for the value stored in the Node,
    // and a pointer to the next Node.

    private Node<T> next;
    private final T data;

    public Node(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
