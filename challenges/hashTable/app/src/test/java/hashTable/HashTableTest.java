package hashTable;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class HashTableTest {
    HashTable<String,String> hashtableTest= new HashTable<>();
    //1. Can successfully instantiate an empty hashTable
    @Test
    public void testEmpty() {
        assertNotNull("Problem with instantiate an empty hashTable", hashtableTest);
        assertEquals(0, hashtableTest.getSize());
        assertTrue(hashtableTest.isEmpty());
        assertNull(hashtableTest.remove("Not existed value"));
    }
    @Test
    public void testOneItem() {
//        //Can successfully instantiate a tree with a single root node
//        tree.setRoot(new Node(1));
//        assertEquals(1, tree.getRoot().getValue());
//        // Can successfully add a left child and right child to a single root node
//        tree.getRoot().setLeft(new Node(2));
//        assertEquals(2, tree.getRoot().getLeft().getValue());
//        tree.getRoot().setRight(new Node(3));
//        assertEquals(3, tree.getRoot().getRight().getValue());
//
//        //OR
//        BinaryTree tree2 = new BinaryTree();
//        Node left = new Node(2);
//        Node right = new Node(3);
//        Node root = new Node(left, 1, right);
//        tree2.setRoot(root);
//        assertEquals(1, tree2.getRoot().getValue());
//        assertEquals(2, tree2.getRoot().getLeft().getValue());
//        assertEquals(3, tree2.getRoot().getRight().getValue());
//
//        //Can successfully return a collection from a preorder traversal
//        //Can successfully return a collection from an inorder traversal
//        //Can successfully return a collection from a postorder traversal
//
//        tree.getRoot().getLeft().setLeft(new Node(4));
//        assertEquals("[1, 2, 4, 3]", String.valueOf(tree.preOrder()));
//        assertEquals("[4, 2, 1, 3]", String.valueOf(tree.inOrder()));
//        assertEquals("[4, 2, 3, 1]", String.valueOf(tree.postOrder()));

    }
    
}





