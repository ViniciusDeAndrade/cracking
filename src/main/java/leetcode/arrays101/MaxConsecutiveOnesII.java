package leetcode.arrays101;


import java.util.LinkedList;
import java.util.List;

public class MaxConsecutiveOnesII {
    public static void main(String[] args) {
        int nums[] = new int[]{1, 0, 1, 1, 0, 1};
        int nums2[] = new int[]{1, 0, 1, 1, 0};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        if (nums.length == 0) return 1;
        int maxConsecutiveOnes = 0;

        List<Integer> zeroIndexes = new LinkedList<>();

        for(int index = 0; index < nums.length ; index++)
            if(nums[index] == 0) {
                zeroIndexes.add(index);
            }

        if(zeroIndexes.size() == 1) return nums.length;

        for(int index = 1; index < zeroIndexes.size() ; index++)
            maxConsecutiveOnes = Math.max(maxConsecutiveOnes, nums.length - zeroIndexes.get(index));



        return maxConsecutiveOnes;
    }
}

