package data;

public class Node<T> {
    public Node<T> next;
    public final T data;

    public Node(T data) {
        this.data = data;
    }
}