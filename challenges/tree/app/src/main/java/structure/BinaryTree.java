package structure;

import data.Node;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class BinaryTree {
    private static final int MIN_VALUE = -1;
    Node root;

    public BinaryTree() {
        this.root = null;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }


    //Depth first traversals

    // 1.
    public ArrayList<Integer> preOrder(Node node, ArrayList<Integer> list) {
        if (node != null) {
            list.add(node.getValue()); // root
            preOrder(node.getLeft(), list); // traverse left sub tree
            preOrder(node.getRight(), list); // traverse right sub tree
        }
        return list;
    }

    public ArrayList<Integer> preOrder() {
        return preOrder(root, new ArrayList<>());
    }

    // 2.
    public ArrayList<Integer> inOrder(Node node, ArrayList<Integer> list) {
        if (node != null) {
            inOrder(node.getLeft(), list); // traverse left sub tree
            list.add(node.getValue()); // root
            inOrder(node.getRight(), list); // traverse right sub tree
        }
        return list;
    }

    public ArrayList<Integer> inOrder() {
        return inOrder(root, new ArrayList<>());
    }

    // 3.
    public ArrayList<Integer> postOrder(Node node, ArrayList<Integer> list) {
        if (node != null) {
            postOrder(node.getLeft(), list); // traverse left sub tree
            postOrder(node.getRight(), list); // traverse right sub tree
            list.add(node.getValue()); // root
        }
        return list;
    }

    public ArrayList<Integer> postOrder() {
        return postOrder(root, new ArrayList<>());
    }

    // Code Challenge 16
    public int findMaximumValue() {
        int number = MIN_VALUE;
        if (root != null) {
            ArrayList<Integer> list = inOrder();
            for (Integer integer : list) {
                if (number < integer)
                    number = integer;
            }
        }
        return number;
    }

    @Override
    public String toString() {
        return "BinaryTree{" +
                "root=" + root +
                '}';
    }
}