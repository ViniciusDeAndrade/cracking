package leetcode.tree;

import leetcode.TreeNode;

public class LCA {
    TreeNode answer;
    int counter = 0;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        answer = root;
        helper(root, p, q);
        return answer;
    }

    private TreeNode helper(TreeNode node, TreeNode p, TreeNode q) {
        if (counter == 2) return node;

        if (node.val == q.val || node.val == p.val) {
            counter++;
        }

        if (node.left != null) return helper(node.left, p, q);
        if (node.right != null) return helper(node.right, p, q);
        return node;
    }

    public static void main(String[] args) {
        Integer arr[] = {3, 5, 1, 6, 2, 0, 8, null, null, 7, 4};
        int p = 5;
        int q = 1;
    }
}
