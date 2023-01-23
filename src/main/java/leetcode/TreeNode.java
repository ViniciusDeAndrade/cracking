package leetcode;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;


    public TreeNode() {}
    public TreeNode(int val) { this.val = val; }
    public TreeNode(TreeNode left, TreeNode right, int val) {
        this.left = left;
        this.val = val;
        this.right = right;
    }
}
