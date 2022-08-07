package leetcode;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TwoSum {

    public static void main(String[] args) {

    }
    public int[] twoSum(int[] nums, int target) {
        var list = Arrays.stream(nums).boxed()
                .filter(num -> num < target)
                .collect(Collectors.toList());

        for (int index = 0; index < list.size() ; index++) {

        }

        return null;
    }
}
