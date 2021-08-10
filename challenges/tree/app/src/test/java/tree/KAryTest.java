package tree;

import data.KNode;
import org.junit.Test;
import structure.KAryTree;
import static org.junit.Assert.*;
import org.junit.*;


public class KAryTest {

    @Test
    public void testFizzBuzzTree (){

        KNode<Integer> root = new KNode<>(1);
        KAryTree kAryTree = new KAryTree();
        kAryTree.setRoot(root);
        assertEquals("Root: 1 \n" +
                "Children: []", String.valueOf(kAryTree.treeFizzBuzz(kAryTree)));
        root.addChild(new KNode<>(2));
        root.addChild(new KNode<>(3));

        root.addChild(new KNode<>(4));

        root.addChild(new KNode<>(5));



    }
}
