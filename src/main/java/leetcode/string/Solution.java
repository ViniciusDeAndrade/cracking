package leetcode.string;

import java.util.stream.IntStream;

class Solution {

    private int sumDigit(int num) {
        boolean flag = num < 0;
        int result = 0;
        num = Math.abs(num);

        result = String.valueOf(num)
                .chars()
                .map(Character::getNumericValue)
                .sum();


        if(flag) result *= -1;
        return result;

    }


    public int differenceOfSum(int[] nums) {
        int sumNums = IntStream.of(nums).sum();
        int sumDigits = 0;

        for (int index = 0; index < nums.length; index++) {
            int num = nums[index];

            if (num > 9 || num < -9)
                sumDigits += this.sumDigit(num);
            else
                sumDigits += nums[index];

        }
        return Math.abs(sumNums - sumDigits);
    }

}
