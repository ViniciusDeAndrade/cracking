package leetcode.array;

import java.util.Arrays;

public class SearchInsert {
    public static int searchInsert(int[] nums, int target) {
        int len = nums.length;
        int res = Arrays.binarySearch(nums, target);

        if(res > -1) return res;

        if(len < target) return len;
        return target - 1;
    }

    public static void main(String[] args) {
        int [] nums = new int[]{1,3,5,6};
        searchInsert(nums, 2);
    }
}
