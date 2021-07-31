package tree;

import data.Node;
import org.junit.Test;

import static org.junit.Assert.*;

import structure.BinaryTree;

public class BinaryTreeTest {
    BinaryTree tree = new BinaryTree();

    //1. Can successfully instantiate an empty tree
    @Test
    public void testEmpty() {
        assertNotNull("Problem with instantiate an empty tree", tree);
        assertNotNull("Problem with instantiate an empty tree", tree.preOrder());
        assertNotNull("Problem with instantiate an empty tree", tree.inOrder());
        assertNotNull("Problem with instantiate an empty tree", tree.postOrder());
    }

    @Test
    public void testBasics() {
        //Can successfully instantiate a tree with a single root node
        tree.setRoot(new Node(1));
        assertEquals(1, tree.getRoot().getValue());
        // Can successfully add a left child and right child to a single root node
        tree.getRoot().setLeft(new Node(2));
        assertEquals(2, tree.getRoot().getLeft().getValue());
        tree.getRoot().setRight(new Node(3));
        assertEquals(3, tree.getRoot().getRight().getValue());

        //OR
        BinaryTree tree2 = new BinaryTree();
        Node left = new Node(2);
        Node right = new Node(3);
        Node root = new Node(left, 1, right);
        tree2.setRoot(root);
        assertEquals(1, tree2.getRoot().getValue());
        assertEquals(2, tree2.getRoot().getLeft().getValue());
        assertEquals(3, tree2.getRoot().getRight().getValue());

        //Can successfully return a collection from a preorder traversal
        //Can successfully return a collection from an inorder traversal
        //Can successfully return a collection from a postorder traversal

        tree.getRoot().getLeft().setLeft(new Node(4));
        assertEquals("[1, 2, 4, 3]", String.valueOf(tree.preOrder()));
        assertEquals("[4, 2, 1, 3]", String.valueOf(tree.inOrder()));
        assertEquals("[4, 2, 3, 1]", String.valueOf(tree.postOrder()));

    }

    //Code Challenge: Class 16
    @Test
    public void testEmptyMax() {
        //Empty tree
        assertEquals(-1, tree.findMaximumValue());

        //Happy path
        Node left = new Node(7);
        Node right = new Node(5);
        Node root = new Node(left, 2, right);
        tree.setRoot(root);
        tree.getRoot().getLeft().setLeft(new Node(2));
        tree.getRoot().getLeft().setRight(new Node(6));
        tree.getRoot().getLeft().getRight().setRight(new Node(11));
        tree.getRoot().getLeft().getRight().setLeft(new Node(5));
        tree.getRoot().getRight().setRight(new Node(9));
        tree.getRoot().getRight().getRight().setLeft(new Node(4));
        assertEquals(11, tree.findMaximumValue());
    }

    //Code Challenge: Class 17
    @Test
    public void testEmptyBreadth() {
        assertNull("Problem with instantiate an empty tree", tree.breadthFirst(tree));

    }
    @Test
    public void testHappyPathBreadth() {
        //Happy path
        Node left = new Node(7);
        Node right = new Node(5);
        Node root = new Node(left, 2, right);
        tree.setRoot(root);
        tree.getRoot().getLeft().setLeft(new Node(2));
        tree.getRoot().getLeft().setRight(new Node(6));
        tree.getRoot().getLeft().getRight().setRight(new Node(11));
        tree.getRoot().getLeft().getRight().setLeft(new Node(5));
        tree.getRoot().getRight().setRight(new Node(9));
        tree.getRoot().getRight().getRight().setLeft(new Node(4));
        assertEquals("[2, 7, 5, 2, 6, 9, 5, 11, 4]", String.valueOf(tree.breadthFirst(tree)));
    }
    @Test
    public void testCaseBreadth() {
        //edge cases, put multiple values to same node
        Node left = new Node(7);
        Node right = new Node(5);
        Node root = new Node(left, 2, right);
        tree.setRoot(root);
        tree.getRoot().getLeft().setLeft(new Node(2));
        tree.getRoot().getLeft().setRight(new Node(6));
        tree.getRoot().getLeft().getRight().setRight(new Node(11));
        tree.getRoot().getLeft().getRight().setLeft(new Node(5));
        tree.getRoot().getRight().setRight(new Node(9));
        tree.getRoot().getRight().getRight().setLeft(new Node(4));
        tree.getRoot().getRight().getRight().setLeft(new Node(5));
        tree.getRoot().getRight().getRight().setLeft(new Node(7));
        assertEquals("[2, 7, 5, 2, 6, 9, 5, 11, 7]", String.valueOf(tree.breadthFirst(tree)));
    }

}