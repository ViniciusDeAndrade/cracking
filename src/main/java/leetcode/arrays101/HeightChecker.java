package leetcode.arrays101;

import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        int nums[] = new int[]{3, 2, 2, 3};
        System.out.println(heightChecker(nums));
    }

    public static int heightChecker(int[] heights) {
            var sorted = Arrays.stream(heights).sorted().toArray();
            int counter = 0;
            for(int index = 0; index < heights.length; index++) {
                if(heights[index] != sorted[index]) counter++;
            }
            return counter;
    }
}

