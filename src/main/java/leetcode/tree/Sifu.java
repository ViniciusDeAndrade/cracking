package leetcode.tree;

import leetcode.TreeNode;

public class Sifu {
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        var left = root.left;
        var right = root.right;
        return root.val > left.val
                && root.val < right.val
                && isValidBST(root.left)
                && isValidBST(root.right);
    }
}
