/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package tree;

import data.Node;
//import structure.BinarySearchTree;
import structure.BinarySearchTree;
import structure.BinaryTree;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        System.out.println("Binary Tree");

        // creates the binary tree
        BinaryTree binaryTree = new BinaryTree();
        System.out.println("Empty  " + binaryTree);

        // adds nodes to the tree
        System.out.println("Max  "+binaryTree.findMaximumValue());
        binaryTree.setRoot(new Node(1));
        System.out.println("Root " + binaryTree.getRoot().getValue());
        System.out.println();
        binaryTree.getRoot().setLeft(new Node(2));
        binaryTree.getRoot().setRight(new Node(3));
        binaryTree.getRoot().getLeft().setLeft(new Node(4));

        System.out.println("preorder" + binaryTree.inOrder());
        System.out.println();
        System.out.println("inorder" + binaryTree.inOrder(binaryTree.getRoot(), new ArrayList<>()));
        System.out.println("inorder" + binaryTree.inOrder());
        System.out.println();
        System.out.println("postorder" + binaryTree.postOrder());
        System.out.println();
        System.out.println("Max  "+binaryTree.findMaximumValue());


        BinarySearchTree binarySearchTree = new BinarySearchTree();
        System.out.println(binarySearchTree.contains(10));
        binarySearchTree.add(5);
        binarySearchTree.add(7);
        binarySearchTree.add(3);
        binarySearchTree.add(10);

        System.out.println(binarySearchTree);
        System.out.println();
        System.out.println(binarySearchTree.contains(10));
        System.out.println(binarySearchTree.contains(3));
        System.out.println(binarySearchTree.contains(7));
        System.out.println(binarySearchTree.contains(5));
        System.out.println(binarySearchTree.contains(0));
        System.out.println();

    }
}
