package leetcode.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {8, 9, 9, 9};
//        int[] digits = {7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1, 1, 1, 7, 4, 0, 0, 6};
        System.out.println(plusOne(digits));
    }

    public static int[] plusOne(int[] digits) {
        int len = digits.length;
        if(digits[len - 1] != 9) {
            digits[len - 1] += 1;
            return digits;
        }

        while(len > 0) {
            if(digits[len - 1] != 9) {
                digits[len - 1] += 1;
                return digits;
            };
            digits[len - 1] = 0;
            len--;
        }

        int result[] = new int[len + 1];
        Arrays.fill(result, 0);
        result[0] = 1;

        return result;
    }
}

