package hashTable;
import hashTable.hashmapChallenges.BinaryTree;
import hashTable.hashmapChallenges.TreeIntersection;
import hashTable.hashmapChallenges.data.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class TreeIntersectionTest {


    TreeIntersection treeIntersection = new TreeIntersection();
    BinaryTree binaryTree = new BinaryTree();
    BinaryTree binaryTree2 = new BinaryTree();


    //1. Test empty class and empty sentences (Expected failure & Edges cases)
    @Test
    public void testEmpty() {
        assertNotNull("Problem with instantiate an empty treeIntersection",
                treeIntersection);

        assertEquals("BinaryTree{root=null}",
                binaryTree.toString());

        assertNull(treeIntersection.treeIntersection(binaryTree,binaryTree2));
    }

    //2. one tree is empty
    @Test
    public void oneIsEmpty() {
        binaryTree.setRoot(new TreeNode(150));
        binaryTree.getRoot().setLeft(new TreeNode(100));
        binaryTree.getRoot().setRight(new TreeNode(250));
        binaryTree.getRoot().getLeft().setLeft(new TreeNode(75)); //leaf
        binaryTree.getRoot().getLeft().setRight(new TreeNode(160));
        binaryTree.getRoot().getLeft().getRight().setRight(new TreeNode(175));//leaf
        binaryTree.getRoot().getLeft().getRight().setLeft(new TreeNode(125));//leaf
        binaryTree.getRoot().getRight().setRight(new TreeNode(350));
        binaryTree.getRoot().getRight().setLeft(new TreeNode(200));
        binaryTree.getRoot().getRight().getRight().setLeft(new TreeNode(300)); //leaf
        binaryTree.getRoot().getRight().getRight().setRight(new TreeNode(500));//leaf
        assertNull(treeIntersection.treeIntersection(binaryTree,binaryTree2));
    }

    //3. Test happy paths
    @Test
    public void testHappyPath() {
        binaryTree.setRoot(new TreeNode(150));
        binaryTree.getRoot().setLeft(new TreeNode(100));
        binaryTree.getRoot().setRight(new TreeNode(250));
        binaryTree.getRoot().getLeft().setLeft(new TreeNode(75)); //leaf
        binaryTree.getRoot().getLeft().setRight(new TreeNode(160));
        binaryTree.getRoot().getLeft().getRight().setRight(new TreeNode(175));//leaf
        binaryTree.getRoot().getLeft().getRight().setLeft(new TreeNode(125));//leaf
        binaryTree.getRoot().getRight().setRight(new TreeNode(350));
        binaryTree.getRoot().getRight().setLeft(new TreeNode(200));
        binaryTree.getRoot().getRight().getRight().setLeft(new TreeNode(300)); //leaf
        binaryTree.getRoot().getRight().getRight().setRight(new TreeNode(500));//leaf
/****************/
        binaryTree2.setRoot(new TreeNode(42));
        binaryTree2.getRoot().setLeft(new TreeNode(100));
        binaryTree2.getRoot().setRight(new TreeNode(600));
        binaryTree2.getRoot().getLeft().setLeft(new TreeNode(15));//leaf
        binaryTree2.getRoot().getLeft().setRight(new TreeNode(160));
        binaryTree2.getRoot().getLeft().getRight().setLeft(new TreeNode(125));//leaf
        binaryTree2.getRoot().getLeft().getRight().setRight(new TreeNode(175));//leaf
        binaryTree2.getRoot().getRight().setRight(new TreeNode(350));
        binaryTree2.getRoot().getRight().setLeft(new TreeNode(200)); //leaf
        binaryTree2.getRoot().getRight().getRight().setLeft(new TreeNode(4)); //leaf
        binaryTree2.getRoot().getRight().getRight().setRight(new TreeNode(500)); //leaf

        assertEquals(
                "Happy path test:",
                "[100, 160, 200, 350, 125, 175, 500]",
                treeIntersection.treeIntersection(binaryTree,binaryTree2).toString()
        );
    }

}
