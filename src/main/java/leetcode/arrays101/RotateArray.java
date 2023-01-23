package leetcode.arrays101;

import leetcode.ListNode;

import java.util.LinkedList;
import java.util.List;

public class RotateArray {
    public static int[] rotate(int[] nums, int k) {
        if(k == 0) return nums;
        int len = nums.length;

        k %= len;

        while(k >= 0) {
            int aux = nums[0];
            for(int index = 0; index < len - 1; index++)
                nums[index] = nums[index + 1];

            nums[len - 1] = aux;

            k--;
        }

        return nums;

    }

    public static void main(String[] args) {
        int [] nums = new int[]{1,2,3,4,5,6,7} ;
        int k = 3;

        nums = rotate(nums, 1);

        System.out.println(nums);
    }
}
