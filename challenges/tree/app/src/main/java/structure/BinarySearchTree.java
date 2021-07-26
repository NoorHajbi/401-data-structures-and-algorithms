package structure;

import data.Node;

public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }


    public void add(int value) {
        if (root == null) {
            setRoot(new Node(value));
        } else {
            Node current = getRoot();
            traverse(current, value);
        }
    }

    private void traverse(Node current, int key) {
        if (key > current.getValue()) {
            if (current.getRight() == null) {
                current.setRight(new Node(key));
                return;
            }

            current = current.getRight();
        } else {
            if (current.getLeft() == null) {
                current.setLeft(new Node(key));
                return;
            }

            current = current.getLeft();
        }
        traverse(current, key);
    }

    public boolean contains(int value) {
        if (root != null)
            return contains(this.root, value);
        else
            return false; //for null
    }

    private boolean contains(Node node, int value) {
        if (node.getValue() == value) {
            return true;
        }
        if (value < node.getValue()) {
            if (node.getLeft() == null) { //not has a left Child
                return false;
            }
            return contains(node.getLeft(), value);
        } else if (value > node.getValue()) {
            if (node.getRight() == null) {
                return false;
            }
            return contains(node.getRight(), value);
        }
        return false;
    }

    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "root=" + root +
                '}';
    }
}
