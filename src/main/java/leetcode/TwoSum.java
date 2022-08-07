package leetcode;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TwoSum {

    public static void main(String[] args) {
        int input1[] = { 2, 7 , 11 , 15}; //target 9
        int input2[] = { 3, 2, 4}; //target 6
        int input3[] = { 3, 3 }; //target 6
        int input4[] = { 2, 5 , 5 , 11 }; //target 10

        var res1 = twoSum(input1, 9);
        var res2 = twoSum(input2, 6);
        var res3 = twoSum(input3, 6);
        var res4 = twoSum(input4, 10);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);
    }
    public static int[] twoSum(int[] nums, int target) {
        var list = Arrays.stream(nums).boxed()
                .filter(num -> num < target)
                .collect(Collectors.toList());

        int result [] = {0, 0};

        int leftPointer = 0;
        int rightPointer = 1;
        while (leftPointer < list.size() && rightPointer < list.size()) {
            if(list.get(leftPointer) + list.get(rightPointer) == target) {
                result[0] = leftPointer;
                result[1] = rightPointer;
                return result;
            }

            if(list.get(leftPointer) + list.get(rightPointer) > target) {
                leftPointer ++;
                continue;
            }

            if(list.get(leftPointer) + list.get(rightPointer) < target) {
                if(rightPointer == list.size() -1) leftPointer++;
                else rightPointer++;
            }

        }

        return result;
    }
}
