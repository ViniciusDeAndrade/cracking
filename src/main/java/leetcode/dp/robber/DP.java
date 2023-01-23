package leetcode.dp.robber;

public class DP {
    public static void main(String[] args) {
        int [] sample1 = {1,2,3,1};
        int [] sample2 = {2,7,9,3,1};
        int [] sample3 = {2,1,1,2};
        System.out.println(rob(sample1)); //4
        System.out.println(rob(sample2)); //12
    }

    public static int rob(int [] nums) {
        int length = nums.length;
        if(length == 1) return nums[0];
        if(length == 2) return Math.max(nums[0], nums[1]);
        if(length == 3) return Math.max(nums[0] + nums[2], nums[1]);

        int acc1 = nums[0];
        int acc2 = nums[1];

        for(int index = 2; index < length - 2 ; index+=2){
            acc1+=nums[index];
            acc2+=nums[index + 1];

        }

        if(length % 2 == 1) acc1 += nums[length - 1];

        return Math.max(acc1, acc2);

    }
}
