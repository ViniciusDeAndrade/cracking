package leetcode.arrays101;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MergeSortedArray {
    public static void main(String[] args) {
        int nums1[] = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int nums2[] = {2, 5, 6};
        int n = 3;
        merge(nums1, m, nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        nums1 = IntStream
                .concat(
                        Arrays.stream(nums1),
                        Arrays.stream(nums2)
                )
                .filter(el -> el != 0)
                .sorted()
                .toArray();

        for (int num: nums1) {

            System.out.println(num);
        }
    }
}
