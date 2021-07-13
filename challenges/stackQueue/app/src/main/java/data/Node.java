package data;

public class Node<T> {
    public static final int Max = 1000;
    public Node<T> next;
    public final T data;
    public Node(T data) {
        this.data = data;
    }
}
