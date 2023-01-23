package leetcode.programmins.skills;

public class MonotonicArray {

    public static void main(String[] args) {
        int [] nums = {1, 3 , 2};
        System.out.println(isMonotonic(nums));
    }
    public static boolean isMonotonic(int[] nums) {
        boolean isIncreasing = nums[0] < nums[nums.length - 1];

        if(isIncreasing) {
            for(int index = 0; index < nums.length - 1; index++)
                if(nums[index] > nums[index + 1])
                    return false;
        } else {
            for (int index = nums.length - 1; index >= 1; index--)
                if (nums[index] > nums[index - 1])
                    return false;
        }

        return true;
    }
}
