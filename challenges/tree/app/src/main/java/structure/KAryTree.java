package structure;

import data.KNode;

public class KAryTree<T> {
    private KNode<T> root;


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


//    public ArrayList<KNode<T>> getPreOrderTraversal() {
//        ArrayList<KNode<T>> preOrder = new ArrayList<>();
//        buildPreOrder(root, preOrder);
//        return preOrder;
//    }
//
//
//    private void buildPreOrder(KNode<T> node, ArrayList<KNode<T>> preOrder) {
//        preOrder.add(node);
//        for (KNode<T> child : node.getChildren()) {
//            buildPreOrder(child, preOrder);
//        }
//    }


    private void fizzBuzz(KNode<T> current) {
        if ((int) current.getValue() % 15 == 0) { //%5 && %3
            current.setValue((T) "FizzBuzz");
        } else if ((int) current.getValue() % 3 == 0) {
            current.setValue((T) "Fizz");
        } else if ((int) current.getValue() % 5 == 0) {
            current.setValue((T) "Buzz");
        } else {
            current.setValue(current.getValue());
        }
    }

    private void checkChildren(KNode<T> current) {
        if (!isEmpty()) {
            for (KNode<T> child : current.getChildren()) {
                fizzBuzz(child);
            }
        }
    }

    public KAryTree<T> treeFizzBuzz(KAryTree<T> tree) {
        checkChildren(tree.getRoot());
        return tree;
    }
}
