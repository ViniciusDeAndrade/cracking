package leetcode.programmins.skills;

import java.util.Arrays;

public class CanMakeArithmeticProgression {

    public static void main(String[] args) {
        int []nums = {3, 5, 1};
        System.out.println(canMakeArithmeticProgression(nums));
    }

    public static boolean canMakeArithmeticProgression(int[] arr) {
        if(arr.length == 2) return true;
        Arrays.sort(arr);
        int progression = arr[0] - arr[1];

        for(int index = 1; index < arr.length - 1; index++) {
            if(Math.abs(arr[index] - arr[index + 1]) != Math.abs(progression)) return false;
        }

        return true;

    }
}
