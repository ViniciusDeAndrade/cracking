package leetcode.arrays101;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindAllNumbersDisappearedInAnArray {
    public static void main(String[] args) {
        int[] nums = new int[]{ 1, 1};
        int[] nums2 = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDisappearedNumbers(nums2));

    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        var result = IntStream
                .rangeClosed(1, nums.length)
                .boxed()
                .collect(Collectors.toSet());

        for (int index = 0; index < nums.length; index++)
            if(result.contains(nums[index]))
                result.remove((Object) nums[index]);


        return new ArrayList<>(result);

    }
}
