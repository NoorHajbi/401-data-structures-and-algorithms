package structure;

import data.KNode;

import java.util.*;

public class KAryTree<T> {
    private KNode<T> root;
    int K = 0;


    public KAryTree() {
        this.root = null;
    }

    public KNode<T> getRoot() {
        return root;
    }

    public void setRoot(KNode<T> root) {
        this.root = root;
    }


    public boolean isEmpty() {
        return root == null;
    }

    //    https://stackoverflow.com/questions/237159/whats-the-best-way-to-check-if-a-string-represents-an-integer-in-java
    public static boolean isInteger(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        if (length == 0) {
            return false;
        }
        int i = 0;
        if (str.charAt(0) == '-') {
            if (length == 1) {
                return false;
            }
            i = 1;
        }
        for (; i < length; i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }


    public KAryTree<String> treeFizzBuzz(KAryTree<String> tree) {
        if (isEmpty())
            return null;
        fizzBuzz(tree, tree.getRoot());
        return tree;
    }


    public void fizzBuzz(KAryTree<String> tree, KNode<String> node) {
        Queue<KNode<String>> queue = new LinkedList<>();
        if (node != null) {
            queue.add(tree.getRoot());
            while (!queue.isEmpty()) {
                node = queue.poll();
                if (isInteger(node.getValue())) {
                    node.setValue(
                            (Integer.parseInt(node.getValue()) % 3 == 0) ? "Fizz" :
                                    (Integer.parseInt(node.getValue()) % 5 == 0) ? "Buzz" :
                                            (Integer.parseInt(node.getValue()) % 15 == 0 || Integer.parseInt(node.getValue()) == 1) ? "FizzBuzz" :
                                                    "" + node.getValue());
                }
                queue.addAll(node.getChildren());
                tree.add(node.getValue());
            }
        }
    }


    public void add(T value) {
        KNode<T> newNode = new KNode<>(value);
        if (isEmpty()) {
            root = newNode;
            return;
        }
        ++K;
    }

    @Override
    public String toString() {
        return "root= " + root + "\n"+
                "Children= " + root.getChildren() ;
    }
}
