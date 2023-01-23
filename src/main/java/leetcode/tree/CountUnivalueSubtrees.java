package leetcode.tree;


import leetcode.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class CountUnivalueSubtrees {

    private Map<Integer, Integer> memo = new HashMap<>();

    public int countUnivalSubtrees(TreeNode root) {
        if(root == null) return 0;

        memo.put(root.val, memo.getOrDefault(root.val, 0) + 1);

        int lc = countUnivalSubtrees(root.left);
        int rc = countUnivalSubtrees(root.right);

        int maxOccurrences = memo.values().stream().max(Integer::max).get();

        return maxOccurrences;

    }
}
