package leetcode.arrays101;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class SortedSquares {
    public static void main(String[] args) {
        int nums[] = new int[]{-7, -2 , -1 , 5};
        System.out.println(Arrays.toString(solution(nums)));
    }

    public static int[] solution(int[] nums) {
        return Arrays.stream(nums)
                .map(num -> num * num)
                .sorted()
                .toArray();
    }
}
