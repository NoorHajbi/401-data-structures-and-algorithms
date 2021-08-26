package hashTable.hashmapChallenges;

import hashTable.hashmapChallenges.data.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//Same previous binary tree class
public class BinaryTree {
    private static final int MIN_VALUE = -1;
    TreeNode root;

    public BinaryTree() {
        this.root = null;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }


    //Depth first traversals

    // 1.
    public ArrayList<Integer> preOrder(TreeNode node, ArrayList<Integer> list) {
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
    public ArrayList<Integer> inOrder(TreeNode node, ArrayList<Integer> list) {
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
    public ArrayList<Integer> postOrder(TreeNode node, ArrayList<Integer> list) {
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
        Queue<TreeNode> queue = new LinkedList<>();
        //enqueue
        queue.add(tree.getRoot());
        while (!queue.isEmpty()) {
            //dequeue
            TreeNode node = queue.remove();
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
                sum = integer + sum;
            }
        }
        return sum;
    }

    public int filesSum(TreeNode node) {
        int count=0;
        int numLeft =0;
        int numRight =0;
        if (node == null)
            return 0;
        if (node.getLeft() == null && node.getRight() == null)
            return 1;
        else
            numLeft = filesSum(node.getLeft()) ;
        System.out.println("numLeft   " + numLeft);
        numRight=  filesSum(node.getRight());
        System.out.println("numRight   " + numRight);
        count = numLeft+numRight;
        System.out.println("Countttttttt   " + count);
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