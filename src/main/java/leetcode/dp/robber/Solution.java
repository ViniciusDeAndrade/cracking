package leetcode.dp.robber;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {


    private int memo[] = new int[100];

    public int robFrom(int index, int nums[]) {

        // No more houses left to examine.
        if (index >= nums.length) {
            return 0;
        }

        // Return cached value.
        if (this.memo[index] > -1) {
            return this.memo[index];
        }

        // Recursive relation evaluation to get the optimal answer.
        int ans = Math.max(this.robFrom(index + 1, nums), this.robFrom(index + 2, nums) + nums[index]);

        // Cache for future use.
        this.memo[index] = ans;
        return ans;

    }


    public int rob(int nums[]) {
        Arrays.fill(this.memo, -1);
        return robFrom(0, nums);
    }

    public static void main(String[] args) {
        int [] sample1 = {1,2,3,1};
        int [] sample2 = {2,7,9,3,1};
        int [] sample3 = {2,1,1,2};

        var solution = new Solution();
        System.out.println(solution.rob(sample1)); //4
//        System.out.println(rob(sample2)); //12
    }
}
