package leetcode.amazon;

import java.util.Arrays;

public class RunningSum1DArray {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
    public static int[] runningSum(int[] nums) {
        int result [] = new int[nums.length];
        result[0] = nums[0];
        for (int index = 1; index < nums.length ; index++) {
            result[index] = nums[index] + result[index - 1];
        }
        return result;
    }
}
