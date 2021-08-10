package structure;

import data.KNode;


public class KAryTree {
    private KNode<Integer> root;

    public KAryTree() {
        this.root =null;
    }

    public KNode<Integer> getRoot() {
        return root;
    }

    public void setRoot(KNode<Integer> root) {
        this.root = root;
    }


    public boolean isEmpty() {
        return root == null;
    }


    private void fizzBuzz(KNode<Integer> current) {
        if (isEmpty())
            current = null;
        assert current != null;
        if (current.getValue() % 3 == 0) {
            current.setStringValue("Fizz");
        } else if (current.getValue() % 5 == 0) {
            current.setStringValue("Buzz");
        } else if (current.getValue() % 15 == 0) {
            current.setStringValue("FizzBuzz");
        } else
            current.setStringValue(current.getValue().toString());
    }

    private void checkChildren(KNode<Integer> current) {
        for (KNode<Integer> child : current.getChildren()) {
//            fizzBuzz(child.getParent());
            fizzBuzz(child);
        }

    }

    public KAryTree treeFizzBuzz(KAryTree tree) {
        if (isEmpty())
            return null;
        checkChildren(tree.getRoot());
        return tree;
    }

    @Override
    public String toString() {
        return "Root: " + root + "\n" +
                "Children: " + root.getChildren();
    }
}
