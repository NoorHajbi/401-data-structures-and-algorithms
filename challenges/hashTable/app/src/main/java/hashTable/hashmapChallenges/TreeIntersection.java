package hashTable.hashmapChallenges;


import java.util.*;

public class TreeIntersection {

    private HashMap<Object, Integer> addTreeToHashMap(BinaryTree tree) {
        HashMap<Object, Integer> entrySet = new HashMap<>();
        for (Object o : tree.inOrder()) {
            entrySet.put(o, 0);
        }
        return entrySet;
    }

    public List<Object> treeIntersection(BinaryTree tree1, BinaryTree tree2) {
        if (tree1.getRoot() == null && tree2.getRoot() == null)
            return null;
        List<Object> intersection = new ArrayList<>();
        HashMap<Object, Integer> tree2Set = addTreeToHashMap(tree2);
        List<Integer> arrayLoop = new ArrayList<>(tree1.breadthFirst(tree1));

        for (Object o : arrayLoop) {
            if (tree2Set.containsKey(o)) {
                intersection.add(o);
            }
        }
        return intersection;
    }

}
