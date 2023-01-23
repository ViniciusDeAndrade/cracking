package leetcode.arrays101;

import java.util.stream.IntStream;

public class ReplaceElements {
    public static void main(String[] args) {
        int nums[] = new int[]{17, 18, 5, 4, 6, 1};
        int nums2[] = new int[]{17, 18, 5, 4, 6, 1};
        int nums3[] = new int[]{56903, 18666, 60499, 57517, 26961};
        int nums4[] = new int[]{57010,40840,69871,14425,70605};
        System.out.println(replaceElements(nums4));
    }

    public static int[] replaceElements(int[] arr) {
        var len = arr.length;
        if (len == 1) return new int[]{-1};
        int lastVal = arr[len - 1];

        int index = 0;
        while (index < len - 1) {
            int rightPointer = index + 1;
            int maxOnRight = 0;
            while (rightPointer < len ) {
                maxOnRight = Math.max(arr[rightPointer], maxOnRight);
                rightPointer++;
            }
            arr[index] = Math.max(arr[index + 1], maxOnRight);
            index++;
        }
        arr[len - 2] = lastVal;
        arr[len - 1] = -1;
        return arr;
    }
}
