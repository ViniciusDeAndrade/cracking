package leetcode.tree;

import leetcode.TreeNode;

import java.util.Arrays;

public class ConstructTree {

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length == 0 || postorder.length == 0) return null;

        TreeNode root = new TreeNode(postorder[postorder.length - 1]);
        if(postorder.length == 1) return root;

        int index = 0;
        for(int val : inorder){
            if(val == root.val) break;
            index++;
        }

        root.left = buildTree(
                Arrays.copyOfRange(inorder, 0, index),
                Arrays.copyOfRange(postorder, 0, index)
        );
        root.right = buildTree(
                Arrays.copyOfRange(inorder, index + 1, inorder.length),
                Arrays.copyOfRange(postorder, index, postorder.length - 1))
        ;

        return root;
    }

    public static void main(String[] args) {
        int [] inorder = {9,3,15,20,7};
        int [] postorder = {9,15,7,20,3};

        ConstructTree tree = new ConstructTree();

        tree.buildTree(inorder, postorder);
    }
}
