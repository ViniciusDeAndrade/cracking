package leetcode.arrays101;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ThirdMax {
    public static void main(String[] args) {


        int nums[] = new int[]{1, 2, 10, 4, 5};
        int nums2[] = new int[]{3, 2, 1};
        int nums3[] = new int[]{2, 2, 3, 1};
        System.out.println(thirdMax(nums));
        System.out.println(thirdMax(nums2));
        System.out.println(thirdMax(nums3));
    }

    public static int thirdMax(int[] nums) {
        nums = Arrays.stream(nums).distinct().sorted().toArray();
        if (nums.length == 2) return Math.max(nums[0], nums[1]);
        if (nums.length == 1) return nums[0];

        return nums[nums.length - 3];

    }
}
