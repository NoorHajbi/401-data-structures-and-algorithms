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
        if (root.getValue() == value) {
            return true;
        } else if (value < root.getValue()) {
            if (root.getLeft() == null) { //not has a left Child
                return false;
            }
            root = root.getLeft();
            return contains(value);
        } else if (value > root.getValue()) {
            if (root.getRight() == null) {
                return false;
            }
            root = root.getRight();
            return contains(value);
        }
        return true;
    }


    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "root=" + root +
                '}';
    }
}
