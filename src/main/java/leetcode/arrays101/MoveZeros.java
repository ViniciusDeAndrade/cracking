package leetcode.arrays101;

public class MoveZeros {
    public static void main(String[] args) {
        int nums[] = new int[]{0, 1, 0, 3, 12};
        System.out.println(moveZeros(nums));
    }

    public static int[] moveZeros(int[] nums) {
        if (nums.length == 0) return new int[]{0};

        for (int index = 0; index < nums.length - 1; index++) {
            if(nums[index] == 0) {

                int pointer = index + 1;
                while (pointer < nums.length -1 && nums[pointer] == 0) pointer++;

                int aux = nums[index];
                nums[index] = nums[pointer];
                nums[pointer] = aux;
            }
        }

        return nums;
    }
}
