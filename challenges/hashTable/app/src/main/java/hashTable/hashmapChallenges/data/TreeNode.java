package hashTable.hashmapChallenges.data;

public class TreeNode {
    private final int value;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int key) {
        this.value = key;
    }

    public TreeNode(TreeNode left, int key, TreeNode right) {
        this.left = left;
        this.value = key;
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "value=" + value +
                '}';
    }
}
