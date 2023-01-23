package leetcode.arrays101;

import java.util.Comparator;
import java.util.stream.IntStream;

public class SortByParity {
    public static void main(String[] args) {
        int nums[] = new int[]{3, 1, 2, 4};
        System.out.println(sortArrayByParity(nums));
    }

    public static int[] sortArrayByParity(int[] nums) {
//        int length = nums.length;
//        if (length == 0) return nums;
//
//        int result[] = new int[length];
//
//        int evens = 0;
//
//        for (int index = 0; index < length; index++)
//            if (nums[index] % 2 == 0) {
//                result[evens] = nums[index];
//                evens++;
//            }
//
//        int odds = evens;
//
//        for (int index = 0; index < length; index++)
//            if (nums[index] % 2 == 1) {
//                result[odds] = nums[index];
//                odds++;
//            }
//        return result;
        return IntStream.of(nums)
                .boxed()
                .sorted(Comparator.comparingInt(a -> a % 2))
                .mapToInt(i -> i)
                .toArray();
    }
}
