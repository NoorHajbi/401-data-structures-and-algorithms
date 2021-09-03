package structure;

import data.Node;

import java.util.*;

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
    private ArrayList<Integer> inOrder(Node node, ArrayList<Integer> list) {
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

    // Code 17
    public ArrayList<Integer> breadthFirst(BinaryTree tree) {
        if (this.root == null)
            return null;
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        //enqueue
        queue.add(tree.getRoot());
        while (!queue.isEmpty()) {
            //dequeue
            Node node = queue.remove();
            list.add(node.getValue());
            if (node.getLeft() != null) {
                queue.add(node.getLeft());
            }
            if (node.getRight() != null) {
                queue.add(node.getRight());

            }
        }
        return list;
    }

    public static int sumOdd(BinaryTree tree) {
        if (tree.getRoot() == null) {
            return -1;
        }
        int sum = 0;
        List<Integer> inOrder = tree.inOrder();
        for (Integer integer : inOrder) {
            if (integer % 2 != 0) {
                sum += integer;
            }
        }
        return sum;
    }

    private int filesSum(Node node) {
        int count, numLeft, numRight;
        if (node == null)
            return 0;
        if (node.getLeft() == null && node.getRight() == null)
            return 1;
        else
            numLeft = filesSum(node.getLeft());
        numRight = filesSum(node.getRight());
        count = numLeft + numRight;
        return count;
    }

    public boolean CompareDirectoriesFilesNum(BinaryTree tree1, BinaryTree tree2) {
        int sum = filesSum(tree1.getRoot()) + filesSum(tree2.getRoot());
        return sum % 2 == 0;
    }

    @Override
    public String toString() {
        return "BinaryTree{" +
                "root=" + root +
                '}';
    }
}