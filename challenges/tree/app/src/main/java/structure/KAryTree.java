package structure;

import data.KNode;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.lang.Number.*;


public class KAryTree<T>
        implements Serializable {
    private KNode<T> root;
    //    private List<KNode<Integer>> children;
    int K = 0;


    public KAryTree() {
//        this.children = null;
        this.root = null;

    }

    public KAryTree(int k) {
        if (k <= 1)
            k = 2;
        this.K = k;
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
        int count = 0;
        fizzBuzz(tree, tree.getRoot());
//        for (KNode<String> child : tree.getRoot().getChildren()) {
//            if (child != null) {
//                child = child.getChildAt(count);
//                fizzBuzz(tree, child);
//                count++;
//            } else
//                break;
//
//        }
        return tree;
    }



    //    https://www.geeksforgeeks.org/number-children-given-node-n-ary-tree/
    public KAryTree<String> fizzBuzz(KAryTree<String> tree, KNode<String> node) {
        if (node != null) {

            if (isInteger(node.getValue())) {
                node.setValue(
                        (Integer.parseInt(node.getValue()) % 3 == 0) ? "Fizz" :
                                (Integer.parseInt(node.getValue()) % 5 == 0) ? "Buzz" :
                                        (Integer.parseInt(node.getValue()) % 15 == 0 || Integer.parseInt(node.getValue()) == 1) ? "FizzBuzz" :
                                                "" + node.getValue());
            }
            tree.getRoot().addChild(node);

            for (KNode<String> child : tree.getRoot().getChildren()) {

                fizzBuzz(tree, child);
            }
        }
        return tree;
    }

    @Override
    public String toString() {
        if (root.getChildren() != null) {
            {
                for (KNode<T> child : root.getChildren()) {
                    return "Parent: " + child.getParent() + "\n" +
                            "Children: " + child;
                }
            }
        }
        return "Root: " + root;
    }


}
