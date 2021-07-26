package data;

public class Node {
    private final int value;
    private Node left;
    private Node right;

    public Node(int key) {
        this.value = key;
    }

    public Node(Node left, int key, Node right) {
        this.left = left;
        this.value = key;
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
