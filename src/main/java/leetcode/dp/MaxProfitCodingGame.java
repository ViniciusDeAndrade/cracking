package leetcode.dp;

public class MaxProfitCodingGame {
    //TODO
    public int[] maxProfit(int[] nums) {

        int rightPointer = nums.length - 1;
        int leftPointer = 0;
        boolean flag = false;

        int acc = Integer.MIN_VALUE;
        int[] result = new int[2];

        while (leftPointer < rightPointer) {
            flag = !flag;
            int localAcc = 0;
            for (int index = leftPointer; index <= rightPointer; index++) {
                localAcc+= nums[index];
            }

            if(localAcc > acc) {
                acc = localAcc;
                result[0] = leftPointer;
                result[1] = rightPointer;
            }


            if(flag) rightPointer--;
            else leftPointer++;
        }

        return result;
    }



    public static void main(String[] args) {
        int nums [] = new int[] {-1, 9, 0, 8, -5, 6, -24} ;
        MaxProfitCodingGame profit = new MaxProfitCodingGame();
        profit.maxProfit(nums);
    }
}
