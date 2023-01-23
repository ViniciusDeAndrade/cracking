package leetcode.tree;

import leetcode.TreeNode;

//balanced binary tree
public class SortedArrayToBST {

    private int nums [];

    public TreeNode sortedArrayToBST(int[] nums) {
        this.nums = nums;
        return helper(0, nums.length -1);
    }

    private TreeNode helper(int left, int right) {
        if(left > right) return  null;

        int middle = left + right / 2;

        TreeNode root = new TreeNode(nums[middle]);
        root.left = helper(left, middle - 1);
        root.right = helper(middle + 1, right);

        return root;


    }

//    public TreeNode sortedArrayToBST(int[] nums) {
//        int len = nums.length;
//        int middle = len/2;
//        TreeNode root = new TreeNode(nums[middle]);
//
//        for (int index = 0; index < len; index ++) {
//            if(index != middle)
//                helper(root, nums[index]);
//        }
//
//        return root;
//
//    }
//
//    public TreeNode helper(TreeNode node, int val) {
//        if(node == null) return null;
//        if(node.val < val) {
//            node.left = new TreeNode(val);
//            return helper(node.left, node.left.val);
//        } else {
//            node.right = new TreeNode(val);
//            return helper(node.right, node.right.val);
//        }
//
//    }
}
