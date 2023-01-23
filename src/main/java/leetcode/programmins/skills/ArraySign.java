package leetcode.programmins.skills;

import java.util.stream.IntStream;

public class ArraySign {

    public static void main(String[] args) {
        int []nums = {7,36,96,70,85,23,5,18,4,12,89,92,9,30,53,14,96,32,13,43,37,60,75,7,83,68,20,8,-24,-80,-27,-92,-96,-20,-16,-52,-49,-38};
        System.out.println(arraySign(nums));
    }

    public static int arraySign(int[] nums) {

        int prd = 1;

        for (int num: nums) {
            if(num == 0) return 0;
            prd *= num;

        }
        return prd > 0 ? 1 : -1;
    }
}
