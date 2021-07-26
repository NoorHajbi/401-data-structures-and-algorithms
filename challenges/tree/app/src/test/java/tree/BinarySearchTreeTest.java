package tree;

import data.Node;
import org.junit.Test;
import structure.BinarySearchTree;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {
    BinarySearchTree tree = new BinarySearchTree();

    //1. Can successfully instantiate an empty tree
    @Test
    public void testEmpty() {
        assertNotNull("Problem with instantiate an empty tree", tree);
        assertFalse("Problem with search inside empty tree", tree.contains(1));
    }

    @Test
    public void testBasics() {
        Node left = new Node(2);
        Node right = new Node(3);
        Node root = new Node(left, 1, right);
        tree.setRoot(root);
        assertEquals(1, tree.getRoot().getValue());
        assertEquals(2, tree.getRoot().getLeft().getValue());
        assertEquals(3, tree.getRoot().getRight().getValue());


        assertTrue("Problem with search", tree.contains(1));
        assertTrue("Problem with search", tree.contains(3));
        assertFalse("Problem with search", tree.contains(4));
        assertFalse("Problem with search", tree.contains(5));
        assertFalse("Problem with search", tree.contains(0));


    }
}
