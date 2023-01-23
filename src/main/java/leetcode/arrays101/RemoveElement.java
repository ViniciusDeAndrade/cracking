package leetcode.arrays101;

import java.util.Comparator;
import java.util.stream.IntStream;

public class RemoveElement {
    public static void main(String[] args) {
        int nums[] = new int[]{3, 2, 2, 3};
        System.out.println(removeElement(nums, 3));
    }

    public static int removeElement(int[] nums, int val) {
        int k = 0;

        for (int index = 0; index < nums.length; index++){
            if(nums[index] != val) {
                nums[k] = nums[index];
                k++;
            }
        }

        return k;
    }
}
