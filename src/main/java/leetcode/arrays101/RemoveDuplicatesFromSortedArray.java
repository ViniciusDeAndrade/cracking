package leetcode.arrays101;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int nums[] = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {

        int len = 1;
        for (int index = 1; index < nums.length; index++)
            if(nums[index] != nums[index - 1]) {
                nums[len] = nums[index];
                len++;
            }

        return len;
    }
}
