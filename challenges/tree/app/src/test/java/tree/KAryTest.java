package tree;

import data.KNode;
import org.junit.Test;
import structure.KAryTree;
import static org.junit.Assert.*;
import org.junit.*;


public class KAryTest {

    @Test
    public void testFizzBuzzTree (){
        KAryTree<String> kAryTree = new KAryTree<>();
        System.out.println(kAryTree.treeFizzBuzz(kAryTree));
        //if the tree is empty
        assertEquals("null", String.valueOf(kAryTree.treeFizzBuzz(kAryTree)));
        //if the root has no children
        KNode<String> root = new KNode<>("90");
        kAryTree.setRoot(root);
        assertEquals("root= Fizz \n" +
                "Children= []", String.valueOf(kAryTree.treeFizzBuzz(kAryTree)));
        //with adding values
        root.addChild(new KNode<>("70"));
        root.addChild(new KNode<>("4"));
        root.addChild(new KNode<>("11"));
        root.addChild(new KNode<>("17"));
        root.addChild(new KNode<>("13"));
        assertEquals("root= Fizz \n" +
                "Children= [Buzz , 4 , 11 , 17 , 13 ]", String.valueOf(kAryTree.treeFizzBuzz(kAryTree)));

    }
}
